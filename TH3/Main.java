import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    // In số: bỏ số 0 thừa, tối đa 2 chữ số thập phân, không dùng ký hiệu khoa học
    static String fmt(BigDecimal x) {
        return x.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
    }

    public static void main(String[] args) throws Exception {
        File f = new File("sanpham.dat");
        BufferedReader br = new BufferedReader(
                f.exists() ? new FileReader(f) : new InputStreamReader(System.in));

        // Đọc tất cả dòng không rỗng
        List<String> lines = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) {
            if (!s.trim().isEmpty()) lines.add(s.trim());
        }
        br.close();
        if (lines.isEmpty()) return;

        int n = Integer.parseInt(lines.get(0));
        int idx = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String ten = lines.get(idx++);
            String loai = lines.get(idx++);
            String[] p = lines.get(idx++).split("\\s+");

            int sl = Integer.parseInt(p[0]);
            BigDecimal gia = new BigDecimal(p[1]);

            // Mã sản phẩm: loại + số thứ tự 3 chữ số
            String ma = loai + String.format("%03d", i);

            // Thành tiền
            BigDecimal tt = gia.multiply(BigDecimal.valueOf(sl));
            if (loai.equalsIgnoreCase("A")) tt = tt.multiply(new BigDecimal("0.90"));
            else if (loai.equalsIgnoreCase("B")) tt = tt.multiply(new BigDecimal("0.95"));

            // Xếp loại
            String xepLoai;
            if (sl < 30) xepLoai = "ngung ban";
            else if (sl <= 50) xepLoai = "ban";
            else xepLoai = "ban nhanh";

            sb.append(ma).append(" ").append(ten).append(" ").append(sl).append(" ")
              .append(fmt(gia)).append(" ").append(fmt(tt)).append(" ")
              .append(xepLoai).append("\n");
        }
        System.out.print(sb);
    }
}