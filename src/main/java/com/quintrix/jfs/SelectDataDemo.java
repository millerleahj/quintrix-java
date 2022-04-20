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
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "");
      // created database JDBCDemo

      insertStmt = connection.createStatement();

      // String createTable = "CREATE TABLE EMPLOYEE " + "(ID INTEGER not NULL, "
      // + " FIRST VARCHAR(100), " + " LAST VARCHAR (100))";
      // insertStmt.executeUpdate(createTable);
      // Created table

      // example:
      // insertStmt.execute(
      // "INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (1,'Lokesh','Gupta',5)");
      // insertStmt.execute(
      // "INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES
      // (2,'howtodoinjava','com',5)");


      selectStmt = connection.createStatement();


      // String insertData = "INSERT INTO EMPLOYEE VALUES (1, 'LEAH', 'MILLER')";
      // insertStmt.executeUpdate(insertData);
      // inserted data

      // insertData = "INSERT INTO EMPLOYEE VALUES (2, 'GUPTA', 'LOKESH')";
      // insertStmt.executeUpdate(insertData);
      // inserted data


      ResultSet rs = selectStmt.executeQuery("SELECT ID,FIRST,LAST FROM EMPLOYEE WHERE ID <= 10");
      // needed FROM keyword
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
