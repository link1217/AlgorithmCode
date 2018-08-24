package sort;

import utils.ArrayUtils;

/**
 * 希尔排序 Shell Sort
 * 
 * 时间复杂度： O(n)-O(nlog²n)
 * 
 * 不稳定
 * 
 * @author Watcher
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			shellSort(arr1);
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
		shellSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 希尔排序
	 * 
	 * @param arr
	 * @return
	 */
	public static void shellSort(int[] arr) {
		int i, j, temp;
		for (int h = arr.length / 2; h > 0; h /= 2)
			for (i = h; i < arr.length; i++) {
				temp = arr[i];
				for (j = i - h; j >= 0; j -= h)
					if (temp < arr[j])
						arr[j + h] = arr[j];
					else
						break;
				arr[j + h] = temp;
			}
	}
}
