package lab3;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test
	public void madeColor() {
		ColoredLight col = new ColoredLight(null);
		double a = col.e;
		double b = col.r;
		double c = col.t;
		ColoredLight cl = new ColoredLight(Color.getHSBColor((float) a, (float) b, (float) c));

		Assert.assertNotNull(cl.getColor());
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
		double a = cl.e;
		double b = cl.r;
		double c = cl.t;
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean colorChanged = false;
		for (int i = 0; i < 100; i++) {
			cl.randomChange();
			if (cl.getColor() != null) {
				colorChanged = false;
				break;
			}
		}
		Assert.assertEquals(colorChanged, Color.getHSBColor((float) a, (float) b, (float) c));

		// Make sure it can change the other way
		cl = new ColoredLight(Color.getHSBColor((float) a, (float) b, (float) c));
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		colorChanged = false;
		for (int i = 0; i < 100; i++) {
			cl.randomChange();
			if (cl.getColor() == null) {
				colorChanged = true;
				break;
			}
		}
		Assert.assertEquals(colorChanged, Color.getHSBColor((float) a, (float) b, (float) c));
	}
}
