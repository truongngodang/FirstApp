package FirstApp;

import java.util.Scanner;

/**
 * Created by truon on 11/09/2016.
 */
public class ThoiGian {

    int ngay, thang, nam;

    private static final int LON_HON = 1;
    private static final int BANG_NHAU = 0;
    private static final int BE_HON = -1;

    ThoiGian() {
        this.ngay = 1;
        this.ngay = 1;
        this.nam = 1990;
    }

    ThoiGian(int ngay, int thang, int nam) {
        this.nam = nam;
        this.ngay = ngay;
        this.thang = thang;
    }

    int soSanh(ThoiGian date) {
        if (this.getSoNgay() > date.getSoNgay()) {
            return LON_HON;
        }
        if (this.getSoNgay() < date.getSoNgay()) {
            return BE_HON;
        }
        return BANG_NHAU;
    }

    protected void setDateFormKeyboard() {
        int i = 0, j = 0, z = 0;
        System.out.println("Ngày: ");
        do {
            if (i > 0) {
                System.out.println("Nhập sai ngày vui lòng nhập lại!");
            }
            this.ngay = new Scanner(System.in).nextInt();
            i++;
        } while (this.ngay > 31 || this.ngay < 0);
        System.out.println("Tháng: ");
        do {
            if (j > 0) {
                System.out.println("Nhập sai tháng vui lòng nhập lại!");
            }
            this.thang = new Scanner(System.in).nextInt();
            j++;
        } while (this.thang > 12 || this.thang < 0);
        System.out.println("Năm: ");
        do {
            if (z > 0) {
                System.out.println("Nhập sai năm vui lòng nhập lại!");
            }
            this.nam = new Scanner(System.in).nextInt();
            z++;
        } while (this.nam < 0);
    }

    String getDate() {
        return ngay + "/" + thang + "/" + nam;
    }

    boolean checkNamNhuan() {
        if (this.nam % 4 == 0) {
            return true;
        }
        return false;
    }

    int getSoNgayOfThang(int thang) {
        if (thang > 7) {
            if (thang % 2 == 0) {
                return 31;
            } else {
                return 30;
            }
        } else {
            if (thang % 2 == 0) {
                if (thang == 2) {
                    if (checkNamNhuan())
                        return 29;
                    return 28;
                } else {
                    return 30;
                }
            } else {
                return 31;
            }
        }
    }

    int getSoNgay() {
        int soNgayDenThis = 0;
        int soNgayDenHienTai = 0;
        ThoiGian zero = new ThoiGian(1, 1, this.nam);
        ThoiGian hienTai = new ThoiGian(11, 9, 2016);
        while (zero.nam < this.nam) {
            if (zero.checkNamNhuan()) {
                soNgayDenThis += 366;
            } else {
                soNgayDenThis += 365;
            }
            zero.nam++;
        }
        for (int i = 1; i < this.thang; i++) {
            soNgayDenThis += this.getSoNgayOfThang(i);
        }
        soNgayDenThis += this.ngay;
        zero.nam = this.nam;
        while (zero.nam < hienTai.nam) {
            if (zero.checkNamNhuan()) {
                soNgayDenHienTai += 366;
            } else {
                soNgayDenHienTai += 365;
            }
            zero.nam++;
        }
        for (int i = 1; i < hienTai.thang; i++) {
            soNgayDenHienTai += hienTai.getSoNgayOfThang(i);
        }
        soNgayDenHienTai += hienTai.ngay;

        return soNgayDenHienTai - soNgayDenThis;

    }

    String getSoTuoi() {
        int soNgayConLai = this.getSoNgay();
        int soTuoi = 0;
        ThoiGian hienTai = new ThoiGian(11, 9, 2016);
        while (this.nam < hienTai.nam) {
            if (this.checkNamNhuan()) {
                soNgayConLai -= 366;
            } else {
                soNgayConLai -= 365;
            }
            soTuoi++;
            this.nam++;
        }
        return soTuoi + " Tuổi " + soNgayConLai + " Ngày! ";
    }
}
