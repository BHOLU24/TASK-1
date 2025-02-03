import java.util.LinkedHashMap;         // import linked hashmap 
import java.util.Map;

public class Hashmap{
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();    // hashmap sysntax

        map.put("A", 100);
        map.put("C", 300);
        map.put("B", 200);

        System.out.println(map); // {A=100, C=300, B=200} (Insertion order preserved)
    }
}