package FirstApp;

import java.util.Scanner;

/**
 * Created by truon on 12/09/2016.
 */
public class Gui extends MonHoc {

    protected int valueSeclect = 0;
    private int soMonHoc = 0;
    MonHoc[] list = new MonHoc[100];

    public void nhapDanhSach() {
        System.out.print("Nhập vào số lượng môn học: ");
        soMonHoc = new Scanner(System.in).nextInt();
        for (int i = 0; i < soMonHoc; i++) {
            list[i] = new MonHoc();
            list[i].nhapMonHoc();
        }
    }

    public void showDanhSach() {
        for (int i = 0; i < soMonHoc; i++) {
            list[i].showMonHoc();
        }
    }

    public void sapXep() {
        for (int i = 0; i < soMonHoc; i++) {
            for (int j = 0; j < soMonHoc; j++) {
                if (list[i].getSoTinChi() < list[j].getSoTinChi()) {
                    MonHoc temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public void root() {
        System.out.println("------------------Chương trình quản lý môn học------------------");
        System.out.println("1. Nhập danh sách môn học");
        System.out.println("2. Hiện danh sách môn học");
        System.out.println("3. Sắp xếp danh sách môn học theo tín chỉ");
        System.out.println("4. Thoát!");
        System.out.println("_____________________________________________________");
        System.out.print("Nhập lựa chọn: ");
    }
}
