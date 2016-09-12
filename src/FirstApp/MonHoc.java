package FirstApp;

import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by truon on 12/09/2016.
 */
public class MonHoc {
    private int maMonHoc;
    private String tenMonHoc;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(int maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public void nhapMonHoc() {
        System.out.println("Nhập tên môn học: ");
        String tenMonHoc = new Scanner(System.in).nextLine();
        this.setTenMonHoc(tenMonHoc);
        System.out.println("Nhập mã môn học: ");
        int maMonHoc = new Scanner(System.in).nextInt();
        this.setMaMonHoc(maMonHoc);
        System.out.println("Nhập số tín chỉ môn học: ");
        int soTinChi = new Scanner(System.in).nextInt();
        this.setSoTinChi(soTinChi);
    }

    public void showMonHoc() {
        System.out.println("Tên môn học: " + this.getTenMonHoc());
        System.out.println("Mã môn học: " + this.getMaMonHoc());
        System.out.println("Số tín chỉ môn học: " + this.getSoTinChi());
        System.out.println();
    }

}
