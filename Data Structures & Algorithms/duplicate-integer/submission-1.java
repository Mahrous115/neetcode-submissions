class Solution {
    public boolean hasDuplicate(int[] nums){
        HashMap<Integer,Integer> list=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            list.put(nums[i], list.getOrDefault(nums[i], 0) + 1);
            if (list.get(nums[i]) > 1) return true;
        }
        return false;
    }
}