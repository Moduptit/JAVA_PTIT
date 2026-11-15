import java.io.*;
import java.util.*;

public class bai4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("VANBAN.in"), "UTF-8"));
        br.readLine(); // bỏ dòng N

        Map<String, Integer> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            for (String w : line.toLowerCase().split("[^\\p{L}\\p{N}]+"))
                if (!w.isEmpty()) map.merge(w, 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> !a.getValue().equals(b.getValue())
                ? b.getValue() - a.getValue()
                : a.getKey().compareTo(b.getKey()));

        for (Map.Entry<String, Integer> e : list)
            System.out.println(e.getKey() + " " + e.getValue());
        br.close();
    }
}