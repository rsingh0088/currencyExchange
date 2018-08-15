/**
 * 
 */
package com.currency.exchange.currencyExchange.model;

/**
 * @author Jai Prakash Email: prakashjai01@gmail.com
 *
 */
public class CurrencyExchangeModel {
	Integer id;

	String fromCurr;

	String toCurr;

	Double value;

	String convertionDate;
	
	/**
	 * 
	 */
	public CurrencyExchangeModel() {
		// TODO Auto-generated constructor stub
	}

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
	
	
}
