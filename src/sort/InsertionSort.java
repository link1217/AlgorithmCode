package sort;

import utils.ArrayUtils;

/**
 * 插入排序 Insertion Sort
 * 
 * 时间复杂度： O(n²)
 * 
 * 稳定
 * 
 * @author Watcher
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			insertionSort(arr1);
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
		insertionSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 插入排序
	 * 
	 * @param arr
	 */
	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j > 0 && arr[j] < arr[j - 1]; j--)
				swap(arr, j, j - 1);
	}

	private static void swap(int[] arr, int i, int j) {
		if (i != j) {
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
		}
	}
}
