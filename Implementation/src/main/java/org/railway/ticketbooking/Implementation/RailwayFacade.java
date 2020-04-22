package org.railway.ticketbooking.Implementation;

import org.railway.ticketbooking.Schemas.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RailwayFacade {
	
	public APIResponse process (APIRequest apireq) {
		System.out.println("Processing request for " + apireq.getMetadata().get("operationName"));
		if (apireq.getMetadata().get("operationName").equals("createCustomer")) {
			// add validation
			// add security
			// logging
			
			Status status = new Status(200,"Success","User Created Successfully");
			return status;
		}
		
		return null;
	}

}
