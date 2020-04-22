package org.railway.ticketbooking.Interfaces;

import org.railway.*;
import org.railway.ticketbooking.Schemas.CreateCustomerRequest;
import org.railway.ticketbooking.Schemas.GetAllTicketsResponse;
import org.railway.ticketbooking.Schemas.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/railway")
public interface Customer {
	
	@PostMapping("/customers")
	public Status createUser (@RequestBody CreateCustomerRequest custreq) ;
	
	@GetMapping("/customers/{cust_login_id}/tickets")
	public GetAllTicketsResponse getalltickets(@PathVariable String cust_login_id);
}

