package com.microservices.product_service.service;

import com.microservices.product_service.dto.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.microservices.product_service.dto.ProductRequest;
import com.microservices.product_service.model.Product;
import com.microservices.product_service.repository.ProductRepository;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest) {
		Product product =Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		productRepository.save(product);
		log.info("Product {} is saved",product.getId());

		
	}


	public List<ProductResponse> getAllProducts() {

	}
}
