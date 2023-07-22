public class TwoSum {
	public static void main(String[] args) {								
		int[] myNums = {1,5,4};
		int[] indexes = twoSum(myNums, 6);
		for(int idx = 0; idx<indexes.length; idx++){
			System.out.println(indexes[idx]);
		}
	}
	
	static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			Integer complementIndex = complements.get(nums[i]);
			if (complementsIndex != null){
				return new int[]{i, complementsIndex};
			} 
			complements.put(target - nums[i], i);
		}
		return nums;
	} 
}
