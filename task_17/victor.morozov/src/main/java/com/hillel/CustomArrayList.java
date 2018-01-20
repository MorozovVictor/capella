package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class CustomArrayList implements CustomList, Iterable {

  private int size;
  private String[] array;
  public static final int BASE_SIZE = 10;

  public CustomArrayList() {
    this(BASE_SIZE);
    size = 0;
  }

  public CustomArrayList(int size) {
    if (size < BASE_SIZE) {
      array = new String[BASE_SIZE];
    } else {
      array = new String[size + size >> 1];
    }
    this.size = size;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    if (size == array.length) {
      String[] newArray = new String[size + size >> 1];
      newArray[size++] = element;
      array = newArray;
    } else {
      array[size++] = element;
    }
  }

  @Override
  public void add(int index, String element) {
    final int CURRENT_SIZE = -1;
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      if (size == array.length) {
        int newSize = size + size >> 1;
        array = addToArray(newSize, index, element);
      } else {
        array = addToArray(CURRENT_SIZE, index, element);
      }
      size++;
    }
  }

  private String[] addToArray(int size, int index, String element) {
    String[] newArray;
    if (size == -1) {
      newArray = new String[array.length];
    } else {
      newArray = new String[size];
    }
    for (int i = 0, j = 0; i < newArray.length; i++, j++) {
      if (i == index) {
        newArray[i] = element;
        j = index - 1;
        continue;
      }
      newArray[i] = array[j];
    }
    return newArray;
  }

  @Override
  public boolean remove(String element) {
    if (element == null) {
      for (int index = 0; index < size; index++) {
        if (array[index] == null) {
          removeAtIndex(index);
          return true;
        }
      }
    } else {
      for (int index = 0; index < size; index++) {
        if (element.equals(array[index])) {
          removeAtIndex(index);
          return true;
        }
      }
    }
    return false;
  }

  private void removeAtIndex(int index) {
    int numMove = size - index - 1;
    if (numMove > 0) {
      System.arraycopy(array, index + 1, array, index, numMove);
    }
    array[size - 1] = null;
    size--;
  }

  @Override
  public String remove(int index) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      String result = array[index];
      removeAtIndex(index);
      return result;
    }
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      array[i] = null;
    }
    size = 0;
  }

  @Override
  public String get(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      return array[index];
    }
  }

  @Override
  public void set(int index, String element) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      array[index] = element;
    }
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (element.equals(array[i])) {
        return i;
      }
    }
    return -1;
  }

  public ListIterator naturalIterator() {
    return new ListIterator();
  }

  private class ListIterator {

    private int current;

    ListIterator() {
      current = 0;
    }

    public boolean hasNext() {
      return current < size;
    }

    public Object next() {
      if (current >= size) {
        throw new NoSuchElementException();
      }
      return array[current++];
    }
  }

  public Iterator iterator() {
    return new RandomListIterator();
  }

  private class RandomListIterator implements Iterator {

    private int current;
    private int[] randArray;
    Random random = new Random();

    public RandomListIterator() {
      this.randArray = randomArray(size);
    }

    private int[] randomArray(int size) {
      int[] randArray = new int[size];
      int sizeArray = randArray.length;
      int randIndex;
      //Random random = new Random();
      for (int i = 0; i < sizeArray; i++) {
        randArray[i] = i;
      }

      for (int i = sizeArray - 1; i >= 1; i--) {
        randIndex = random.nextInt(i + 1);
        swap(randArray, randArray[i], randArray[randIndex]);
      }
      return randArray;
    }

    private void swap(int[] array, int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
    }

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public Object next() {
      if (current >= size) {
        throw new NoSuchElementException();
      }
      return array[randArray[current++]];
    }
  }

}

