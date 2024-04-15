package stepDefinition;

import com.qa.web.page.DriverFactory;

public class Sample {

	public static void main(String[] args) {
		
		DriverFactory driverFactory = new DriverFactory();
		driverFactory.init_driver(driverFactory.init_prop());
		
	}
	
}
