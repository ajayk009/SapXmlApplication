package com.softcell.gonogo.model.request;

import java.lang.reflect.Field;

import org.apache.commons.lang3.ArrayUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.holonplatform.datastore.mongo.sync.MongoDatastore;



public class Test
{
public static void main(String[] args) {
	
}
	@Autowired
	private MongoTemplate  mongoDataStore;
	
	
	public <E extends BaseEntity> Object persist(E entity) {
	    delta(entity);
	    mongoDataStore.save(entity);
	    return entity.getUuid();
	}
	
	protected <E extends BaseEntity> void delta(E newEntity) {

	    // If the entity is null or has no ID, it hasn't been persisted before,
	    // so there's no delta to calculate
	    if ((newEntity == null) || (newEntity.getUuid() == null)) {
	        return;
	    }

	    // Get the original entity
	    @SuppressWarnings("unchecked")
	    String oldEntity =  mongoDataStore.getCollectionName(newEntity.getClass());
	    
	
	    // Ensure that the old entity isn't null
	    if (oldEntity == null) {
	       
	        return;
	    }

	    // Get the current user and ensure it is not null
	    String email = "ajay";
	    System.out.println("");
	    
	 // Calculate the difference
	    // We need to fetch the fields from the parent entity as well as they
	    // are not automatically fetched
	    Field[] fields = ArrayUtils.addAll(newEntity.getClass().getDeclaredFields(),
	            BaseEntity.class.getDeclaredFields());
	    Object oldField = null;
	    Object newField = null;
	    StringBuilder delta = new StringBuilder();
	    for (Field field : fields) {
	        field.setAccessible(true); // We need to access private fields
	        try {
	            oldField = field.get(oldEntity);
	            newField = field.get(newEntity);
	        } catch (IllegalArgumentException e) {
	    
	            e.printStackTrace();
	        } catch (IllegalAccessException e) {
	      
	            e.printStackTrace();
	        }
	        
	        if ((oldField != newField)
	                && (((oldField != null) && !oldField.equals(newField)) || ((newField != null) && !newField
	                        .equals(oldField)))) {
	            delta.append(field.getName()).append(": [").append(oldField).append("] -> [")
	                    .append(newField).append("]  ");
	        }
	    }

	    // Persist the difference
	    if (delta.length() == 0) {
	    
	    } else {
	        
	        DeltaEntity deltaEntity = new DeltaEntity();
	        mongoDataStore.save(deltaEntity);
	    }
	    return;
	    
	}

}
