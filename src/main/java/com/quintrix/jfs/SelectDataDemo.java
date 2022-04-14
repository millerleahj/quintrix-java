package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDataDemo {
  public static void main(String[] args) {
    Connection connection = null;
    Statement insertStmt = null;
    Statement selectStmt = null;
    try {
      // Class.forName("com.mysql.jdbc.Driver"); //is giving error when run
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", ""); // had
                                                                                                 // to
                                                                                                 // change
                                                                                                 // name
                                                                                                 // to
                                                                                                 // match
                                                                                                 // the
                                                                                                 // database
                                                                                                 // name
                                                                                                 // used
                                                                                                 // on
                                                                                                 // DbVisualizer

      /*
       * insertStmt = connection.createStatement(); insertStmt.
       * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (1,'Lokesh','Gupta',5)"
       * ); insertStmt.
       * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (2,'howtodoinjava','com',5)"
       * );
       */

      selectStmt = connection.createStatement();
      ResultSet rs =
          selectStmt.executeQuery("SELECT ID,FIRST_NAME,LAST_NAME FROM EMPLOYEE WHERE ID <= 10"); // needed
                                                                                                  // the
                                                                                                  // FROM
                                                                                                  // keyword
      while (rs.next()) {
        System.out.println(rs.getInt(1) + "|" + rs.getString(2) + " " + rs.getString(3)); // All
                                                                                          // together
        // System.out.println(rs.getString(2)); // Second Column
        // System.out.println(rs.getString(3)); // Third Column
        // System.out.println(rs.getString(4)); // Fourth Column
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        selectStmt.close(); // ALWAYS CLOSE WHEN DONE
        // insertStmt.close();
        connection.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
