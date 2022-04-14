package com.quintrix.jfs;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.quintrix.jfs.models.MessageRole;



public class JSONParser {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


  }



  public void Json() {
    String jsonStr = "{\n" + "    \"message\": \"Hello\",\n" + "    \"role\": \"admin\"\n" + "}";

    // Map<String, Object> params = new HashMap<>();
    // params.put("message", "Hello \"World\"");
    /*
     * 
     */
    try {
      // Map<String, String> messageMap = new HashMap<>();
      // messageMap = new ObjectMapper().readValue(jsonStr, Map.class);
      MessageRole messageRole = new ObjectMapper().readValue(jsonStr, MessageRole.class);

      System.out.println("Java Map: " + messageRole);

      System.out.println(messageRole.getMessage());

      if (messageRole.getMessage().equals("Hello")) {
        System.out.println("It is Hello.");

      } else {
        System.out.println("It is not Hello.");
      }
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }

  public void CsvFile() {
    // CSV file open/read
    // Keep getting error message

    String fileName = "Documents\\workspace\\quintrix\\country.txt";

    try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
      List<String[]> r = reader.readAll();
      r.forEach(x -> System.out.println(Arrays.toString(x)));
    } catch (Exception e) {
      System.out.println("An error occured.");
    }
  }

}

/*
 * NOTES:
 * 
 * add dependencies and 3rd party libraries to use
 * 
 * Maven repository: .m2 > repository > groupId > artifactId > version ALSO settings.xml
 * 
 * import from libraries (objectmapper/jsonprocessingexception)
 * 
 * used to translate json if using HashMap need to know the specific key words to work; use class to
 * work through easier
 * 
 * json to java (jsonschema2pojo) paste and note settings to create the class file required to
 * read/use file needs to use correct case type (camelCase or lowercase)
 * 
 * try to read file using 3rd party library (CSV)
 * 
 */
