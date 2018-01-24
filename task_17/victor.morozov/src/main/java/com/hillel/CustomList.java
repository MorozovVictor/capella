package com.hillel;

import java.util.Iterator;
import java.util.ListIterator;

public interface CustomList {
  int size();

  boolean isEmpty();

  boolean contains(String element);

  void add(String element);

  void add(int index, String element);

  boolean remove(String element);

  String remove(int index);

  void clear();

  String get(int index);

  void set(int index, String element);

  int indexOf(String element);

  Iterator iterator();
  //Iterator naturalIterator();
}
