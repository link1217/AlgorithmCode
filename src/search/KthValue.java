package search;

import utils.ArrayUtils;

import java.util.Arrays;

public class KthValue {

    /**
     * 利用BFPRT算法查找数组中第k小的数
     *
     * @param arr
     * @param k
     * @return
     */
    public static int findKthByBFPRT(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k > arr.length || k < 0)
            return -1;
        return BFPRT.findK(arr, 0, arr.length - 1, k);
    }

    public static int findKthByPartition(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k > arr.length || k < 0)
            return -1;
        return findKthByPartition(arr, 0, arr.length - 1, k - 1);
    }

    private static int findKthByPartition(int[] arr, int start, int end, int k) {
        if (start >= end)
            return arr[start];
        swap(arr, end, start + (int) (Math.random() * (end - start + 1)));
        int[] p = partiton(arr, start, end);
        if (k >= p[0] && k <= p[1])
            return arr[p[0]];
        else if (k < p[0])
            return findKthByPartition(arr, start, p[0] - 1, k);
        else
            return findKthByPartition(arr, p[1] + 1, end, k);
    }

    private static int[] partiton(int[] arr, int start, int end) {
        int less = start - 1, more = end;
        while (start < more) {
            if (arr[start] < arr[end])
                swap(arr, ++less, start++);
            else if (arr[start] > arr[end])
                swap(arr, --more, start);
            else
                start++;
        }
        swap(arr, more, end);
        return new int[]{less + 1, more};
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }

    public static void main(String[] args) {
        int times = 10000, maxSize = 100, maxValue = 100;
        boolean flag = true;
        while (times-- > 0) {
            int[] arr = ArrayUtils.getRandomArray(maxSize, maxValue); // 获得一个长度为maxSize，取值范围0-maxValue的数组
            if (arr.length == 0)
                continue;
            int k = (int) (Math.random() * arr.length) + 1; // k为1-arr.length之间的某个数
            int res = findKthByPartition(arr, k);
            Arrays.sort(arr);
            if (res != arr[k - 1])
                flag = false;
            if (!flag) {
                System.out.println(k);
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
        System.out.println(flag == true ? "Nice!" : "Fucking fucked!!");
    }
}
