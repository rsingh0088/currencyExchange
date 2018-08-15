/**
 * 
 */
package com.currency.exchange.currencyExchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currency.exchange.currencyExchange.Entity.CurrExchange;

/**
 * @author Jai Prakash
 * Email: prakashjai01@gmail.com
 *
 */
@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrExchange, Integer> {

	CurrExchange findByFromCurrAndToCurr(String from, String to);
}
