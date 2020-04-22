package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the train_details_table database table.
 * 
 */
@Entity
@Table(name="train_details_table")
@NamedQuery(name="TrainDetailsTable.findAll", query="SELECT t FROM TrainDetailsTable t")
public class TrainDetailsTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="train_detail_id")
	private String trainDetailId;

	@Column(name="available_seats")
	private BigInteger availableSeats;

	@Column(name="bogie_id")
	private BigInteger bogieId;

	@Column(name="bogie_number")
	private String bogieNumber;

	@Column(name="bogie_type")
	private String bogieType;

	@Temporal(TemporalType.DATE)
	@Column(name="journey_date")
	private Date journeyDate;

	@Column(name="num_of_seats")
	private BigInteger numOfSeats;

	//bi-directional many-to-one association to TrainTable
	@ManyToOne
	@JoinColumn(name="train_number")
	private TrainTable trainTable;

	public TrainDetailsTable() {
	}

	public String getTrainDetailId() {
		return this.trainDetailId;
	}

	public void setTrainDetailId(String trainDetailId) {
		this.trainDetailId = trainDetailId;
	}

	public BigInteger getAvailableSeats() {
		return this.availableSeats;
	}

	public void setAvailableSeats(BigInteger availableSeats) {
		this.availableSeats = availableSeats;
	}

	public BigInteger getBogieId() {
		return this.bogieId;
	}

	public void setBogieId(BigInteger bogieId) {
		this.bogieId = bogieId;
	}

	public String getBogieNumber() {
		return this.bogieNumber;
	}

	public void setBogieNumber(String bogieNumber) {
		this.bogieNumber = bogieNumber;
	}

	public String getBogieType() {
		return this.bogieType;
	}

	public void setBogieType(String bogieType) {
		this.bogieType = bogieType;
	}

	public Date getJourneyDate() {
		return this.journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public BigInteger getNumOfSeats() {
		return this.numOfSeats;
	}

	public void setNumOfSeats(BigInteger numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public TrainTable getTrainTable() {
		return this.trainTable;
	}

	public void setTrainTable(TrainTable trainTable) {
		this.trainTable = trainTable;
	}

}