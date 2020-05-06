/**
 * 
 */
package com.cg.casestudy.carwash.service;

import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.entity.Address;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

/**
 * @author bano
 *
 */
@Service
public interface CustomerCarWashService {
	
 public String login(CustomerCarWashEntity customerCarWashEntity)throws CustomerCarWashException;
 
 public String addressDetails(Address address) throws CustomerCarWashException;
}
