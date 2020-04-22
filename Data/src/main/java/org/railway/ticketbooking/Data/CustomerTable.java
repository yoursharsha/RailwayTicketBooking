package org.railway.ticketbooking.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the customer_table database table.
 * 
 */
@Entity
@Table(name="customer_table")
@NamedQuery(name="CustomerTable.findAll", query="SELECT c FROM CustomerTable c")
public class CustomerTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	private String customerId;

	@Column(name="cust_login_id")
	private String custLoginId;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="email_id")
	private String emailId;

	@Column(name="mobile_num")
	private BigInteger mobileNum;

	private String password;

	//bi-directional many-to-one association to TicketTable
	@OneToMany(mappedBy="customerTable")
	private List<TicketTable> ticketTables;

	public CustomerTable() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustLoginId() {
		return this.custLoginId;
	}

	public void setCustLoginId(String custLoginId) {
		this.custLoginId = custLoginId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigInteger getMobileNum() {
		return this.mobileNum;
	}

	public void setMobileNum(BigInteger mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TicketTable> getTicketTables() {
		return this.ticketTables;
	}

	public void setTicketTables(List<TicketTable> ticketTables) {
		this.ticketTables = ticketTables;
	}

	public TicketTable addTicketTable(TicketTable ticketTable) {
		getTicketTables().add(ticketTable);
		ticketTable.setCustomerTable(this);

		return ticketTable;
	}

	public TicketTable removeTicketTable(TicketTable ticketTable) {
		getTicketTables().remove(ticketTable);
		ticketTable.setCustomerTable(null);

		return ticketTable;
	}

}