package bike_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class TBUnitTesting {

	@Test
	public void test() {
		TrailBike id = new TrailBike();
		double output =  id.CustomerID(54);
		assertEquals(54,output);

}
}