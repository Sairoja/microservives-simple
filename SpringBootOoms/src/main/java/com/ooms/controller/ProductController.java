package com.ooms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ooms.model.OutputFormat;
import com.ooms.model.Product;
import com.ooms.service.ProductService;

@RestController
public class ProductController {
	@Autowired 
	private ProductService productService;

	@RequestMapping(method=RequestMethod.GET,value="/getAllProducts")
	
		public List<Product> getAllProducts()
		{
			List<Product> productsList=productService.getProductsfromDB();
			return productsList;
		}
	
	//insert the product 
	@RequestMapping(method=RequestMethod.POST,value="/insertProduct")
	public void insertProduct(@RequestBody Product p)
	{
		System.out.println("in project controller");
		productService.insertProduct(p);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,value="/updateProduct")
	public Product updateProduct(@RequestBody Product p)
	{
		Product products=productService.updateProduct(p);
		return products;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="getProductById/{productId}")
	public Optional<Product> getProductById(@PathVariable(value="productId") int productid, Product p)
	{
		Optional<Product> product=productService.getProductById(productid);
		return product;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="getProductResultInBoolean/{productId}")
	public Object getProductResultInBoolean(@PathVariable(value="productId") int productid)
	{
		//System.out.println(productService.getProductResultInBoolean(productid)+"pro");
		OutputFormat format=productService.getProductResultInBoolean(productid);
		Gson gson = new Gson();
		Object request = gson.toJson(format);
		System.out.println(format.getStatus());
		return request;
		
	}
	@RequestMapping(method=RequestMethod.GET,value="/error")
	public void error()
	{
		System.out.println("hello catch error");
	}
	
	
	
}