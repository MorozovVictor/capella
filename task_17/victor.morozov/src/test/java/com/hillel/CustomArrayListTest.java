package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Iterator;

public class CustomArrayListTest {

  @Test
  public void isEmptyTest() {
    CustomArrayList emptyList = new CustomArrayList();
    assertThat(emptyList.isEmpty(), is(true));
  }

  @Test
  public void sizeTest() {
    CustomArrayList testList = new CustomArrayList(13);
    assertThat(testList.size(), is(13));
  }

  @Test
  public void getTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    assertThat(testList.get(1), is("2"));
  }

  @Test
  public void setTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.set(1, "5");
    assertThat(testList.get(1), is("5"));
  }

  @Test
  public void containsTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    assertThat(testList.contains("2"), is(true));
  }

  @Test
  public void addTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.add(1, "4");
    assertThat(testList.get(1), is("4"));
  }

  @Test
  public void indexOfTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    assertThat(testList.indexOf("3"), is(2));
  }

  @Test
  public void removeTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.remove("3");
    assertThat(testList.contains("3"), is(false));
  }

  @Test
  public void removeByIndexTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.remove(1);
    assertThat(testList.contains("2"), is(false));
  }

  @Test
  public void clearTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.clear();
    assertThat(testList.isEmpty(), is(true));
  }

  @Test
  public void iteratorTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.add("4");
    testList.add("5");
    testList.add("6");
    testList.add("7");
    testList.add("8");
    testList.add("9");
    Iterator iterator = testList.iterator();
    while (iterator.hasNext()) {
      String element = (String)iterator.next();
      System.out.println(element);
    }

  }

  @Test
  public void iteratorForeachTest() {
    CustomArrayList testList = new CustomArrayList();
    testList.add("1");
    testList.add("2");
    testList.add("3");
    testList.add("4");
    testList.add("5");
    testList.add("6");
    testList.add("7");
    testList.add("8");
    testList.add("9");
    Iterator iterator = testList.iterator();
    for (Object elem : testList) {
      System.out.println(elem.toString());
    }

  }
}
