package org.railway.ticketbooking.Schemas;

public class CreateCustomerRequest extends APIRequest{

	private String cust_login_id;
	private String customer_name;
	private String password;
	private long mobile_num;
	private String email_id;
}
