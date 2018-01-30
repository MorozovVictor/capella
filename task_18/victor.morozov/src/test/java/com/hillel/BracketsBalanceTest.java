package com.hillel;

import static com.hillel.BracketsBalance.balance;
import static com.hillel.DecimalToBinary.convertDecToBin;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BracketsBalanceTest {

  @Test
  public void balanceTest1() {
    String testStr = "((({}()[])))";
    assertThat(balance(testStr), is(true));
  }

  @Test
  public void balanceTest2() {
    String testStr = "(({)})";
    assertThat(balance(testStr), is(false));
  }

  @Test
  public void balanceTest3() {
    String testStr = "{([])}";
    assertThat(balance(testStr), is(true));
  }
}
