package org.railway.ticketbooking.Schemas;

import java.util.Date;
import java.util.List;

public class Ticket {

	private long train_number;
	private String bogie_type;
	private String from_station;
	private String to_station;
	private Date journey_date;
	private long pnr;
	private List<Passenger> passengers;
}
