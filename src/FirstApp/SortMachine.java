package FirstApp;

/**
 * Created by truon on 12/09/2016.
 */
public class SortMachine extends MonHoc {

    public void sortByTinChi(MonHoc monHoc[]) {
        for (int i = 0; i < monHoc.length; i++) {
            for (int j = 0; j < monHoc.length; j++) {
                if (monHoc[i].getSoTinChi() < monHoc[j].getSoTinChi()) {
                    MonHoc temp = monHoc[i];
                    monHoc[i] = monHoc[j];
                    monHoc[j] = temp;
                }
            }
        }
    }

}
