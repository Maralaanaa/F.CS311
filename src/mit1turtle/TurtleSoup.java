/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package mit1turtle;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TurtleSoup {

    /**
     * Draw a square.
     * 
     * @param turtle the turtle context
     * @param sideLength length of each side
     */
    public static void drawSquare(Turtle turtle, int sideLength) {
    	turtle.forward(sideLength);
    	turtle.turn(90.0);
    	turtle.forward(sideLength);
    	turtle.turn(90.0);
    	turtle.forward(sideLength);
    	turtle.turn(90.0);
    	turtle.forward(sideLength);
    	turtle.turn(90.0);
    	//turtle.forward(sideLength);
    	//turtle.turn(60.0);
    	//turtle.forward(sideLength);
    	//turtle.turn(60.0);
    	//turtle.forward(sideLength);
    	//turtle.turn(60.0);
    	//turtle.forward(sideLength);
        //throw new RuntimeException("implement me!");
    }
    public static void drawLine(Turtle turtle, int sideLength) {
    	turtle.forward(sideLength);
    }
    public static void deleteLine(Turtle turtle, int sideLength) {
    	turtle.forward(sideLength);
    }
    /**
     * Determine inside angles of a regular polygon.
     * 
     * There is a simple formula for calculating the inside angles of a polygon;
     * you should derive it and use it here.
     * 
     * @param sides number of sides, where sides must be > 2
     * @return angle in degrees, where 0 <= angle < 360
     */
    public static double calculateRegularPolygonAngle(int sides) {
    	if(sides < 3) {
    		throw new RuntimeException("Sides must be rather than 2");
    	}
    	else {
    		return (double) 180.0 - (360.0 / sides);
    	}
        //throw new RuntimeException("implement me!");
    }

    /**
     * Determine number of sides given the size of interior angles of a regular polygon.
     * 
     * There is a simple formula for this; you should derive it and use it here.
     * Make sure you *properly round* the answer before you return it (see java.lang.Math).
     * HINT: it is easier if you think about the exterior angles.
     * 
     * @param angle size of interior angles in degrees, where 0 < angle < 180
     * @return the integer number of sides
     */
    public static int calculatePolygonSidesFromAngle(double angle) {
    	int angle_int = (int) Math.round(angle);
    	if(0 < angle_int && angle_int < 180) {
    		return (int) 360 / (180 - angle_int);
    	}
    	else {
    		throw new RuntimeException("Angle must be 0 < angle < 180");
    	}
        //throw new RuntimeException("implement me!");
    }

    /**
     * Given the number of sides, draw a regular polygon.
     * 
     * (0,0) is the lower-left corner of the polygon; use only right-hand turns to draw.
     * 
     * @param turtle the turtle context
     * @param sides number of sides of the polygon to draw
     * @param sideLength length of each side
     */
    public static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
    	double angle = calculateRegularPolygonAngle(sides);
    	for(int i = 1; i <= sides; i++) {
    		turtle.forward(sideLength);
    		turtle.turn(180.0 - angle);
    	}
        //throw new RuntimeException("implement me!");
    }

    /**
     * Given the current direction, current location, and a target location, calculate the heading
     * towards the target point.
     * 
     * The return value is the angle input to turn() that would point the turtle in the direction of
     * the target point (targetX,targetY), given that the turtle is already at the point
     * (currentX,currentY) and is facing at angle currentHeading. The angle must be expressed in
     * degrees, where 0 <= angle < 360. 
     *
     * HINT: look at http://en.wikipedia.org/wiki/Atan2 and Java's math libraries
     * 
     * @param currentHeading current direction as clockwise from north
     * @param currentX current location x-coordinate
     * @param currentY current location y-coordinate
     * @param targetX target point x-coordinate
     * @param targetY target point y-coordinate
     * @return adjustment to heading (right turn amount) to get to target point,
     *         must be 0 <= angle < 360
     */
    
    public static double calculateHeadingToPoint(double currentHeading, int currentX, int currentY, int targetX, int targetY) {
double angle;
        
    	if (targetY == currentY) {
        	if (targetX > currentX) {
        		angle = 90;
        	} else {
        		angle = 270;
        	}
        } else {
        	angle = Math.toDegrees(Math.atan((targetX - currentX) / (targetY - currentY)));
        }
    	
        return (angle - currentHeading + 360) % 360;
 
//    	throw new RuntimeException("implement me!");
    }

    /**
     * Given a sequence of points, calculate the heading adjustments needed to get from each point
     * to the next.
     * 
     * Assumes that the turtle starts at the first point given, facing up (i.e. 0 degrees).
     * For each subsequent point, assumes that the turtle is still facing in the direction it was
     * facing when it moved to the previous point.
     * You should use calculateHeadingToPoint() to implement this function.
     * 
     * @param xCoords list of x-coordinates (must be same length as yCoords)
     * @param yCoords list of y-coordinates (must be same length as xCoords)
     * @return list of heading adjustments between points, of size 0 if (# of points) == 0,
     *         otherwise of size (# of points) - 1
     */
    public static List<Double> calculateHeadings(List<Integer> xCoords, List<Integer> yCoords) {
    	List<Double> headings = new ArrayList<Double>();
        double currentHeading = 0;
        Iterator<Integer> itX = xCoords.iterator();
        Iterator<Integer> itY = yCoords.iterator();
        int currentX = itX.next();
        int currentY = itY.next();
        int targetX, targetY;
        double headingAdjustment;
        
        // Iterate over the points.
        while (itX.hasNext() && itY.hasNext()) {
        	targetX = itX.next();
        	targetY = itY.next();
        	
        	// Calculate the required adjustment.
        	headingAdjustment = TurtleSoup.calculateHeadingToPoint(currentHeading, currentX, currentY, targetX, targetY);
        	headings.add(headingAdjustment);
        	
        	// Move to the next point.
        	currentX = targetX;
        	currentY = targetY;
        	currentHeading += headingAdjustment;
        }
        return headings;
    	//throw new RuntimeException("implement me!");
    }

    /**
     * Draw your personal, custom art.
     * 
     * Many interesting images can be drawn using the simple implementation of a turtle.  For this
     * function, draw something interesting; the complexity can be as little or as much as you want.
     * 
     * @param turtle the turtle context
     */
    public static void drawPersonalArt(Turtle turtle) {
//        throw new RuntimeException("implement me!");
    	for(int i = 0; i <= 50; i++) {
    		drawRegularPolygon(turtle, 6, i+10);
    		turtle.turn(10);
    	}
//    	for(int i = 0; i <= 520; i++) {
//    		if(i % 2 == 0) {
//    			turtle.color(PenColor.PINK);
//    		} else {
//    			turtle.color(PenColor.BLACK);
//    		}
//		drawLine(turtle, i);
//		turtle.turn(90);
//	}
//    	for(int i = 520; i >= 0; i--) {
//    		turtle.color(PenColor.BLACK);
//		deleteLine(turtle, i);
//		turtle.turn(90);
//	}
//    	
//    	for(int i = 0; i <= 300; i++) {
//    		if(i % 2 == 0) {
//    			turtle.color(PenColor.PINK);
//    		} else {
//    			turtle.color(PenColor.BLACK);
//    		}
//		drawLine(turtle, i);
//		turtle.turn(110);
//	}
    }

    /**
     * Main method.
     * 
     * This is the method that runs when you run "java TurtleSoup".
     * 
     * @param args unused
     */
    public static void main(String args[]) {
        DrawableTurtle turtle = new DrawableTurtle();

        //drawSquare(turtle, 40);
//        drawRegularPolygon(turtle, 6, 10);
        drawPersonalArt(turtle);
//        drawLine(turtle, 50);
        // draw the window
        turtle.draw();
    }

}