public class Solution {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int left = 0;
		int right = m;
		while (left < right) {
			int mid = (left + right)/2;
			if (matrix[mid][n-1] < target) {
				left = mid +1;
			} else {
				right = mid;
			}
		}
		if (left == m)
			return false;
		return binarySearch(matrix[left], target);
	}

	public static boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return arr[left] == target;
	}

}
