package org.ac.sort;

/**
 * 希尔排序
 */
public class ShellSort {

    public static void sort(Comparable[] a) {

        int N = a.length;

        System.out.println("N:" + N);
        int h = 1;
        //   System.out.println("h=:"+h);
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && Utils.less(a[j], a[j - h]); j -= h) {
                    System.out.println("j=:" + j + "   h=:" + h + "   j-h=:" + (j - h));
                    Utils.exch(a, j, j - h);

                    Utils.show(a);

                }
            }
            h = h / 3;
        }


    }


    public static void main(String[] args) {
        String[] a = new String[]{"B", "H", "A", "Z", "Y", "X", "G", "D", "C", "D"};
        sort(a);
        Utils.show(a);

    }

}
