package com.hillel.shapes;

import com.hillel.worker.Locksmith;
import com.hillel.worker.Plumber;
import com.hillel.worker.Worker;

public class Main {

  public static void main(String[] args) {
    Shape square1 = new Square(5.0);
    Shape rectangle = new Rectangle(3, 5);
    Shape circle = new Circle(4);
    Shape[] shapes = new Shape[3];
    shapes[0] = square1;
    shapes[1] = rectangle;
    shapes[2] = circle;

    for (Shape element : shapes) {
      System.out.println(element.getName());
      System.out.println("Периметр = " + element.perimeter());
      System.out.println("Площадь = " + element.square());
    }

    Worker worker1 = new Locksmith("John");
    Worker worker2 = new Locksmith("Dan");
    Worker worker3 = new Plumber("Garry");

    Worker[] company = new Worker[3];
    company[0] = worker1;
    company[1] = worker2;
    company[2] = worker3;

    for (Worker worker : company) {
      worker.working();
    }
  }


}
