package com.hillel.worker;

public class Plumber extends Worker {
  private final String profession = "Plumber";
  private String name;
  private String[] tools;
  private String qualification;


  public Plumber(String name) {
    this.name = name;
  }

  @Override
  public void working() {
    System.out.println(name + " woking");
  }

}
