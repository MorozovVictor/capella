package com.hillel;

import java.util.Scanner;

public class IdentifyPalindromes {

  public static void main(String[] args) {
    System.out.println("Enter ur words in format \"word1, word2, ...\"");
    Scanner scanner = new Scanner(System.in, "UTF-8");
    String text = scanner.nextLine();
    System.out.println("there is: " + findPalndromes(text) + " palindromes words");
  }

  public static int findPalndromes(String check) {
    String[] checkArray = cutString(check);
    int wordsCounter = 0;
    for (int i = 0; i < checkArray.length; i++) {
      int counter = 0;
      checkArray[i] = checkArray[i].trim();
      int middle = checkArray[i].length() >>> 1;
      for (int j = 0; j < middle; j++) {
        if (checkArray[i].charAt(j) == checkArray[i].charAt(checkArray[i].length() - 1 - j)) {
          counter++;
        }
      }
      if (counter == middle) {
        wordsCounter++;
      }
      System.out.println(checkArray[i]);
    }
    return wordsCounter;
  }

  public static String[] cutString(String check) {
    return check.split(",");
  }
}
