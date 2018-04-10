import java.util.Collection;
/*
@author: khoa
 */

public class SelectionSort {
    /*
    method selection sort list of integer
    input: list integer
    output: list sorted
    select max number, swap this number with start index
     */
    static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int temp = list[i];
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (temp > list[j]) {
                    temp = list[j];
                    index = j;
                }
            }
            if (i != index) {
                list[index] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] list = {6, 8, 1, 23, 44, 13};
        selectionSort(list);

        System.out.println(System.currentTimeMillis() - start);
        for (int number : list) {
            System.out.println(number + "\t");
        }
    }

}
