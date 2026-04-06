class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        return new int[]{-1,-1};
      int first=firstOccur(nums,target);
      if(first==-1)
      return new int[]{-1,-1};
        int last=lastOccur(nums,target);
        return new int[]{first,last};}
    public int firstOccur(int[] nums, int target){
        int low=0; int high=nums.length-1; int index=-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                 index=mid;high=mid-1;  }
            else if(nums[mid]<target) {
                low=mid+1;}
            else{
                high=mid-1;  }  }
        return index;  }
  public int lastOccur(int[] nums, int target) {
        int low=0;int high=nums.length-1;int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){      index=mid;low=mid+1; }
            else if(nums[mid]<target){
                low=mid+1; }
            else{high=mid-1;  } }
        return index;}}