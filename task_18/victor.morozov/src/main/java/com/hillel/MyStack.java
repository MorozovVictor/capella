package com.hillel;

import java.util.NoSuchElementException;

public class MyStack {
  private int[] stack;
  private int[] min;
  private int[] max;
  private int size;
  public static final int BASE_SIZE = 10;

  public MyStack() {
    this(BASE_SIZE);
    size = 0;
  }

  public MyStack(int size) {
    stack = new int[size];
    min = new int[size];
    max = new int[size];
    this.size = 0;
  }

  public void push(int element) throws StackOverflowError {
    if (size > stack.length) {
      throw new StackOverflowError();
    } else if (size == stack.length) {
      stack = grow(stack);
      min = grow(min);
      max = grow(max);
    }
    if (size == 0) {
      stack[size] = element;
      min[size] = element;
      max[size] = element;
      size++;
    } else {
      stack[size] = element;
      min[size] = minOf(stack[size], min[size - 1]);
      max[size] = maxOf(stack[size], max[size - 1]);
      size++;
    }
  }

  private int minOf(int elem1, int elem2) {
    return elem1 < elem2 ? elem1 : elem2;
  }

  private int maxOf(int elem1, int elem2) {
    return elem1 > elem2 ? elem1 : elem2;
  }

  private int[] grow(int[] array) {
    int[] newArray = new int[size + (size >> 1)];
    System.arraycopy(array, 0, newArray, 0, size);
    return newArray;
  }

  public int pop() throws StackOverflowError {
    if (size <= 0) {
      throw new StackOverflowError();
    }
    return stack[--size];
  }

  public int peek() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return stack[size - 1];
  }

  public int min() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return min[size - 1];
  }

  public int max() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return max[size - 1];
  }

  public boolean isEmpty() {
    return size == 0;
  }
}
