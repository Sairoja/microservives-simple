package com.ooms.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity(name="products")
@Table(name="products")
@NamedQuery(name="Product.findproductNameInBoolean",query="select p.productName from products p where p.productId=:productId")
public class Product implements Serializable{

	//Product Properties
	@Id
	@Column(name="products_id")
	private Integer productId;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="productdesc")
	private String productDesc;
	
	@Column(name="productprice")
	private Double productPrice;
	
	@Column(name="imagename")
	private String imageName;
	
	@Column(name="isactive")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	//product getters and setters here
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productname) {
		this.productName = productname;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getimageName() {
		return imageName;
	}
	public void setimageName(String imageName) {
		this.imageName = imageName;
	}
	
	public String toString()
	{
	return productId+""+productName+""+productPrice+""+productDesc;
	}
}
