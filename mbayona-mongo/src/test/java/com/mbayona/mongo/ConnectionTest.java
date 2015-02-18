package com.mbayona.mongo;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class ConnectionTest {
	
	private static final String LOCALHOST = "localhost";
	private static final String DATABASE_NAME = "mbayonaDatabase";

	private MongoClient client;
	

	@Test
	public void testDBConnection(){
		
		try {
			
			client = new MongoClient(LOCALHOST,27017);
			
			List<String> databaseNames = client.getDatabaseNames();
			
			Assert.assertNotNull(databaseNames);

			System.out.println("databaseNames : "+databaseNames.toString());
			
			DB db = client.getDB(DATABASE_NAME);
			
			DBCollection collection = db.getCollection("users");
			
			for (int i = 0 ; i <100 ; i++)
			{
			BasicDBObject document = new BasicDBObject();
			document.put("position", i);
			document.put("age", RandomUtils.nextInt(100));
			document.put("createdDate", new Date());
			collection.insert(document);
		}
			BasicDBObject document2 = new BasicDBObject();
			document2.put("position", 50);
			
			DBCollection collectionUpdated = db.getCollection("users");
			DBCursor find = collectionUpdated.find(document2);
			
			Assert.assertNotNull(find);
			
			long count = collection.getCount();
			
			System.out.println("count : " + count);
			
			while(find.hasNext()){
				System.out.println(find.next());
			}
			
			
		} catch (UnknownHostException e) {
			client.close();
			e.printStackTrace();
		}
		
		
		
	}
	

}
