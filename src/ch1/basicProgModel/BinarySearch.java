package ch1.basicProgModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] a = new In("tinyT.txt").readAllStrings();
        int[] whiteList = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            whiteList[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(a);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0) {
                StdOut.println(key);
            }
        }
    }

}
