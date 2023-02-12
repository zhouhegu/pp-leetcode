package main.java.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gupp
 * @date 2023/2/12 21:10
 * 把非负整数数组所有元素拼接成一个最小的数
 */
public class MinNumber {
    public static String minNumber(int[] nums) {
        List<String> strList = Arrays.stream(nums).boxed().map(String::valueOf).sorted((x, y) -> (x + y).compareTo(y + x)).collect(Collectors.toList());
        StringBuilder res = new StringBuilder();
        strList.forEach(res::append);
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(minNumber(nums));
    }
}
