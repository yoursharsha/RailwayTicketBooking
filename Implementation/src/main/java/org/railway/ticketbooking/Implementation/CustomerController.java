package org.railway.ticketbooking.Implementation;

import org.railway.ticketbooking.Interfaces.Customer;
import org.railway.ticketbooking.Schemas.APIRequest;
import org.railway.ticketbooking.Schemas.CreateCustomerRequest;
import org.railway.ticketbooking.Schemas.GetAllTicketsResponse;
import org.railway.ticketbooking.Schemas.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/railway")
public class CustomerController implements Customer{
	@Autowired
	private RailwayFacade railFacadeObj;
	 
	@Override
	@PostMapping("/customers")
	
	public Status createUser(CreateCustomerRequest createcustreq) {
		createcustreq.getMetadata().put("operationName", "createCustomer");
	//	railFacadeObj.process(createcustreq);
		return (Status) railFacadeObj.process(createcustreq);
	}

	@Override
	public GetAllTicketsResponse getalltickets(String cust_login_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/testmodule")
	public String testResponse() {
		// TODO Auto-generated method stub
		return "Module Working";
	}
	
}
