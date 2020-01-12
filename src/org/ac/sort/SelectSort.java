package org.ac.sort;

/**
 * 选择排序
 */
public class SelectSort {

    public static void sort(Comparable[] a) {
        //从左往右遍历
        for (int i = 0, N = a.length; i < N; i++) {
            //假设第i位上的数据就是最小的
            int min = i;
            // 取第i位右边边的一位往右遍历
            for (int j = i + 1; j < N; j++) {

                if (Utils.less(a[j], a[min])) {
                    //如果发现右边的数据比i位上的数据还要小,就交换他们的位置
                    Utils.exch(a, j, min);
                }

            }


        }

    }

    public static void main(String[] args) {

        String[] a = new String[]{"B", "H", "A", "Z", "Y", "X", "G", "D", "C","D"};

        sort(a);
        Utils.show(a);

    }

}



