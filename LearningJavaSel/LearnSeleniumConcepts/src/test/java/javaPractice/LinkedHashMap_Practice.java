package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Practice {

    public static void main(String[] args) {
        LinkedHashMap_Practice obj = new LinkedHashMap_Practice();

        // Get LinkedHashMap from method
        LinkedHashMap<String, String> map = obj.getcredmap();

        // Get values using keys
        System.out.println("customer1: " + map.get("customer1"));
        System.out.println("customer2: " + map.get("customer2"));

        // Get both keys and values using entrySet
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Using EntrySet ");
            System.out.println("Key : " + key);
            System.out.println("Value : " + value);
        }

        // Get values using values()
        System.out.println("All values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Get keys and values using keySet()
        System.out.println("Using keySet:");
        for (String key : map.keySet()) {
            System.out.println("Key : " + key);
            System.out.println("Value : " + map.get(key));
        }
    }

    public LinkedHashMap<String, String> getcredmap() {
        LinkedHashMap<String, String> usermap = new LinkedHashMap<>();
        usermap.put("customer1", "Ramu");
        usermap.put("customer2", "Somu:Test@123");
        usermap.put("customer3", "Balu:Pass@456");
        return usermap;
    }
}
