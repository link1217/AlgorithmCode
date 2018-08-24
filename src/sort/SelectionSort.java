package sort;

import utils.ArrayUtils;

/**
 * 选择排序 Selection Sort
 * 
 * 时间复杂度： O(n²)
 * 
 * 不稳定
 * 
 * @author Watcher
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			selectionSort(arr1);
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
		selectionSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 常规的选择排序
	 * 
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[min] > arr[j])
					min = j;
			ArrayUtils.swap(arr, i, min);
		}

	}

}
