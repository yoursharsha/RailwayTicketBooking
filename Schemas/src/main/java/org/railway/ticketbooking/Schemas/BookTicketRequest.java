package org.railway.ticketbooking.Schemas;

import java.util.Date;
import java.util.List;

public class BookTicketRequest extends APIRequest{

	private long train_number;
	private String bogie_type;
	private String from_station;
	private String to_station;
	private Date journey_date;
	private long mobile_num;
	private List<Passenger> passengers;
	
	public long getTrain_number() {
		return train_number;
	}
	public void setTrain_number(long train_number) {
		this.train_number = train_number;
	}
	public String getBogie_type() {
		return bogie_type;
	}
	public void setBogie_type(String bogie_type) {
		this.bogie_type = bogie_type;
	}
	public String getFrom_station() {
		return from_station;
	}
	public void setFrom_station(String from_station) {
		this.from_station = from_station;
	}
	public String getTo_station() {
		return to_station;
	}
	public void setTo_station(String to_station) {
		this.to_station = to_station;
	}
	public Date getJourney_date() {
		return journey_date;
	}
	public void setJourney_date(Date journey_date) {
		this.journey_date = journey_date;
	}
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	

}
