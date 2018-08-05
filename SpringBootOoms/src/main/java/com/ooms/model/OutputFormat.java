package com.ooms.model;

public class OutputFormat {
	
	private String status;
	private boolean booleanresult;
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean isBooleanresult() {
		return booleanresult;
	}


	public void setBooleanresult(boolean booleanresult) {
		this.booleanresult = booleanresult;
	}


	public String toString()
	{
		return status+"status"+booleanresult;
	}
}
