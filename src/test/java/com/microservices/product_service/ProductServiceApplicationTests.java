package com.microservices.product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest
class ProductServiceApplicationTests {
	@Container
	static MongoDBContainer mongoDBContainer =new MongoDBContainer("mongo");

	static void setProperties(DynamicPropertyRegistry dynDynamicPropertyRegistry){
		dynDynamicPropertyRegistry.add("spring.data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);
	}
	@Test
	void contextLoads() {
	}

}
