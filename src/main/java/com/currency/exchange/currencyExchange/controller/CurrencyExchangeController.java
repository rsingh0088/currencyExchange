package com.currency.exchange.currencyExchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.currencyExchange.Entity.CurrExchange;
import com.currency.exchange.currencyExchange.model.CurrencyExchangeModel;
import com.currency.exchange.currencyExchange.services.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {

	Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private CurrencyExchangeService currencyExchangeService;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchangeModel retrieveExchangeValue(@PathVariable String from,@PathVariable String to){
		logger.info("Controller: retrieveExchangeValue");
	
		try{
			CurrencyExchangeModel currencyEx= currencyExchangeService.getConversionRate(from.toUpperCase(), to.toUpperCase());
			
			return currencyEx;
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		return null;
	}
}
