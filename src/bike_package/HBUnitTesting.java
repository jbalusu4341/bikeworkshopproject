package bike_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class HBUnitTesting {

	@Test
	public void test() {
		HeavyBike id = new HeavyBike();
		double output =  id.CustomerID(44);
		assertEquals(44,output);
	}

}
