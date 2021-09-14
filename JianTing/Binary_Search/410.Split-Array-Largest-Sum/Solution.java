public class Solution {

	public static void main(String[] args) {
		int[] nums = { 7, 2, 5, 10, 8 };
		int m = 2;
		System.out.println(splitArray(nums, m));
	}

	public static int splitArray(int[] nums, int m) {
		int left = 0;
		int right = 0;
		for (int num : nums) {
			left = Math.max(left, num);
			right += num;
		}
		while (left < right) {
			int mid = (left + right) / 2;
			if (isOK(nums, m, mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static boolean isOK(int[] nums, int m, int mid) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			while (i + 1 < nums.length && sum + nums[i + 1] <= mid) {
				sum += nums[i + 1];
				i++;
			}
			count++;
			if (count > m)
				return false;
		}
		return true;
	}

}
