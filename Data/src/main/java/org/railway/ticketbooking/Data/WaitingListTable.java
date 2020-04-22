package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the waiting_list_table database table.
 * 
 */
@Entity
@Table(name="waiting_list_table")
@NamedQuery(name="WaitingListTable.findAll", query="SELECT w FROM WaitingListTable w")
public class WaitingListTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bogie_type")
	private BigInteger bogieType;

	@Temporal(TemporalType.DATE)
	@Column(name="journey_date")
	private Date journeyDate;

	@Column(name="waiting_id")
	private BigInteger waitingId;

	//bi-directional many-to-one association to TicketTable
	@ManyToOne
	@JoinColumn(name="pnr")
	private TicketTable ticketTable;

	//bi-directional many-to-one association to TrainTable
	@ManyToOne
	@JoinColumn(name="train_number")
	private TrainTable trainTable;

	public WaitingListTable() {
	}

	public BigInteger getBogieType() {
		return this.bogieType;
	}

	public void setBogieType(BigInteger bogieType) {
		this.bogieType = bogieType;
	}

	public Date getJourneyDate() {
		return this.journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public BigInteger getWaitingId() {
		return this.waitingId;
	}

	public void setWaitingId(BigInteger waitingId) {
		this.waitingId = waitingId;
	}

	public TicketTable getTicketTable() {
		return this.ticketTable;
	}

	public void setTicketTable(TicketTable ticketTable) {
		this.ticketTable = ticketTable;
	}

	public TrainTable getTrainTable() {
		return this.trainTable;
	}

	public void setTrainTable(TrainTable trainTable) {
		this.trainTable = trainTable;
	}

}