package lab3;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test
	public void madeColor() {
		ColoredLight cl = new ColoredLight(Color.gray);

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
		
		Assert.assertEquals(colorChanged, Color.pink);

		// Make sure it can change the other way
		cl = new ColoredLight(Color.pink);
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
		Assert.assertEquals(colorChanged, Color.pink);
	}
}
