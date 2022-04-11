package lab3;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test
	public void madeColor() {
		
		ColoredLight cl = new ColoredLight(null);
		double k = cl.a;
		double g = cl.b;
		double t = cl.c;
		
		Assert.assertNotNull(Color.getHSBColor((float)k, (float)g, (float)t));
	}

	@Test
	public void madeNoColor() {
		ColoredLight cl = new ColoredLight(null);

		Assert.assertNull(cl.getColor());
	}

	@Test
	public void haveColor() {
		ColoredLight cl = new ColoredLight(null);
		cl.setColor(Color.pink);

		Assert.assertNotNull(cl.getColor());
	}

	@Test
	public void haveNotColor() {
		ColoredLight cl = new ColoredLight(null);

		Assert.assertNull(cl.getColor());
	}

	@Test
	public void testRandomChange() {
		ColoredLight cl = new ColoredLight(null);
		double k = cl.a;
		double g = cl.b;
		double t = cl.c;
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean colorChanged = false;
		for (int i = 0; i < 100; i++) {
			cl.randomChange();
			if (cl.getColor() == null) {
				colorChanged = false;
				break;
			}
		}
		Assert.assertFalse(colorChanged);
//		Assert.assertNotEquals(colorChanged, Color.getHSBColor((float)k, (float)g, (float)t));

		// Make sure it can change the other way
		cl = new ColoredLight(Color.getHSBColor((float)k, (float)g, (float)t));
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		colorChanged = false;
		for (int i = 0; i < 100; i++) {
			cl.randomChange();
			if (cl.getColor() != null) {
				colorChanged = true;
				break;
			}
		}
		Assert.assertTrue(colorChanged);
//		Assert.assertEquals(colorChanged, Color.getHSBColor((float)k, (float)g, (float)t));
	}
}
