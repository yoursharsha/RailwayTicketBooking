package org.railway.ticketbooking.Schemas;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class APIRequest {
	private HashMap<String,String> metadata = new HashMap<String, String>() ;

	public HashMap<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(HashMap<String, String> metadata) {
		this.metadata = metadata;
	}
	
}
