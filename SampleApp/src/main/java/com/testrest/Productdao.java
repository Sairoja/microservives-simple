package com.testrest;

import java.util.HashMap;
import java.util.Map;

public class Productdao {

	public Map<Integer,String> productDetails() {
		Map<Integer,String> myProduct=new HashMap<Integer,String>();
		myProduct.put(1,"product1");
		myProduct.put(2,"product2");
		myProduct.put(3,"product3");
		myProduct.put(4,"product4");
		myProduct.put(5,"product5");
		return myProduct;
	}
}
