package myproj.cav.prog.iterator.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Fund {

	private int fundId;
	private String fundName;
	private BigDecimal price;
	private LocalDate efectiveDate;
	
	public Fund() {
		super();
	}

	public Fund(int fundId, String fundName, BigDecimal price, LocalDate efectiveDate) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.price = price;
		this.efectiveDate = efectiveDate;
	}

	public int getFundId() {
		return fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public LocalDate getEfectiveDate() {
		return efectiveDate;
	}

}
