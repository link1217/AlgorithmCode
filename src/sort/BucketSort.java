package sort;

import utils.ArrayUtils;

/**
 * 桶排序 Bucket Sort
 * 
 * O(N+C)，其中C=N*(logN-logM)
 * 
 * 不稳定
 * 
 * @author Watcher
 *
 */
public class BucketSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			bucketSort(arr1);
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
		bucketSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 桶排序：排序区间[-100,100]
	 * 
	 * @param arr
	 */
	public static void bucketSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		int[] bucket = new int[201];
		for (int i = 0; i < arr.length; i++)
			bucket[arr[i] + 100]++;
		for (int i = 0, j = 0; i < bucket.length; i++)
			while (bucket[i]-- > 0)
				arr[j++] = i - 100;
	}
}
