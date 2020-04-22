package org.railway.ticketbooking.Interfaces;

import org.railway.ticketbooking.Schemas.GetSeatAvailabilityResponse;
import org.railway.ticketbooking.Schemas.ListTrainsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
public interface Train {
		
        @GetMapping("/trains")
 		public ListTrainsResponse listTrains(@RequestParam String from_station,@RequestParam String to_station,@RequestParam String journeyDate);
		
		@GetMapping("/trains/{train_number}/seats")
		public GetSeatAvailabilityResponse getSeats(@PathVariable String train_number) ;
}


