package FirstApp;

import java.util.Scanner;

/**
 * Created by truon on 11/09/2016.
 */
public class QuanLySinhVien {
    public static void main(String args[]) {

        SinhVien[] sv = new SinhVien[2];
        sv[0] = new SinhVien("Thúy Vân ", 127, new Date(11, 8, 1991));
        sv[1] = new SinhVien("Ngọc Trinh", 128, new Date(24, 8, 1991));

        for (int i = 0; i < sv.length; i++) {
            for (int j = 0; j < sv.length; j++) {
                if (sv[i].ngaySinh.soSanh(sv[j].ngaySinh) == -1) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }

        for (SinhVien sinhVien : sv) {
            sinhVien.inThongTin();
        }
        System.out.print(sv[0].ten + " " + sv[0].soSanhTuoi(sv[1]) + " " + sv[1].ten);
    }
}
