package search;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 插值查找
 * 
 * @author Watcher
 *
 */
public class InsertionSearch {

	/**
	 * 递归版插值查找
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int insertionSearchRecur(int[] arr, int num) {
		if (arr == null || arr.length == 0 || num < arr[0] || num > arr[arr.length - 1])
			return -1;
		return insertionSearchRecur(arr, 0, arr.length - 1, num);
	}

	private static int insertionSearchRecur(int[] arr, int start, int end, int num) {
		if (start > end || arr[start] > num || arr[end] < num)
			return -1;
		int mid = start + (int) ((num - arr[start]) * 1.0 / (arr[end] - arr[start]) * (end - start));
		if (arr[mid] > num)
			return insertionSearchRecur(arr, start, mid - 1, num);
		else if (arr[mid] < num)
			return insertionSearchRecur(arr, mid + 1, end, num);
		else
			return mid;
	}

	/**
	 * 非递归版插值查找
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int insertionSearchUnRecur(int[] arr, int num) {
		if (arr == null || arr.length == 0 || num < arr[0] || num > arr[arr.length - 1])
			return -1;
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			if (arr[start] > num || arr[end] < num) // 不加这个过滤条件可能进入死循环
				return -1;
			mid = start + (int) ((num - arr[start]) * 1.0 / (arr[end] - arr[start]) * (end - start));
			if (arr[mid] > num)
				end = mid - 1;
			else if (arr[mid] < num)
				start = mid + 1;
			else
				return mid;
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
			int res1 = insertionSearchRecur(arr, num);
//			int res1 = insertionSearchUnRecur(arr, num);
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
		int res1 = insertionSearchRecur(arr, num);
//		int res1 = insertionSearchUnRecur(arr, num);
		int res2 = SequentialSearch.sequentialSearch(arr, num);
		System.out.println("my result: " + res1);
		System.out.println("real result:  " + res2);
	}
}
