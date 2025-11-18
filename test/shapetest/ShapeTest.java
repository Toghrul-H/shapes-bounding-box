package Shapetest;

import shape.Shapes;
import shape.Circle;
import shape.Hexagon;
import shape.Square;
import shape.Triangle;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ShapeTest {

    @Test
    public void testCircle() {
        Circle c = new Circle(0, 0, 5);
        assertEquals(-5.0, c.getMinX(), 0.1);
        assertEquals(5.0, c.getMaxX(), 0.1);
        assertEquals(-5.0, c.getMinY(), 0.1);
        assertEquals(5.0, c.getMaxY(), 0.1);
    }

    @Test
    public void testSquare() {
        Square s = new Square(0, 0, 4);
        assertEquals(-2.0, s.getMinX(), 0.1);
        assertEquals(2.0, s.getMaxX(), 0.1);
        assertEquals(-2.0, s.getMinY(), 0.1);
        assertEquals(2.0, s.getMaxY(), 0.1);
    }

    @Test
    public void testTriangle() {
        Triangle t = new Triangle(0, 0, 6);
        assertEquals(-3.0, t.getMinX(), 0.1);
        assertEquals(3.0, t.getMaxX(), 0.1);
        assertEquals(-Math.sqrt(3), t.getMinY(), 0.1);
        assertEquals(2 * Math.sqrt(3), t.getMaxY(), 0.1);
    }

    @Test
    public void testHexagon() {
        Hexagon h = new Hexagon(0, 0, 2);
        assertEquals(-2.0, h.getMinX(), 0.1);
        assertEquals(2.0, h.getMaxX(), 0.1);
        assertEquals(-Math.sqrt(3), h.getMinY(), 0.1);
        assertEquals(Math.sqrt(3), h.getMaxY(), 0.1);
    }

    @Test
    public void testBoundingBox() {
        List<Shapes> shapes = new ArrayList<>();
        shapes.add(new Circle(0, 0, 5));
        shapes.add(new Triangle(2, 2, 3));
        shapes.add(new Square(-4, -4, 6));
        shapes.add(new Hexagon(5, 5, 2));
        shapes.add(new Circle(-3, 3, 1));

        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Shapes sh : shapes) {
            minX = Math.min(minX, sh.getMinX());
            minY = Math.min(minY, sh.getMinY());
            maxX = Math.max(maxX, sh.getMaxX());
            maxY = Math.max(maxY, sh.getMaxY());
        }

        assertEquals(-7.0, minX, 0.1);
        assertEquals(-7.0, minY, 0.1);
        assertEquals(7.0, maxX, 0.1);
        assertEquals(6.73205, maxY, 0.1);
    }

    // Optional: separate tests for invalid shapes
    @Test
    public void testInvalidCircle() {
        try {
            new Circle(0, 0, -1);
            fail("Expected IllegalArgumentException for negative radius");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInvalidSquare() {
        try {
            new Square(0, 0, 0);
            fail("Expected IllegalArgumentException for zero side");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInvalidTriangle() {
        try {
            new Triangle(0, 0, -5);
            fail("Expected IllegalArgumentException for negative side");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInvalidHexagon() {
        try {
            new Hexagon(0, 0, -2);
            fail("Expected IllegalArgumentException for negative side");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}