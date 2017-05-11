package myproj.cav.prog.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BankAccount {

	private Long bankaccount;
	private String fname;
	private String sname;
	private LocalDate dob;
	private BigDecimal amount;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long bankaccount, String fname, String sname, LocalDate dob, BigDecimal amount) {
		super();
		this.bankaccount = bankaccount;
		this.fname = fname;
		this.sname = sname;
		this.dob = dob;
		this.amount = amount;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setBankaccount(long bankaccount) {
		this.bankaccount = bankaccount;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	

	 @Override
	    public boolean equals(Object o) {
	        if (o == this) return true;
	        if (!(o instanceof BankAccount)) {
	            return false;
	        }
	        BankAccount account = (BankAccount) o;
	        return account.fname.equals(fname) &&
	        		account.sname.equals(sname) &&
	                account.dob.equals(dob);
	    }

	 @Override
	    public int hashCode() {
	        int result = 17;
	        result = 31 * result + fname.hashCode();
	        result = 31 * result + sname.hashCode();
	        result = (int) (31 * result + bankaccount.hashCode());
	        return result;
	    }

	@Override
	public String toString() {
		return "BankAccount [bankaccount=" + bankaccount + ", fname=" + fname + ", sname=" + sname + ", dob=" + dob
				+ ", amount=" + amount + "]";
	}
}
