# SHAPES — SIDE OOP PROJECT (Java)

## Overview

This is a small Object-Oriented Java project that models geometric shapes and calculates their minimum and maximum X/Y coordinates. Using these values, the program prints a **bounding box** that fully contains all shapes. The project demonstrates abstraction, inheritance, polymorphism, and unit testing, while also processing shape data from input files.

## Key Features

* Supports multiple shapes: **Circle, Square, Triangle, Hexagon**
* Reads shape data from file
* Calculates **bounding box** for a mixed list of shapes
* Uses **inheritance** and **abstract methods** to ensure consistent API
* Includes **JUnit tests** for correctness

## OOP Concepts Demonstrated

* **Abstraction** — `Shapes` is an abstract base class
* **Inheritance** — `Circle`, `Square`, `Triangle`, `Hexagon` extend `Shapes`
* **Polymorphism** — each shape provides its own `getMinX() / getMaxX() / getMinY() / getMaxY()` implementation
* **Encapsulation** — shape data is stored as internal fields
* **Testing** — JUnit verifies behavior, including invalid inputs

## Bounding Box Logic

For each shape, we compute:

* `minX`
* `maxX`
* `minY`
* `maxY`

Then the bounding box is:

```
width  = maxX - minX
height = maxY - minY
```

## Class List

* `Shapes` (abstract)
* `Circle`, `Square`, `Triangle`, `Hexagon` (concrete subclasses)
* `ShapeMain` (file input + bounding box calculation)

## Sample Input (example shape.txt)

```
3
C 0 0 2
S 1 1 4
T -1 -1 3
```

## Sample Output

```
Circle at (0.0, 0.0) radius = 2.0
Square at (1.0, 1.0) side = 4.0
Triangle at (-1.0, -1.0) side = 3.0

Bounding Box:
Bottom-left  = (-3.0, -3.0)
Top-left     = (-3.0, 4.2)
Bottom-right = (3.0, -3.0)
Top-right    = (3.0, 4.2)
Width  = 6.0
Height = 7.2
```

## How to Run

1. Put files under:

```
src/main/java/shape/
src/test/java/Shapetest/
resources/shape.txt
```

2. Run `ShapeMain`

## Future Improvements

* Add more shapes (rectangle, ellipse, polygon)
* Add GUI visualization
* Support rotation
* Allow JSON or XML input

## Author

Toghrul Hasanli
