class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] result=new int[n];
        int left=(n-1)/2;
        int right=n-1;
        for (int i=0; i<n; i++){
            if(i%2==0){
                result[i]=nums[left];
            left--;
            }else {
                result[i]=nums[right];
                right--;
            }
        }
        for (int i=0; i<n; i++){
            nums[i]=result[i];
        }
    }
}    
