package lab3;

import java.util.List;

public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * 
	 * @return appearence of lights at next time slice.
	 */
	public List<Light> next();

}
