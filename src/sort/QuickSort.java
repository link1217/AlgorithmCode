package sort;

import utils.ArrayUtils;

/**
 * 快速排序 Quick Sort
 * 
 * 时间复杂度 O(nlogn)-O(n²)
 * 
 * 不稳定(理论上可以实现稳定)
 * 
 * @author Watcher
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			quickSort(arr1);
			ArrayUtils.comparator(arr2);
			if (!ArrayUtils.isEqual(arr1, arr2)) {
				System.out.println("my sort: ");
				ArrayUtils.printArray(arr1);
				System.out.println("comparator： ");
				ArrayUtils.printArray(arr2);
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Great!");
		else
			System.out.println("fucking fucked!!");
		System.out.println("----------");
		int[] arr = ArrayUtils.getRandomArray(maxSize, maxValue);
		System.out.println("排序前： ");
		ArrayUtils.printArray(arr);
		System.out.println("排序后： ");
		quickSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 快速排序
	 * 
	 * @param arr
	 */
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi)
			return;
		ArrayUtils.swap(arr, hi, lo + (int) (Math.random() * (hi - lo + 1)));
		int[] p = partition(arr, lo, hi);
		quickSort(arr, lo, p[0] - 1);
		quickSort(arr, p[1] + 1, hi);
	}

	private static int[] partition(int[] arr, int lo, int hi) {
		int less = lo - 1, more = hi;
		while (lo < more) {
			if (arr[lo] < arr[hi])
				ArrayUtils.swap(arr, ++less, lo++);
			else if (arr[lo] > arr[hi])
				ArrayUtils.swap(arr, --more, lo);
			else
				lo++;
		}
		ArrayUtils.swap(arr, more, hi);
		return new int[] { less + 1, more };
	}
}
