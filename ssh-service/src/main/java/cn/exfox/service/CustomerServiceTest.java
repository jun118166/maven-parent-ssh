package cn.exfox.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class CustomerServiceTest {

	@Autowired
	private CustomerService customerService;

	@Test
	public void testFindOne() {
//		通过applicationContext获取xml配置信息
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//				"classpath*:spring/applicationContext-*.xml");
//		CustomerService service = (CustomerService) applicationContext.getBean("customerService");
//		service.findOne("1");
		
		customerService.findOne("1");
	}

}
