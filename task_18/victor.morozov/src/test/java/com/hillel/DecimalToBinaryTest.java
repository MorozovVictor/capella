package com.hillel;

import static com.hillel.DecimalToBinary.convertDecToBin;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DecimalToBinaryTest {

  @Test
  public void isEmptyTest() {
    int testValue = 7;
    System.out.println(convertDecToBin(testValue));
    assertThat(convertDecToBin(testValue), is("111"));
  }

}
