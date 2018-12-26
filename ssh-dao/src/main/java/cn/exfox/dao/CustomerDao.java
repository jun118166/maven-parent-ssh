package cn.exfox.dao;

import cn.exfox.domain.Customer;

public interface CustomerDao {

	Customer findOne(String custId);

}
