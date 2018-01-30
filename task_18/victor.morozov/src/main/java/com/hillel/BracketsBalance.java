package com.hillel;

import java.util.Stack;

public class BracketsBalance {

  public static boolean balance(String data) {
    Character[] bracketsIn = {'(', '[', '{'};
    Character[] bracketsOut = {')', ']', '}'};
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < data.length(); i++) {
      Character symbol = data.charAt(i);
      if (!stack.empty()) {
        if (contains(bracketsIn, symbol)) {
          stack.push(symbol);
        } else if (contains(bracketsOut, symbol)) {
          if (stack.peek().equals(bracketsIn[indexIn(bracketsOut, symbol)])) {
            stack.pop();
          } else {
            return false;
          }
        }
      } else {
        if (contains(bracketsIn, symbol)) {
          stack.push(symbol);
        } else {
          return false;
        }
      }
    }
    return true;
  }

  private static int indexIn(Character[] brackets, Character symbol) {
    for (int i = 0; i < brackets.length; i++) {
      if (brackets[i].equals(symbol)) {
        return i;
      }
    }
    return -1;
  }

  private static boolean contains(Character[] brackets, Character symbol) {
    for (int i = 0; i < brackets.length; i++) {
      if (brackets[i].equals(symbol)) {
        return true;
      }
    }
    return false;
  }

}
