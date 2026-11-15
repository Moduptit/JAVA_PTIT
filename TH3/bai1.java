import java.io.*;
import java.util.*;

public class bai1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.IN"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n && sc.hasNextLine(); i++) {
            String line = sc.nextLine().toLowerCase();
            for (String w : line.split("[^a-z0-9]+")) {
                if (!w.isEmpty()) {
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        sc.close();
    }
}