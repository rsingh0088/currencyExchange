/**
 * 
 */
package com.currency.exchange.currencyExchange.servicesimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currency.exchange.currencyExchange.Entity.CurrExchange;
import com.currency.exchange.currencyExchange.model.CurrencyExchangeModel;
import com.currency.exchange.currencyExchange.repo.CurrencyExchangeRepo;
import com.currency.exchange.currencyExchange.services.CurrencyExchangeService;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;

/**
 * @author Jai Prakash Email: prakashjai01@gmail.com
 *
 */
@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

	Logger logger = LoggerFactory.getLogger(CurrencyExchangeServiceImpl.class);

	@Autowired
	private CurrencyExchangeRepo currencyExchangeRepo;

	@Autowired
	private MapperFactory mapperFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.currency.exchange.currencyExchange.services.CurrencyExchangeService#
	 * getConversionRate(java.lang.String, java.lang.String)
	 */
	@Override
	public CurrencyExchangeModel getConversionRate(String from, String to) {
		try {
			MapperFacade mapper = mapperFactory.getMapperFacade();
			CurrExchange currencyEx = currencyExchangeRepo.findByFromCurrAndToCurr(from, to);
			if (currencyEx == null) {
				logger.info("Null value returned");
			}
			return mapper.map(currencyEx, CurrencyExchangeModel.class);
		} catch (Exception e) {
			logger.error(e.getMessage());

		}
		return null;
	}
}
