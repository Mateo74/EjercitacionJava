package controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjercicioRadixSort {

    private static String[] convertToStrings(int[] arr) {
        String sArr[] = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sArr[i] = Integer.toString(arr[i]);
        }
        return sArr;
    }

    private static void makeEqualSize(String[] arr) {
        int maxSize = 0;
        for(String s : arr) {
            maxSize = Math.max(maxSize, s.length());
        }
        for(int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int cerosExtra = maxSize - s.length();
            for(int j = 0; j < cerosExtra; j++) {
                s = '0' + s;
            }
            arr[i] = s;
        }
    }

    public static void radixSort(int[] arr) {
        int n = arr.length;
        String[] sArr = convertToStrings(arr);
        makeEqualSize(sArr);
        int[] ind = new int[n];
        for(int i = 0; i < n; i++) {
            ind[i] = i;
        }
        ArrayList<Integer>[] listasLocas = new ArrayList[10];
        for(int i = 0; i < 10; i++) {
            listasLocas[i] = new ArrayList<>();
        }
        for(int digit = sArr[0].length() - 1; digit >= 0; digit--) {
            int pos = 0;
            for(int i = 0; i < n; i++) {
                int listIndex = sArr[ind[i]].charAt(digit) - '0';
                listasLocas[listIndex].add(ind[i]);
            }
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < listasLocas[i].size(); j++) {
                    ind[pos++] = listasLocas[i].get(j);
                }
                listasLocas[i].clear();
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sArr[ind[i]]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {16233, 987, 12, 9, 432, 919191, 12345, 99999999};
        radixSort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
