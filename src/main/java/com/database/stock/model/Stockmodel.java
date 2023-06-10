package com.database.stock.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Components")
public class Stockmodel {
	@Id
	private int ccode;
	private String cname;
	private String cbrnd;
	private int crate;
	private int cused;
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCbrnd() {
		return cbrnd;
	}
	public void setCbrnd(String cbrnd) {
		this.cbrnd = cbrnd;
	}
	public int getCrate() {
		return crate;
	}
	public void setCrate(int crate) {
		this.crate = crate;
	}
	public int getCused() {
		return cused;
	}
	public void setCused(int cused) {
		this.cused = cused;
	}
	


}
