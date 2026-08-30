class Solution {
    public String largestNumber(int[] nums) {
        String[]str=new String[nums.length];
        for (int i=0; i<nums.length; i++){
            str[i]=Integer.toString(nums[i]);

        }
        Arrays.sort(str,(a,b) -> {
            if((a+b).compareTo(b+a)>0)
                return -1;
            else if((a+b).compareTo(b+a)<0)
                return 1;
            else
                return 0;
            
        });
        if(str[0].equals("0"))
            return "0";
        String ans="";
        for (String s:str){
            ans+=s;
        }
        return ans;
    }
}