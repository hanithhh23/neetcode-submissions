class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int len = nums.length;
        int[] ans=new int[len*2];
        int j=0;

        for(int i =0;i<(len*2);i++){
            if(i<len){
            ans[i]=nums[i];
            }
            else{
                ans[i]=nums[j];
                j++;
            }
        }

        return ans;
        
    }
}