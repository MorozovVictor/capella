package com.hillel.worker;

public class Locksmith extends Worker {
  private final String profession = "Locksmith";
  private String name;
  private String[] tools;

  public Locksmith(String name) {
    this.name = name;
  }

  @Override
  public void working() {
    System.out.println(name + " woking");
  }
}
