package search;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 二分查找
 * 
 * @author Watcher
 *
 */
public class BinarySearch {

	/**
	 * 递归版二分查找
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int binarySearchRecursion(int[] arr, int num) {
		if (arr == null || arr.length == 0)
			return -1;
		return binarySearch(arr, 0, arr.length - 1, num);
	}

	private static int binarySearch(int[] arr, int start, int end, int num) {
		if (start > end)
			return -1;
		int mid = start + (end - start >> 1);
		if (arr[mid] > num)
			return binarySearch(arr, start, mid - 1, num);
		else if (arr[mid] < num)
			return binarySearch(arr, mid + 1, end, num);
		else
			return mid;
	}

	/**
	 * 非递归版二分查找
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int binarySearchUnRecursion(int[] arr, int num) {
		if (arr == null || arr.length == 0)
			return -1;
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start >> 1);
			if (arr[mid] == num)
				return mid;
			else if (arr[mid] > num)
				end = mid - 1;
			else
				start = mid + 1;
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
			// int res1 = binarySearchRecursion(arr, num);
			int res1 = binarySearchUnRecursion(arr, num);
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
		// int res1 = binarySearchRecursion(arr, num);
		int res1 = binarySearchUnRecursion(arr, num);
		int res2 = SequentialSearch.sequentialSearch(arr, num);
		System.out.print("Array: ");
		ArrayUtils.printArray(arr);
		System.out.println("num: " + num);
		System.out.println("my result: " + res1);
		System.out.println("real result： " + res2);
	}
}
