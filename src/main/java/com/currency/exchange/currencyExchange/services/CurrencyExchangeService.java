/**
 * 
 */
package com.currency.exchange.currencyExchange.services;

import com.currency.exchange.currencyExchange.model.CurrencyExchangeModel;

/**
 * @author Jai Prakash
 * Email: prakashjai01@gmail.com
 *
 */
public interface CurrencyExchangeService {

	CurrencyExchangeModel getConversionRate(String from, String to);
}
