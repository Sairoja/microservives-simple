     package com.testrest;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import com.google.gson.Gson;

@Path("/myproduct")
public class ProductService {
@GET	
@Path("/productdetails")
@Produces(MediaType.TEXT_PLAIN)
	public String getProductDetails()
	{
		Productdao productdao=new Productdao();
		Map<Integer,String> productList = productdao.productDetails();
		System.out.println("hello"+productList);
		
		Gson gson=new Gson();	
		String productListInString= gson.toJson(productList);
		return productListInString;
	}
@GET
@Path("/connectUrl")
@Produces(MediaType.TEXT_PLAIN)
public String connectUrl()
{
	String response = null;
	try{
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/Restfulwebservice/rest/hello/helloworldmsg");
		/*WebResource webResource = client.resource("http://api.openweathermap.org/data/2.5/forecast/daily");*/
		webResource.setProperty("Content-Type", "application/json;charset=UTF-8");
		/*String authorization = "PASTE_KEY_HERE";
		webResource.setProperty("Authorization", authorization);
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		queryParams.add("json", js);
		String jsonString = webResource.get(String.class);}catch (Exception e){System.out.println (e.getMessage());}
}*/		response = webResource.method("GET",(String.class));
		return response;
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return response;
}	
}
