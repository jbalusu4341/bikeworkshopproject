package bike_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrialTesting {

	@Test
	public void test() {
		TrailBike mode = new TrailBike();
		double output =  mode.Number(1933);
		assertEquals(1933,output);
	}

}
