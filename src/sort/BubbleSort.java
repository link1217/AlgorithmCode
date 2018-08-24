package sort;

import utils.ArrayUtils;

/**
 * 冒泡排序 Bubble Sort
 * 
 * @author Watcher
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			// bubbleSort(arr1);
			bubbleSort2(arr1);
			ArrayUtils.comparator(arr2);
			if (!ArrayUtils.isEqual(arr1, arr2)) {
				System.out.println("bubble sort: ");
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
	}

	/**
	 * 常规的冒泡排序
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		for (int i = 0; i < arr.length; i++)
			for (int j = 1; j < arr.length - i; j++)
				if (arr[j] < arr[j - 1])
					ArrayUtils.swap(arr, j, j - 1);

	}

	/**
	 * 添加状态标志，优化的冒泡排序
	 * 
	 * @param arr
	 */
	public static void bubbleSort2(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		boolean flag = true;
		for (int i = 0; i < arr.length && flag; i++) {
			flag = false;
			for (int j = 1; j < arr.length - i; j++)
				if (arr[j] < arr[j - 1]) {
					ArrayUtils.swap(arr, j, j - 1);
					flag = true;
				}
		}
	}
}
