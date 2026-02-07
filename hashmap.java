import java.util.*;
public class hashmap {
    public static void main(String srgs[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("india",140);
        // map.remove("india");
        map.put("china",150);
        map.put("usa",100);
        System.out.println(map);
        System.out.println(map.containsKey("usa"));
        System.out.println(map.isEmpty());
        // removes all values in the hashmap
        map.clear();
    }
    }

// .containskey("usa")}
