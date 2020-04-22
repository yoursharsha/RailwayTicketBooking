package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the train_table database table.
 * 
 */
@Entity
@Table(name="train_table")
@NamedQuery(name="TrainTable.findAll", query="SELECT t FROM TrainTable t")
public class TrainTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="train_number")
	private String trainNumber;

	@Column(name="train_name")
	private String trainName;

	//bi-directional many-to-one association to StationsTable
	@OneToMany(mappedBy="trainTable")
	private List<StationsTable> stationsTables;

	//bi-directional many-to-one association to TrainDetailsTable
	@OneToMany(mappedBy="trainTable")
	private List<TrainDetailsTable> trainDetailsTables;

	//bi-directional many-to-one association to WaitingListTable
	@OneToMany(mappedBy="trainTable")
	private List<WaitingListTable> waitingListTables;

	public TrainTable() {
	}

	public String getTrainNumber() {
		return this.trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return this.trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public List<StationsTable> getStationsTables() {
		return this.stationsTables;
	}

	public void setStationsTables(List<StationsTable> stationsTables) {
		this.stationsTables = stationsTables;
	}

	public StationsTable addStationsTable(StationsTable stationsTable) {
		getStationsTables().add(stationsTable);
		stationsTable.setTrainTable(this);

		return stationsTable;
	}

	public StationsTable removeStationsTable(StationsTable stationsTable) {
		getStationsTables().remove(stationsTable);
		stationsTable.setTrainTable(null);

		return stationsTable;
	}

	public List<TrainDetailsTable> getTrainDetailsTables() {
		return this.trainDetailsTables;
	}

	public void setTrainDetailsTables(List<TrainDetailsTable> trainDetailsTables) {
		this.trainDetailsTables = trainDetailsTables;
	}

	public TrainDetailsTable addTrainDetailsTable(TrainDetailsTable trainDetailsTable) {
		getTrainDetailsTables().add(trainDetailsTable);
		trainDetailsTable.setTrainTable(this);

		return trainDetailsTable;
	}

	public TrainDetailsTable removeTrainDetailsTable(TrainDetailsTable trainDetailsTable) {
		getTrainDetailsTables().remove(trainDetailsTable);
		trainDetailsTable.setTrainTable(null);

		return trainDetailsTable;
	}

	public List<WaitingListTable> getWaitingListTables() {
		return this.waitingListTables;
	}

	public void setWaitingListTables(List<WaitingListTable> waitingListTables) {
		this.waitingListTables = waitingListTables;
	}

	public WaitingListTable addWaitingListTable(WaitingListTable waitingListTable) {
		getWaitingListTables().add(waitingListTable);
		waitingListTable.setTrainTable(this);

		return waitingListTable;
	}

	public WaitingListTable removeWaitingListTable(WaitingListTable waitingListTable) {
		getWaitingListTables().remove(waitingListTable);
		waitingListTable.setTrainTable(null);

		return waitingListTable;
	}

}