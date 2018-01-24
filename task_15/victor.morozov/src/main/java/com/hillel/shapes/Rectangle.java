package com.hillel.shapes;

public class Rectangle extends Shape {
  private final String name = "RECTANGLE";
  private double sideSmall;
  private double sideBig;

  public Rectangle(double sideSmall, double sideBig) {
    if (sideSmall >= 0.0) {
      this.sideSmall = sideSmall;
    } else {
      this.sideSmall = 0.0;
    }
    if (sideBig >= 0.0) {
      this.sideBig = sideBig;
    } else {
      this.sideBig = 0.0;
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public double perimeter() {
    return 2 * sideSmall + 2 * sideBig;
  }

  @Override
  public double square() {
    return sideSmall * sideBig;
  }

}
