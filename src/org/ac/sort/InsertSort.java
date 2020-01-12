package org.ac.sort;

/**
 * 插入排序
 */
public class InsertSort {

    public static void sort(Comparable[] a) {

        int N = a.length;
        //从第二个元素开始循环
        for (int i = 1; i < N; i++) {

            //取出第二个元素与其左边的元素对比，如果比左边的要小就交换 这两个元素的位置
            for (int j = i; j > 0 && Utils.less(a[j ], a[j-1]); j--) {
                Utils.exch(a, j, j - 1);

                Utils.show(a);
            }
        }


    }


    public static void main(String[] args) {
        String[] a = new String[]{"B", "H", "A", "Z", "Y", "X", "G", "D", "C", "D"};
        sort(a);
        Utils.show(a);

    }


}
