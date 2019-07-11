package ddd;


import java.sql.Date;

public abstract class Transaction {

	private Integer transactionId;
	private Customer customer;
	private Date transactionDate;
	private Integer deliveryCharge;

	public Transaction(Integer transactionId, Customer customer,
					   Date transactionDate, Integer deliveryCharge) {
		this.transactionId = transactionId;
		this.customer = customer;
		this.transactionDate = transactionDate;
		this.deliveryCharge = deliveryCharge;
	}


	public abstract void calcDeliveryChange();

	protected Integer getDeliveryChargeByAddress() {
		if (customer == null) {
			return 1300;
		} else {
			return 700;
		}
	}


}
