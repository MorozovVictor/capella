package com.hillel.shapes;

public class Square extends Shape {
  private final String name = "SQUARE";
  private double side;

  public Square(double side) {
    if (side >= 0.0) {
      this.side = side;
    } else {
      this.side = 0.0;
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public double perimeter() {
    return 4 * side;
  }

  @Override
  public double square() {
    return side * side;
  }

}
