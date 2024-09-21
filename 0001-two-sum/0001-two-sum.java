import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (target - current number)
            int complement = target - nums[i];
            
            // Check if the complement is already in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[] { map.get(complement), i };
            }
            
            // If not found, store the current number and its index in the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[] {};
    }
}
