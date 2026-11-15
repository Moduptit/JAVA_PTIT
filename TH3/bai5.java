import java.io.*;
import java.util.*;

public class bai5 {
    // Chuẩn hóa: tách từ, viết hoa chữ đầu, nối bằng 1 dấu cách
    static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        for (String w : s.trim().split("\\s+")) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DANHSACH.in"));
        List<String> ds = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;   // bỏ dòng trống
            ds.add(chuanHoa(line));
        }
        br.close();

        ds.sort((a, b) -> {
            String[] x = a.split(" "), y = b.split(" ");
            // 1. so sánh tên (từ cuối)
            int c = x[x.length - 1].compareTo(y[y.length - 1]);
            if (c != 0) return c;
            // 2. so sánh họ (từ đầu)
            c = x[0].compareTo(y[0]);
            if (c != 0) return c;
            // 3. so sánh phần tên đệm (phần còn lại ở giữa)
            String demA = a.substring(x[0].length(), a.length() - x[x.length - 1].length());
            String demB = b.substring(y[0].length(), b.length() - y[y.length - 1].length());
            return demA.compareTo(demB);
        });

        for (String s : ds) System.out.println(s);
    }
}