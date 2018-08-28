package search;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 斐波那契查找
 * 
 * @author Watcher
 *
 */
public class FibonacciSearch {

	public final static int MAXSIZE = 20; // 斐波那契数组的最大长度

	/**
	 * 构建斐波那契数列
	 * 
	 * @return
	 */
	public static int[] fibonacci() {
		int[] f = new int[MAXSIZE];
		f[0] = f[1] = 1;
		for (int i = 2; i < MAXSIZE; i++)
			f[i] = f[i - 1] + f[i - 2];
		return f;
	}

	/**
	 *  斐波那契查找
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int fibonacciSearch(int[] arr, int num) {
		if (arr == null || arr.length == 0 || num < arr[0] || num > arr[arr.length - 1])
			return -1;
		int start = 0, end = arr.length - 1, mid;
		int k = 0; // 斐波那契分割数值下标
		int[] f = fibonacci();
		while (arr.length > f[k] - 1) // 获取斐波那契分割数值下标
			k++;
		int[] tmp = new int[f[k] - 1];// 创建临时数组
		for (int j = 0; j < arr.length; j++)
			tmp[j] = arr[j];
		for (int i = arr.length; i < tmp.length; i++) // 补充的元素值为最后一个元素的值
			tmp[i] = tmp[end];
		while (start <= end) {
			mid = start + f[k - 1] - 1; // 前半部分有f[k-1]个元素，由于下标从0开始则-1 获取 黄金分割位置元素的下标
			if (tmp[mid] > num) {
				end = mid - 1;
				k -= 1;
			} else if (tmp[mid] < num) {
				start = mid + 1;
				k -= 2;
			} else {
				if (mid <= end)
					return mid;
				else
					return end; // 出现这种情况是查找到补充的元素，而补充的元素与high位置的元素一样
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr = ArrayUtils.getRandomArrayWithoutRepeat(maxSize, maxValue);
			Arrays.sort(arr); // 排序
			int num = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
			int res1 = fibonacciSearch(arr, num);
			int res2 = SequentialSearch.sequentialSearch(arr, num);
			if (res1 != res2) {
				System.out.println("my result: " + res1);
				System.out.println("real result: " + res2);
				flag = false;
				break;
			}
		}
		System.out.println(flag == true ? "Nice!" : "Fucking fucked!!");
		System.out.println("----------");
		int[] arr = ArrayUtils.getRandomArrayWithoutRepeat(maxSize, maxValue);
		Arrays.sort(arr);
		int num = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		System.out.print("Array: ");
		ArrayUtils.printArray(arr);
		System.out.println("num: " + num);
		int res1 = fibonacciSearch(arr, num);
		int res2 = SequentialSearch.sequentialSearch(arr, num);
		System.out.println("my result: " + res1);
		System.out.println("real result:  " + res2);
	}
}
