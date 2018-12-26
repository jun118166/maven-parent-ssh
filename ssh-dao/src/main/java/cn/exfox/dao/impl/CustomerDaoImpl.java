package cn.exfox.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.exfox.dao.CustomerDao;
import cn.exfox.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findOne(String custId) {
		return this.getHibernateTemplate().get(Customer.class, custId);
	}

}
