package cn.exfox.service;

import cn.exfox.domain.Customer;

public interface CustomerService {

	Customer findOne(String custId);

}
