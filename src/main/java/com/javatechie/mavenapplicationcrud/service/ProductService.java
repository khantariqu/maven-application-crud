package com.javatechie.mavenapplicationcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.mavenapplicationcrud.entity.Product;
import com.javatechie.mavenapplicationcrud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return productRepo.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepo.findById(id).orElse(null);
	}
	
	public String deleteProductById(int id) {
		 productRepo.deleteById(id);
		 return "product removed :"+id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct=productRepo.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepo.save(existingProduct);
	}


}

