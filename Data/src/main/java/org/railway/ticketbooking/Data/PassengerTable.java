package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the passenger_table database table.
 * 
 */
@Entity
@Table(name="passenger_table")
@NamedQuery(name="PassengerTable.findAll", query="SELECT p FROM PassengerTable p")
public class PassengerTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="passenger_id")
	private String passengerId;

	@Column(name="passenger_age")
	private int passengerAge;

	@Column(name="passenger_gender")
	private String passengerGender;

	@Column(name="passenger_name")
	private String passengerName;

	//bi-directional many-to-one association to TicketTable
	@ManyToOne
	@JoinColumn(name="pnr")
	private TicketTable ticketTable;

	//bi-directional many-to-one association to SeatsTable
	@ManyToOne
	@JoinColumn(name="seat_id")
	private SeatsTable seatsTable;

	public PassengerTable() {
	}

	public String getPassengerId() {
		return this.passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public int getPassengerAge() {
		return this.passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerGender() {
		return this.passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public String getPassengerName() {
		return this.passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public TicketTable getTicketTable() {
		return this.ticketTable;
	}

	public void setTicketTable(TicketTable ticketTable) {
		this.ticketTable = ticketTable;
	}

	public SeatsTable getSeatsTable() {
		return this.seatsTable;
	}

	public void setSeatsTable(SeatsTable seatsTable) {
		this.seatsTable = seatsTable;
	}

}