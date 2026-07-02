class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];

        for(int i =0;i<arr.length;i++){
            if(i==(arr.length-1)){
                ans[i]=-1;
            }
            else{
            ans[i]=arr[i+1];

            for(int j=i+1;j<arr.length;j++){
                if(ans[i]<=arr[j]){
                    ans[i]=arr[j];
                }
            }
            }


        }

        return ans;
        
    }
} 