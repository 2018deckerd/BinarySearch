
public class BinarySearcher {
	
	public static int binarySearch(int[] arr, int l, int r, int x) {
		/*
		 * Performs a binary search for the integer x in the arr between l and r.
		 * A value of -1 indicates that the value x is not in the arr.
		 * Works with only sorted arrays 
		 */
		int mid = 0;
		if (l <= r) {
			mid = (l + r - 1 / 2);
			if (x == arr[mid]) {
				return mid;
			} else if (x < arr[mid]) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		 } else {
			return -1;
		}
	  }
		
	}


