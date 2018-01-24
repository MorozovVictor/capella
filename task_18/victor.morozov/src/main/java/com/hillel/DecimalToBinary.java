package com.hillel;

public class DecimalToBinary {

  int dec;
  int bin;
  MyStack stack = new MyStack();

  public int convertDecToBin(int dec) {

    while (dec > 0) {
      stack.push(dec % 2);
      dec = dec >> 1;
    }

    while (!stack.isEmpty()) {
      bin =
    }
  }



}
