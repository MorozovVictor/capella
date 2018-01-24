package com.hillel.shapes;

public class Circle extends Shape {
  private final String name = "CIRCLE";
  private double radius;

  public Circle(double radius) {
    if (radius >= 0.0) {
      this.radius = radius;
    } else {
      this.radius = 0.0;
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double square() {
    return Math.PI * radius * radius;
  }
}
