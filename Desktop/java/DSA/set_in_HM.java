import java.util.*;
public class set_in_HM {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("india",140);
        map.put("china",150);
        map.put("usa",100);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String k : keys){
            System.out.println("key :" +k +"value : " +map.get(k));
        }
    }
}
