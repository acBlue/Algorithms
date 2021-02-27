package org.ac.sort;

public class Utils {

    public static boolean less(Comparable a ,Comparable b){
        return  a.compareTo(b) <0;
    }

    public static void exch(Comparable[] a ,int i ,int j){
        Comparable temp  = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

     public static boolean  isSort(Comparable[] a){
         for (int i = 1 ,N = a.length; i < N; i++) {
             if ( less(a[i],a[i-1])) {
                 return false;
             }
         }
         return  true;
     }

     public static void show(Comparable[] a){
         System.out.println("打印:");
         for (int i = 0,N = a.length; i < N; i++) {
             System.out.print(a[i]+" ");
         }
         System.out.println("");

     }


    public static void main(String[] args) {
        String[]  a = new String[]{"A","C","D","E","G","H"};

        System.out.println(isSort(a));
    }
}


