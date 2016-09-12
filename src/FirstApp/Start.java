package FirstApp;

import java.util.Scanner;

/**
 * Created by truon on 12/09/2016.
 */
public class Start {
    public static void main(String args[]) {

        Gui gui = new Gui();

        do {
            gui.root();
            gui.valueSeclect = new Scanner(System.in).nextInt();
            switch (gui.valueSeclect) {
                case 1:
                    gui.nhapDanhSach();
                    break;
                case 2:
                    gui.showDanhSach();
                    break;
                case 3:
                    gui.sapXep();
                    break;
                default:
                    break;
            }
        } while (gui.valueSeclect != 4);

    }


}
