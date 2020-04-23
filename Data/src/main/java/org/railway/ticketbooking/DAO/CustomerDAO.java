package org.railway.ticketbooking.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.railway.ticketbooking.Data.CustomerTable;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerDAO extends CrudRepository<CustomerTable, String> {
	
}
