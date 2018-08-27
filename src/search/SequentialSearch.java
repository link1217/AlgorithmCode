package search;

/**
 * 顺序查找
 * 
 * @author Watcher
 *
 */
public class SequentialSearch {

	public static void main(String[] args) {
		byte a=127,b=127;
		a+=b;
		System.out.println(a);
	}

	public static int sequentialSearch(int[] arr, int num) {
		if (arr == null || arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == num)
				return i;
		return -1;
	}
}
