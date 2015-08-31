package com.currencyfair.test.src;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.annotate.JsonValue;

public class TradeMessage {

	private String userId;
	private String currencyFrom;
	private String currencyTo;
	private Integer amountSell;
	private Integer amountBuy;
	private int rate;
	private String timePlaced;
	private String originatingCountry;

	private String value = "";

	public TradeMessage(String value) {
		this.value = value;
	}

	public TradeMessage() {
		// TODO Auto-generated constructor stub
	}

	public TradeMessage(String userId, String currencyFrom, String currencyTo,
			Integer amountSell, Integer amountBuy, int rate, String timePlaced,
			String originatingCountry) {
		super();
		this.userId = userId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.amountSell = amountSell;
		this.amountBuy = amountBuy;
		this.rate = rate;
		this.timePlaced = timePlaced;
		this.originatingCountry = originatingCountry;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public Integer getAmountSell() {
		return amountSell;
	}

	public void setAmountSell(Integer amountSell) {
		this.amountSell = amountSell;
	}

	public Integer getAmountBuy() {
		return amountBuy;
	}

	public void setAmountBuy(Integer amountBuy) {
		this.amountBuy = amountBuy;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}

	public String getOriginatingCountry() {
		return originatingCountry;
	}

	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}

	/* @JsonValue
	@JsonRawValue
	public String toString() {
		return "[" + getUserId() + ", " + getCurrencyTo() + ", "
				+ getCurrencyFrom() + ", " + getOriginatingCountry() + "]";
	} */

}
