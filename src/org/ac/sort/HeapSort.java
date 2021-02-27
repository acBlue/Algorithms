package org.ac.sort;


import static org.ac.sort.Utils.exch;
import static org.ac.sort.Utils.less;

/**
 * 堆排序
 */
public class HeapSort {


    public static void sort(Comparable[] a) {

        heapInsert(a);

        int size = a.length;

        while (size > 1) {
            exch(a, 0, size - 1);
            size--;
            heapify(a, 0, size);
        }


    }

    private static void heapify(Comparable[] a, int i, int size) {

        int left = i * 2 + 1;

        int right = i * 2 + 2;

        while (left<size){
             int largesIndex ;
            if (less(a[left] ,a[right]) && right< size){
                           largesIndex = right;
            }else {
                largesIndex = left;
            }


            if (less(a[largesIndex],a[i])){
                   largesIndex = i;
            }

            if (i == largesIndex)
                break;


            exch(a,largesIndex,i);

            left = 2* i +1;

            right =2*i+ 2;

        }

    }

    private static void heapInsert(Comparable[] a) {

        for (int i = 0; i < a.length; i++) {

            int currentIndex = i;

            int fatherIndex = (currentIndex - 1) / 2;

            while (less(a[fatherIndex], a[currentIndex])) {
                exch(a, currentIndex, fatherIndex);
                currentIndex = fatherIndex;
                fatherIndex = (currentIndex - 1) / 2;
            }

        }


    }


    public static void main(String[] args) {

        String[] a = new String[]{"B", "H", "A", "Z", "Y", "X", "G", "D", "C", "D"};
        sort(a);
        Utils.show(a);



    }


}
