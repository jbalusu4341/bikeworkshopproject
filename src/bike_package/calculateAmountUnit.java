package bike_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculateAmountUnit {

	@Test
	public void test() {
		HeavyBike mode = new HeavyBike();
		double output =  mode.Number(1999);
		assertEquals(1999,output);
	}

}
