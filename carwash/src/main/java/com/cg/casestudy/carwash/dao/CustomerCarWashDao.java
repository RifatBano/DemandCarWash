package com.cg.casestudy.carwash.dao;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.carwash.entity.Address;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

/*
 * 
 */
@Repository
public interface CustomerCarWashDao{

	public String findCustomer(CustomerCarWashEntity customerdetails) throws CustomerCarWashException;

	public String saveAddress(Address address) throws CustomerCarWashException;
}
