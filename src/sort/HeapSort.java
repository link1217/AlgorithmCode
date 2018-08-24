package sort;

import utils.ArrayUtils;

/**
 * 堆排序 Heap Sort
 * 
 * 时间复杂度： O(nlogn)
 * 
 * 不稳定
 * 
 * @author Watcher
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int time = 10000, maxSize = 100, maxValue = 100;
		boolean flag = true;
		while (time-- > 0) {
			int[] arr1 = ArrayUtils.getRandomArray(maxSize, maxValue);
			int[] arr2 = ArrayUtils.copyArray(arr1);
			heapSort(arr1);
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
		heapSort(arr);
		ArrayUtils.printArray(arr);
	}

	/**
	 * 堆排序
	 * 
	 * @param arr
	 */
	public static void heapSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		int size = arr.length;
		for (int i = 0; i < size; i++) // 建立大根堆
			insertHeap(arr, i);
		ArrayUtils.swap(arr, 0, --size);
		while (size > 1) {
			heapfy(arr, size); // 堆化
			ArrayUtils.swap(arr, 0, --size);
		}
	}

	private static void heapfy(int[] arr, int size) {
		int index = 0, left = (index << 1) + 1;
		while (left < size) {
			int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index)
				break;
			ArrayUtils.swap(arr, largest, index);
			index = largest;
			left = (index << 1) + 1;
		}
	}

	private static void insertHeap(int[] arr, int i) {
		while (i > 0 && arr[i] > arr[i - 1 >> 1]) {
			ArrayUtils.swap(arr, i, i - 1 >> 1);
			i = i - 1 >> 1; // >>优先级小于-
		}
	}

}
