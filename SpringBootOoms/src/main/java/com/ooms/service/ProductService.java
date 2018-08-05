package com.ooms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ooms.Repository.OomsRepository;
import com.ooms.model.OutputFormat;
import com.ooms.model.Product;


@Service
public class ProductService {

	 @Autowired //injecting the beans(Dependency Injection)
	 private OomsRepository oomsRepository;
	 private OutputFormat of;


	
	public List<Product> getProductsfromDB()
	{
		
		List<Product> getAllProducts=oomsRepository.findAll();
	
		System.out.println(getAllProducts.toString());
		return (List<Product>) getAllProducts;	
		
	}
	
	public void insertProduct(Product p)
	{
		System.out.println(p.getProductName());
		System.out.println(p.getProductId());
		oomsRepository.save(p);
	}

	public Product updateProduct(Product p) {
		
		System.out.println("in update project ");
		Product product=oomsRepository.save(p);
		return product;
	}

	

	public Optional<Product> getProductById(int productid) {
		Optional<Product> pro=oomsRepository.findById(productid);
		return pro;
	}

	public OutputFormat getProductResultInBoolean(int productid) {
	 String result;
	 boolean resultboolean=false;
	 result=oomsRepository.findproductNameInBoolean(productid);
	 try {
	 if(result.equals(null))
	 {
		 resultboolean=false;
	 }
	 else if(result.equals("Floor Cleaner"))
	 {
		 resultboolean=true;
	 }
	 else
	 {
		resultboolean=false; 
	 }
	 of.setStatus("result");
	 of.setBooleanresult(resultboolean);
	 }
	 catch(NullPointerException e)
	 {
		 //e.printStackTrace();
		 System.out.println("no data found in db");
	 }
	 return of;
	}
	
}
