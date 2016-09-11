package FirstApp;

import java.util.Scanner;

/**
 * Created by truon on 11/09/2016.
 */
public class SinhVien {

    String ten;
    Date ngaySinh = new Date();
    int msv;

    SinhVien() {

    }

    SinhVien(String ten, int msv, Date ngaySinh) {
        this.msv = msv;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }


    public void nhapThongTin() {
        System.out.print("Vui lòng nhập Tên: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Vui lòng nhập Mã sinh viên: ");
        this.msv = new Scanner(System.in).nextInt();
        System.out.println("Vui lòng nhập ngày sinh");
        this.ngaySinh.setDateFormKeyboard();
    }

    public void inThongTin() {
        System.out.println("Thông tin của sinh viên: " + this.ten);
        System.out.println("Mã  sinh viên: " + this.msv);
        System.out.println("Tên: " + this.ten);
        System.out.println("Ngày sinh: " + ngaySinh.getDate());
        System.out.println("Tuổi: " + ngaySinh.getSoTuoi());
    }

    String soSanhTuoi(SinhVien sv) {
        if (this.ngaySinh.soSanh(sv.ngaySinh) == 1) {
            return "Lớn tuổi hơn";
        }
        if (this.ngaySinh.soSanh(sv.ngaySinh) == -1) {
            return "Nhỏ tuổi hơn";
        } else {
            return "Bằng tuổi nhau";
        }
    }

}
