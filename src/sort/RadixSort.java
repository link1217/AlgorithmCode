package sort;

import utils.ArrayUtils;

/**
 * 基数排序 Radix Sort
 * 
 * O (nlog(r)m)，其中r为所采取的基数，而m为堆数
 * 
 * 稳定
 * 
 * @author Watcher
 *
 */
public class RadixSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			radixSort(arr1);
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
		radixSort(arr);
		ArrayUtils.printArray(arr);
	}

	public static void radixSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		radixSort(arr, 0, arr.length - 1, maxbits(arr));
	}

	private static void radixSort(int[] arr, int start, int end, int digit) {
		final int radix = 19; // [-9,9] =>[0,18]
		int[] count = new int[radix];
		int[] bucket = new int[end - start + 1];
		for (int d = 1; d <= digit; d++) {
			for (int i = 0; i < radix; i++)
				count[i] = 0;
			for (int i = start; i <= end; i++) {
				int j = getDigit(arr[i], d);
				count[j]++;
			}
			for (int i = 1; i < radix; i++)
				count[i] += count[i - 1];
			for (int i = end; i >= start; i--) {
				int j = getDigit(arr[i], d);
				bucket[--count[j]] = arr[i];
			}
			for (int i = start, j = 0; i <= end; i++, j++)
				arr[i] = bucket[j];
		}

	}

	private static int getDigit(int i, int d) {
		while (--d > 0)
			i /= 10;
		return i % 10 + 9; // [-9,9] =>[0,18]
	}

	private static int maxbits(int[] arr) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		int res = 0;
		while (max != 0 || min != 0) {
			res++;
			max /= 10;
			min /= 10;
		}
		return res;
	}
}
