import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan("com.pluralsight")
public class AppConfig {
	
	@Bean(name = "customerService")
	@Scope("singleton")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		
		return customerService;
	}
	
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/

}
