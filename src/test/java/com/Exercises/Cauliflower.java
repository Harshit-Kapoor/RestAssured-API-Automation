package com.Exercises;

import io.restassured.path.json.JsonPath;

import java.util.HashMap;
import java.util.List;

public class Cauliflower {

    public static void main(String[] args) {

        String jsonResponse = "{\n" +
                "\n" +
                "\"Name\": \"Vegetables\",\n" +
                "\n" +
                "\"Number\": \"0001-0123-\",\n" +
                "\n" +
                "\"Path\": \"/Grocery-Store/Vegetables\",\n" +
                "\n" +
                "\"Subcategories\": [\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"Name\": \"Broccoli\",\n" +
                "\n" +
                "\"Number\": \"0001-0123-0456-\",\n" +
                "\n" +
                "\"Path\": \"/Grocery-Store/Vegetables/Broccoli\",\n" +
                "\n" +
                "\"HasClassifieds\": true,\n" +
                "\n" +
                "\"AreaOfBusiness\": 3,\n" +
                "\n" +
                "\"IsLeaf\": true\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"Name\": \"Cauliflower\",\n" +
                "\n" +
                "\"Number\": \"0001-0123-0457-\",\n" +
                "\n" +
                "\"Path\": \"/Grocery-Store/Vegetables/Cauliflower\",\n" +
                "\n" +
                "\"Count\": 1,\n" +
                "\n" +
                "\"HasClassifieds\": true,\n" +
                "\n" +
                "\"AreaOfBusiness\": 3,\n" +
                "\n" +
                "\"IsLeaf\": true\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"Name\": \"Potato\",\n" +
                "\n" +
                "\"Number\": \"0001-0123-0458-\",\n" +
                "\n" +
                "\"Path\": \"/Grocery-Store/Vegetables/Potato\",\n" +
                "\n" +
                "\"HasClassifieds\": true,\n" +
                "\n" +
                "\"AreaOfBusiness\": 3,\n" +
                "\n" +
                "\"IsLeaf\": true\n" +
                "\n" +
                "},\n" +
                "\n" +
                "\n" +
                "],\n" +
                "\n" +
                "\"Count\": 4,\n" +
                "\n" +
                "\"HasClassifieds\": true,\n" +
                "\n" +
                "\"AreaOfBusiness\": 3,\n" +
                "\n" +
                "\"IsLeaf\": false\n" +
                "\n" +
                "}";


        JsonPath js = new JsonPath(jsonResponse);

        List<HashMap<String, Object>> list = js.getList("Subcategories");

        for (HashMap<String, Object> m : list) {

            if (m.get("Name").equals("Cauliflower")) {
                System.out.println(m.get("Count"));
            }

        }

    }
}


/*

{
  "Name": "Vegetables",
  "Number": "0001-0123-",
  "Path": "/Grocery-Store/Vegetables",
  "Subcategories": [
    {
      "Name": "Broccoli",
      "Number": "0001-0123-0456-",
      "Path": "/Grocery-Store/Vegetables/Broccoli",
      "HasClassifieds": true,
      "AreaOfBusiness": 3,
      "IsLeaf": true
    },
    {
      "Name": "Cauliflower",
      "Number": "0001-0123-0457-",
      "Path": "/Grocery-Store/Vegetables/Cauliflower",
      "Count": 1,
      "HasClassifieds": true,
      "AreaOfBusiness": 3,
      "IsLeaf": true
    },
    {
      "Name": "Potato",
      "Number": "0001-0123-0458-",
      "Path": "/Grocery-Store/Vegetables/Potato",
      "HasClassifieds": true,
      "AreaOfBusiness": 3,
      "IsLeaf": true
    }
  ],
  "Count": 4,
  "HasClassifieds": true,
  "AreaOfBusiness": 3,
  "IsLeaf": false
}


 */