package com.ibm.demo;
import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDbDemo 
{
	public static void main(String args[])
	
	{
		System.out.println("start");
		
	String url="mongodb://localhost:27017";
	
	System.out.println();
	
	MongoClient client=MongoClients.create(url);
	
	MongoDatabase database=client.getDatabase("sravya");
	
	MongoCollection<Document>collection= database.getCollection("restaurant");
	
			 long docCount=collection.countDocuments();
			 
			 System.out.println(docCount);
			 
			 FindIterable<Document>docs=collection.find();
			 
			 docs.forEach((d)->
			 {
				 System.out.println(d);
			 });
			 
		 Document doc=docs.first();
			 
			 System.out.println(doc);
			 
			 System.out.println("End");
			 
	
	
	}
}
