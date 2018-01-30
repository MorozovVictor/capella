package com.hillel;

public class DecimalToBinary {

  public static String convertDecToBin(int dec) {
    StringBuilder bin = new StringBuilder();
    MyStack stack = new MyStack();

    while (dec > 0) {
      stack.push(dec % 2);
      dec = dec >> 1;
    }

    while (!stack.isEmpty()) {
      bin.append(stack.pop());
    }

    return bin.toString();
  }



}
