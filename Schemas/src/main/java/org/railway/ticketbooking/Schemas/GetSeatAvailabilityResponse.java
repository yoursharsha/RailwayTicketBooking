package org.railway.ticketbooking.Schemas;

import java.io.ObjectInputStream.GetField;
import java.util.List;

public class GetSeatAvailabilityResponse extends APIResponse {
	private String train_number;
	private String train_name;
	private List<Availability> availability;

}
