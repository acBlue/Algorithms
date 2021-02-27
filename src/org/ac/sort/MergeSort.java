package org.ac.sort;

/**
 * 归并排序
 * <p>
 * 自顶向下
 */
public class MergeSort {


    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        Comparable[] aux = new Comparable[a.length];
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (Utils.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);

    }

    public static void sort(Comparable[] a, int lo, int hi) {

        if (hi <= lo) {
            return;
        }
        // int mid =   lo+(hi-lo)/2;  //取中间数
        int mid = (lo + hi) >>> 1;
        sort(a, lo, mid);    //分治计算左边
        sort(a, mid + 1, hi);  //分治计算右边
        merge(a, lo, mid, hi); //归并

    }


    public static void main(String[] args) {
        String[] a = new String[]{"B", "H", "A", "Z", "Y", "X", "G", "D", "C", "D"};
        sort(a);
        Utils.show(a);

    }

}
