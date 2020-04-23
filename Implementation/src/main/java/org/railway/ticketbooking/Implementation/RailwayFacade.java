package org.railway.ticketbooking.Implementation;

import java.util.List;

import org.railway.ticketbooking.DAO.CustomerDAO;
import org.railway.ticketbooking.Data.CustomerTable;
import org.railway.ticketbooking.Schemas.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//TODO: add validation
//TODO: add security
//TODO: logging
//TODO: Exception Handling
@Component
public class RailwayFacade {
	@Autowired
	private APIResponse apiresponse;
	@Autowired
	private CustomerDAO customerDAO;
	public APIResponse process (APIRequest apireq) {
		System.out.println("Processing request for " + apireq.getMetadata().get("operationName"));
		
		if (apireq.getMetadata().get("operationName").equals("createCustomer")) {
			Iterable<CustomerTable> customers = customerDAO.findAll();
			for (CustomerTable t : customers) {
				System.out.println(t);
				}
			apiresponse = new Status(200,"Success","User Created Successfully");
			return apiresponse;
		}
		
		return null;
	}

}
