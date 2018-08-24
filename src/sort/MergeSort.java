package sort;

import utils.ArrayUtils;

/**
 * 归并排序 Merge Sort
 * 
 * 时间复杂度 O(nlogn)
 * 
 * 稳定
 * 
 * @author Watcher
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			mergeSort(arr1);
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
		mergeSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 归并排序
	 * 
	 * @param arr
	 */
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi)
			return;
		int mid = lo + ((hi - lo) >> 1);
		mergeSort(arr, lo, mid);
		mergeSort(arr, mid + 1, hi);
		merge(arr, lo, mid, hi);
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		int[] help = new int[hi - lo + 1]; // 辅助数组
		int p1 = lo, p2 = mid + 1, index = 0;
		while (p1 <= mid && p2 <= hi)
			help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		while (p1 <= mid)
			help[index++] = arr[p1++];
		while (p2 <= hi)
			help[index++] = arr[p2++];
		for (int i = 0; i < help.length; i++)
			arr[lo + i] = help[i];
	}
}
