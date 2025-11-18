package shape;

import java.io.*;
import java.util.*;

/**
 * Reads from file
 * @author Totu-vostro-5640
 */
public class ShapeMain {
    public static void main(String[] args) {
        List<Shapes> shapes = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("shape.txt"))) {
            int n = Integer.parseInt(sc.nextLine().trim());

            for (int i = 0; i < n; i++) {
                String[] parts = sc.nextLine().trim().split("\\s+");
                char type = parts[0].charAt(0);
                double x = Double.parseDouble(parts[1]);
                double y = Double.parseDouble(parts[2]);
                double size = Double.parseDouble(parts[3]);

                switch (type) {
                    case 'C': shapes.add(new Circle(x, y, size)); break;
                    case 'S': shapes.add(new Square(x, y, size)); break;
                    case 'T': shapes.add(new Triangle(x, y, size)); break;
                    case 'H': shapes.add(new Hexagon(x, y, size)); break;
                    default: System.err.println("Unknown type: " + type);
                }
            }
        } catch (IOException e){
            System.err.println("File error: " + e.getMessage());
        }

        for (Shapes s : shapes){
            System.out.println(s);
        }

        if (shapes.isEmpty()){
            return;
        }

        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Shapes s : shapes) {
            minX = Math.min(minX, s.getMinX());
            minY = Math.min(minY, s.getMinY());
            maxX = Math.max(maxX, s.getMaxX());
            maxY = Math.max(maxY, s.getMaxY());
        }

        System.out.println("\nBounding Box:");
        System.out.println("Bottom-left  = (" + String.format("%.1f", minX) + ", " + String.format("%.1f", minY) + ")");
        System.out.println("Top-left     = (" + String.format("%.1f", minX) + ", " + String.format("%.1f", maxY) + ")");
        System.out.println("Bottom-right = (" + String.format("%.1f", maxX) + ", " + String.format("%.1f", minY) + ")");
        System.out.println("Top-right    = (" + String.format("%.1f", maxX) + ", " + String.format("%.1f", maxY) + ")");
        System.out.println("Width  = " + String.format("%.1f", (maxX - minX)));
        System.out.println("Height = " + String.format("%.1f", (maxY - minY)));
    }
}
