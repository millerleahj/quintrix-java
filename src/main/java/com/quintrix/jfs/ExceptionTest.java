package com.quintrix.jfs;

public class ExceptionTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "1500"; // "abc" would give exception error message
    String str1 = "abc";
    Long num = (long) 0;
    num = Long.parseLong(str);
    System.out.println("Converted number 1 is: " + num);


    try {
      // open file
      num = Long.parseLong(str1);
    } catch (NumberFormatException e) {
      System.out.println("Could not convert " + str1);
      num = (long) -1;
    } finally {
      // close file
    }

    System.out.println("Converted number 2 is: " + num);
  }

}
