package main.java.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gupp
 * @date 2023/2/12 16:26
 */
public class Sort {

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 冒泡排序 增加交换标识位 可能减少遍历次数
     */
    public static void bubbleSort2(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
        }
    }

    /**
     * 冒泡排序 增加发生交换位置记录 可能减少遍历次数
     */
    public static void bubbleSort3(int[] arr) {
        boolean swapped = true;
        // 最后一个没有经过排序的元素下标
        int indexOfLastUnsortedElement = arr.length - 1;
        // 上次发生交换的位置
        int swappedIndex = -1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                    swappedIndex = i;
                }
            }
            indexOfLastUnsortedElement = swappedIndex;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 8, 6, 3, 9};
        bubbleSort3(arr);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void goodSwap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
