package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the stations_table database table.
 * 
 */
@Entity
@Table(name="stations_table")
@NamedQuery(name="StationsTable.findAll", query="SELECT s FROM StationsTable s")
public class StationsTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="station_id")
	private String stationId;

	@Column(name="arraival_time")
	private Time arraivalTime;

	@Column(name="departure_time")
	private Time departureTime;

	@Column(name="station_name")
	private BigInteger stationName;

	//bi-directional many-to-one association to TrainTable
	@ManyToOne
	@JoinColumn(name="train_number")
	private TrainTable trainTable;

	//bi-directional many-to-one association to StationsTable
	@ManyToOne
	@JoinColumn(name="previous_station_id")
	private StationsTable stationsTable1;

	//bi-directional many-to-one association to StationsTable
	@OneToMany(mappedBy="stationsTable1")
	private List<StationsTable> stationsTables1;

	//bi-directional many-to-one association to StationsTable
	@ManyToOne
	@JoinColumn(name="next_station_id")
	private StationsTable stationsTable2;

	//bi-directional many-to-one association to StationsTable
	@OneToMany(mappedBy="stationsTable2")
	private List<StationsTable> stationsTables2;

	public StationsTable() {
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Time getArraivalTime() {
		return this.arraivalTime;
	}

	public void setArraivalTime(Time arraivalTime) {
		this.arraivalTime = arraivalTime;
	}

	public Time getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public BigInteger getStationName() {
		return this.stationName;
	}

	public void setStationName(BigInteger stationName) {
		this.stationName = stationName;
	}

	public TrainTable getTrainTable() {
		return this.trainTable;
	}

	public void setTrainTable(TrainTable trainTable) {
		this.trainTable = trainTable;
	}

	public StationsTable getStationsTable1() {
		return this.stationsTable1;
	}

	public void setStationsTable1(StationsTable stationsTable1) {
		this.stationsTable1 = stationsTable1;
	}

	public List<StationsTable> getStationsTables1() {
		return this.stationsTables1;
	}

	public void setStationsTables1(List<StationsTable> stationsTables1) {
		this.stationsTables1 = stationsTables1;
	}

	public StationsTable addStationsTables1(StationsTable stationsTables1) {
		getStationsTables1().add(stationsTables1);
		stationsTables1.setStationsTable1(this);

		return stationsTables1;
	}

	public StationsTable removeStationsTables1(StationsTable stationsTables1) {
		getStationsTables1().remove(stationsTables1);
		stationsTables1.setStationsTable1(null);

		return stationsTables1;
	}

	public StationsTable getStationsTable2() {
		return this.stationsTable2;
	}

	public void setStationsTable2(StationsTable stationsTable2) {
		this.stationsTable2 = stationsTable2;
	}

	public List<StationsTable> getStationsTables2() {
		return this.stationsTables2;
	}

	public void setStationsTables2(List<StationsTable> stationsTables2) {
		this.stationsTables2 = stationsTables2;
	}

	public StationsTable addStationsTables2(StationsTable stationsTables2) {
		getStationsTables2().add(stationsTables2);
		stationsTables2.setStationsTable2(this);

		return stationsTables2;
	}

	public StationsTable removeStationsTables2(StationsTable stationsTables2) {
		getStationsTables2().remove(stationsTables2);
		stationsTables2.setStationsTable2(null);

		return stationsTables2;
	}

}