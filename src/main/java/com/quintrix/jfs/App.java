package com.quintrix.jfs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * All Class Notes
 *
 */
public class App {
  public static void main(String[] args) {

  }

  public void Notes() {
    /*
     * PRIMITIVE DATA TYPES
     * 
     * 
     * numerical: int, float, long, double A float has 7 decimal digits of precision and occupies 32
     * bits . A double is a 64-bit IEEE 754 double-precision floating-point number. 1 bit for the
     * sign, 11 bits for the exponent, and 52 bits for the value. A double has 15 decimal digits of
     * precision and occupies a total of 64 bits . Boolean: true, false
     * 
     * ALWAYS INITIALIZE VARIABLES
     * 
     * THE PLUS SIGN adds numbers together; combines two variables
     * 
     * 
     * 
     * CHAR ESCAPE SEQUENCES
     * 
     * \n = new line \r = carriage return \f = form feed \b = backspace \t = tab \\ = \ \' = '
     * \" = "
     * 
     * 
     * 
     * CANNOT USE FUNCTION ON PRIMITIVE; ONLY ON OBJECTS num.TestFunction : primitive type
     * human.TestFunction : object
     * 
     * WRAPPERS turn primitive to object long -> Long; int -> Integer\ can use null
     * 
     * 
     * CONDITIONAL IF if(value </>/==/!= value) {condition} else {other condition}
     * 
     * 
     * IMPORT DATE import to use date object to get the date IMPORT DATEFORMAT and SIMPLEDATEFORMAT
     * to format date; convert to string to print
     * 
     * 
     * 
     * 
     * Session 5; HW2
     * 
     * using Math. as ex of static
     * 
     * new object Dog; using class Dog
     * 
     * created SpecialDog; extend Dog (inheritance)
     * 
     * created List/array list
     * 
     * Map/Hashmap; variable is defined by interface Map; HashMap is implementation
     * 
     */
  }

  private void Session4() {
    System.out.println("Hello World!");

    Boolean checkNum = false;

    int num = 1;
    double dec = 0.5;
    long bigNum = 100000;
    // int bigToSmall = bigNum;
    // cannot go from long to int
    long smallToBig = num;
    // int decNum = num + dec;
    // created error; dec cannot convert to int
    double approx = 0.1;
    approx = approx + 0.2;
    float fl = 1.5f;

    System.out
        .println("Numbers: " + num + ", " + dec + ", " + bigNum + ", " + smallToBig + ", " + fl);
    System.out.println("Add all Numbers: " + (num + dec + bigNum + smallToBig));
    System.out.println("Approximations: " + approx);

    char alpha = 'A';
    char beta = 65;
    char delta = '\u00E1';
    char omega = '\u2764';

    System.out.println("Characters: \n " + alpha + beta + delta + omega);

    Integer i = new Integer(1);
    int findI = i.intValue();

    System.out.println("Wrapper: Primitive to Object Example " + i + ", " + findI);

    if (num == i) {
      System.out.println("They are equal.");
    } else {
      System.out.println("They are not equal.");
    }

    String str = "A String";
    String strOb = new String("An object string");

    if (str == strOb) {
      System.out.println("They are equal.");
    } else {
      System.out.println("They are not equal.");
    }

    Date curDate = new Date();
    DateFormat dateFormat = new SimpleDateFormat("M/d"); // there are date format conventions (check
                                                         // what they are
                                                         // before assigning)
    String strDate = dateFormat.format(curDate);

    System.out.println("curDate is: " + curDate); // the strike through is due to new data classes
                                                  // from
    System.out.println("curDate hour is: " + curDate.getHours()); // JAVA 8; notes a better way of
                                                                  // completing task
    System.out.println("curDate time: " + curDate.getTime()); // helps with comparisons; epoch time
                                                              // converter/unix
                                                              // timestamp
    System.out.println("curDate converted/formated: " + strDate);
  }

  private void Session5() {

    // MATH
    System.out.println("Pi: " + Math.PI); // PI = public static constant
    System.out.println("Power: " + Math.pow(5, 3));

    System.out.println("\n"); // end of example

    Dog dog = new Dog(1, "A", 2, "white"); // create new instance of Dog

    // System.out.println("Check dog: " + dog);
    System.out.println("Dog Breed: " + dog.getBreed());

    SpecialDog specialDog = new SpecialDog();

    specialDog.fight();
    specialDog.getAge();

    List<Dog> dogList = new ArrayList<>(); // Set: only 2 of 3 dogs are listed (1 & 3 are seen as
                                           // duplicate of same)
    dogList.add(dog);

    Dog dog2 = new Dog(2, "B", 1, "black");
    dogList.add(dog2);

    Dog dog3 = new Dog(1, "C", 2, "blue");
    dogList.add(dog3);

    Collections.sort(dogList); // null gave error b/c it needs a comparable (what to sort by)
    // sorted by dogID; see Dog compare

    for (Dog d : dogList) {
      System.out.println(d);
    }

    System.out.println("\n"); // end of example

    Map<String, String> stateMap;
    {
      stateMap = new HashMap<>(); // TreeMap will automatically sort
      stateMap.put("CO", "Colorado");
      stateMap.put("OH", "Ohio");
      stateMap.put("NJ", "New Jersey"); // printed out of order; most efficient (OH, CO, NJ)
      // stateMap.put("CA", "California");
    }

    if (stateMap.get("OH") != null) {
      System.out.println(stateMap.get("OH"));
    }

    for (String key : stateMap.keySet()) {
      // do stuff
    }

    if (stateMap.get("CA") != null) {
      System.out.println(stateMap.get("CA"));
    } else {
      System.out.println("Not in the Map.");
    }

    for (String key : stateMap.keySet()) {
      System.out.println(key);
    }

    System.out.println("\n"); // end of example

    Set<Integer> intSet = new HashSet<>(); // Integer is wrapper; autobox; this can only take
                                           // objects

    intSet.add(10);
    intSet.add(12);
    intSet.add(15);
    intSet.add(8);
    intSet.add(10); // only prints once (as a set; 10 is only counted once); if list, both would be
                    // noted

    for (Integer x : intSet) {
      System.out.println(x);
    }

  }

  private void writeToFile() {
    try {

      String content = "Hello World!";

      File file = new File("exampleFile.txt");

      if (!file.exists()) {
        file.createNewFile();
      }

      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write(content);
      bw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
