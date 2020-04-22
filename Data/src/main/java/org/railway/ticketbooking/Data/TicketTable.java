package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ticket_table database table.
 * 
 */
@Entity
@Table(name="ticket_table")
@NamedQuery(name="TicketTable.findAll", query="SELECT t FROM TicketTable t")
public class TicketTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String pnr;

	@Column(name="from_station")
	private String fromStation;

	@Temporal(TemporalType.DATE)
	@Column(name="journey_date")
	private Date journeyDate;

	private String status;

	@Column(name="to_station")
	private String toStation;

	//bi-directional many-to-one association to PassengerTable
	@OneToMany(mappedBy="ticketTable")
	private List<PassengerTable> passengerTables;

	//bi-directional many-to-one association to SeatsTable
	@OneToMany(mappedBy="ticketTable")
	private List<SeatsTable> seatsTables;

	//bi-directional many-to-one association to CustomerTable
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerTable customerTable;

	//bi-directional many-to-one association to WaitingListTable
	@OneToMany(mappedBy="ticketTable")
	private List<WaitingListTable> waitingListTables;

	public TicketTable() {
	}

	public String getPnr() {
		return this.pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getFromStation() {
		return this.fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public Date getJourneyDate() {
		return this.journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getToStation() {
		return this.toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public List<PassengerTable> getPassengerTables() {
		return this.passengerTables;
	}

	public void setPassengerTables(List<PassengerTable> passengerTables) {
		this.passengerTables = passengerTables;
	}

	public PassengerTable addPassengerTable(PassengerTable passengerTable) {
		getPassengerTables().add(passengerTable);
		passengerTable.setTicketTable(this);

		return passengerTable;
	}

	public PassengerTable removePassengerTable(PassengerTable passengerTable) {
		getPassengerTables().remove(passengerTable);
		passengerTable.setTicketTable(null);

		return passengerTable;
	}

	public List<SeatsTable> getSeatsTables() {
		return this.seatsTables;
	}

	public void setSeatsTables(List<SeatsTable> seatsTables) {
		this.seatsTables = seatsTables;
	}

	public SeatsTable addSeatsTable(SeatsTable seatsTable) {
		getSeatsTables().add(seatsTable);
		seatsTable.setTicketTable(this);

		return seatsTable;
	}

	public SeatsTable removeSeatsTable(SeatsTable seatsTable) {
		getSeatsTables().remove(seatsTable);
		seatsTable.setTicketTable(null);

		return seatsTable;
	}

	public CustomerTable getCustomerTable() {
		return this.customerTable;
	}

	public void setCustomerTable(CustomerTable customerTable) {
		this.customerTable = customerTable;
	}

	public List<WaitingListTable> getWaitingListTables() {
		return this.waitingListTables;
	}

	public void setWaitingListTables(List<WaitingListTable> waitingListTables) {
		this.waitingListTables = waitingListTables;
	}

	public WaitingListTable addWaitingListTable(WaitingListTable waitingListTable) {
		getWaitingListTables().add(waitingListTable);
		waitingListTable.setTicketTable(this);

		return waitingListTable;
	}

	public WaitingListTable removeWaitingListTable(WaitingListTable waitingListTable) {
		getWaitingListTables().remove(waitingListTable);
		waitingListTable.setTicketTable(null);

		return waitingListTable;
	}

}