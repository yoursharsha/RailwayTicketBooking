package org.railway.ticketbooking.Interfaces;

import org.railway.ticketbooking.Schemas.BookTicketRequest;
import org.railway.ticketbooking.Schemas.BookTicketResponse;
import org.railway.ticketbooking.Schemas.GetAllTicketsResponse;
import org.railway.ticketbooking.Schemas.GetPNRDetailsResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface Ticket {
	
	@PostMapping("/tickets")
	public BookTicketResponse bookTicket(@RequestBody BookTicketRequest booktickcetreq);
	
	@GetMapping("/tickets/{pnr}")
	public GetPNRDetailsResponse getPNR(@PathVariable String pnr);
	
	@DeleteMapping("/tickets/{pnr}")
	public int deletePNR(@PathVariable String pnr);
	
	@DeleteMapping("/tickets/{pnr}/passengers/{bogie_number}/{seat_num}")
	public int deletePNR(@PathVariable String pnr, @PathVariable String bogie_number, @PathVariable long seat_num);
	
}
