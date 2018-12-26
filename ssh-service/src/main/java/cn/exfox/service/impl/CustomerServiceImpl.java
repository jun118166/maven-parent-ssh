package cn.exfox.service.impl;

import cn.exfox.dao.CustomerDao;
import cn.exfox.domain.Customer;
import cn.exfox.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;

	/**
	 * @param customerDao the customerDao to set
	 */
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findOne(String custId) {
		// TODO Auto-generated method stub
		return customerDao.findOne(custId);
	}
}
