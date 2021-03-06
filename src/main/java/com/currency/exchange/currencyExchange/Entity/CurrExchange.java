package com.currency.exchange.currencyExchange.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="CURR_EXCHANGE")
public class CurrExchange {
	
	@Id
	Integer id;
	
	String fromCurr;
	
	String toCurr;
	
	Double value;
	
	@JsonIgnore
	String convertionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFromCurr() {
		return fromCurr;
	}

	public void setFromCurr(String fromCurr) {
		this.fromCurr = fromCurr;
	}

	public String getToCurr() {
		return toCurr;
	}

	public void setToCurr(String toCurr) {
		this.toCurr = toCurr;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getConvertionDate() {
		return convertionDate;
	}

	public void setConvertionDate(String convertionDate) {
		this.convertionDate = convertionDate;
	}
	
	/**
	 * 
	 */
	public CurrExchange() {
		// TODO Auto-generated constructor stub
	}
	
	

}
