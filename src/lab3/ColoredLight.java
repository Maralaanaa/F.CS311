package lab3;

import java.awt.Color;

public class ColoredLight extends Light {

	Color cl;

	public ColoredLight(Color color) {
		// TODO
		super(true);
		cl = color;
		// throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}

	/**
	 * Returns the color of this light.
	 * 
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		return cl;
		// throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}

	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		cl = c;
		// throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}

	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO.
		// Take advantage of Light.randomChange
		if (Math.random() < .2) {
			setColor(Color.gray);
		} else if (Math.random() > 0.2 && Math.random() < 0.4) {
			setColor(Color.black);
		} else
			setColor(Color.pink);

		// throw new RuntimeException("ColoredLight.randomChange() not yet
		// implemented!");
	}

}
