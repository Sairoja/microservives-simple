package com.ooms.Repository;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ooms.model.Product;

@Repository
public interface OomsRepository  extends JpaRepository<Product,Integer> {

	//public String getProductResultInBoolean(int productId);

/*@Query("select pro.productName from products pro where pro.productId=:productId")
public String getProductResultInBoolean(@Param(value = "productId") int productId);*/
	
public String findproductNameInBoolean(@Param(value = "productId") int productId);
}
		