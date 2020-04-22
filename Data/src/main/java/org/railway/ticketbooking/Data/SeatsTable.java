package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the seats_table database table.
 * 
 */
@Entity
@Table(name="seats_table")
@NamedQuery(name="SeatsTable.findAll", query="SELECT s FROM SeatsTable s")
public class SeatsTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="seat_id")
	private String seatId;

	@Column(name="bogie_number")
	private String bogieNumber;

	@Column(name="seat_booking_status")
	private String seatBookingStatus;

	@Column(name="seat_current_status")
	private String seatCurrentStatus;

	@Column(name="seat_num")
	private BigInteger seatNum;

	@Column(name="train_num")
	private BigInteger trainNum;

	//bi-directional many-to-one association to PassengerTable
	@OneToMany(mappedBy="seatsTable")
	private List<PassengerTable> passengerTables;

	//bi-directional many-to-one association to TicketTable
	@ManyToOne
	@JoinColumn(name="pnr")
	private TicketTable ticketTable;

	public SeatsTable() {
	}

	public String getSeatId() {
		return this.seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getBogieNumber() {
		return this.bogieNumber;
	}

	public void setBogieNumber(String bogieNumber) {
		this.bogieNumber = bogieNumber;
	}

	public String getSeatBookingStatus() {
		return this.seatBookingStatus;
	}

	public void setSeatBookingStatus(String seatBookingStatus) {
		this.seatBookingStatus = seatBookingStatus;
	}

	public String getSeatCurrentStatus() {
		return this.seatCurrentStatus;
	}

	public void setSeatCurrentStatus(String seatCurrentStatus) {
		this.seatCurrentStatus = seatCurrentStatus;
	}

	public BigInteger getSeatNum() {
		return this.seatNum;
	}

	public void setSeatNum(BigInteger seatNum) {
		this.seatNum = seatNum;
	}

	public BigInteger getTrainNum() {
		return this.trainNum;
	}

	public void setTrainNum(BigInteger trainNum) {
		this.trainNum = trainNum;
	}

	public List<PassengerTable> getPassengerTables() {
		return this.passengerTables;
	}

	public void setPassengerTables(List<PassengerTable> passengerTables) {
		this.passengerTables = passengerTables;
	}

	public PassengerTable addPassengerTable(PassengerTable passengerTable) {
		getPassengerTables().add(passengerTable);
		passengerTable.setSeatsTable(this);

		return passengerTable;
	}

	public PassengerTable removePassengerTable(PassengerTable passengerTable) {
		getPassengerTables().remove(passengerTable);
		passengerTable.setSeatsTable(null);

		return passengerTable;
	}

	public TicketTable getTicketTable() {
		return this.ticketTable;
	}

	public void setTicketTable(TicketTable ticketTable) {
		this.ticketTable = ticketTable;
	}

}