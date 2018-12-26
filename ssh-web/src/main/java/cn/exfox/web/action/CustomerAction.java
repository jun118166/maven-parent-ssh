package cn.exfox.web.action;

import cn.exfox.domain.Customer;
import cn.exfox.service.CustomerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5848834315813788160L;

	private CustomerService customerService;

	/**
	 * @param customerService
	 *            the customerService to set
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	private String custId;

	/**
	 * @param custId
	 *            the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String findOne() throws Exception {
		Customer customer = customerService.findOne(custId);
		ActionContext.getContext().getValueStack().push(customer);
		return SUCCESS;
	}
}
