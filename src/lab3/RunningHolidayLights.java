package lab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {

	int len;
	int count = 0;

	public RunningHolidayLights(int length) {
		// TODO
		len = length;

		// throw new RuntimeException("RunningHolidayLights(length) not yet
		// implemented!");
	}

	public List<Light> next() {
		// TODO 

		List<Light> list = new ArrayList<Light>();
		Color c = Color.pink;
		for (int i = 1; i <= len; i++) {
			ColoredLight light = new ColoredLight(c);
			light.randomChange();
//			light.setOn(false);
			list.add(light);
		}
		list.get(count).setOn(true);
		count = count + 1;
		if (count >= len) {
			count = 0;
		}
		return list;
		// throw new RuntimeException("RunningHolidayLights.next() not yet
		// implemented!");
	}

	/**
	 * Returns the length of this
	 * 
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		return len;
		// throw new RuntimeException("RunningHolidayLights.getLength() not yet
		// implemented!");
	}

}