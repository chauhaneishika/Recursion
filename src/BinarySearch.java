public class BinarySearch {
    public int helper(int[] nums, int target, int low, int high) {
        if(low > high) return -1;
        int mid = (low+high) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return helper(nums,target,low,mid-1);
        else return helper(nums,target,mid+1,high);
    }

    public int Search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}
