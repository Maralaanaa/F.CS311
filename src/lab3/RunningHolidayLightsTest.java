
package lab3;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RunningHolidayLightsTest {

	@Test
	public void Length() {
		RunningHolidayLights len = new RunningHolidayLights(12);
		Assert.assertEquals(12, len.getLength());
	}

	@Test
	public void noLength() {
		RunningHolidayLights len = new RunningHolidayLights(0);
		Assert.assertNotEquals(12, len.getLength());
	}

	@Test
	public void makeLight() {
		int len = 12;
		RunningHolidayLights list = new RunningHolidayLights(len);
		List<Light> lig;
		lig = list.next();
		for (int i = 0; i < len; i++) {
			Assert.assertTrue(lig.get(i).isOn());
		}
		for (int i = 0; i < len; i++) {
			lig.get(i).setOn(false);
			Assert.assertFalse(lig.get(i).isOn());
		}
	}
//	@Test
//	public void CheckedCount() {
//		List<Light> c;
//		int len = 12;
//     	RunningHolidayLights list = new RunningHolidayLights(len);
//		
//		for(int i = 0; i < len; i++) {
//			c = list.next();
//			List<Light> a = c;
//			Assert.assertFalse(a != c);
//		}	
//	}
}
