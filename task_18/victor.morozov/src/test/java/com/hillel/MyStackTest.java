package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyStackTest {

  @Test
  public void pushAndPeekTest() {
    MyStack testStack = new MyStack(3);
    testStack.push(1);
    testStack.push(2);
    testStack.push(3);
    assertThat(testStack.peek(), is(3));
  }

  @Test
  public void popTest() {
    MyStack testStack = new MyStack(3);
    testStack.push(1);
    testStack.push(2);
    testStack.push(3);
    assertThat(testStack.pop(), is(3));
    assertThat(testStack.peek(), is(2));
  }

  @Test
  public void minTest() {
    MyStack testStack = new MyStack(3);
    testStack.push(1);
    testStack.push(2);
    testStack.push(3);
    assertThat(testStack.min(), is(1));
  }

  @Test
  public void maxTest() {
    MyStack testStack = new MyStack(3);
    testStack.push(1);
    testStack.push(2);
    testStack.push(3);
    assertThat(testStack.max(), is(3));
  }

  @Test
  public void isEmptyTest() {
    MyStack testStack = new MyStack(3);
    assertThat(testStack.isEmpty(), is(true));
  }
}
