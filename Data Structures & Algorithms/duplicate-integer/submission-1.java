class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res=false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                res=true;
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}