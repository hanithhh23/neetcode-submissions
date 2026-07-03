class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int len=0;

        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='0'&&ch[i]<='9')){ 
                len++;

            }
        }
        char ans[]=new char[len];
        int j=0;

        for(int i=0;i<ch.length;i++){
            if((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='0'&&ch[i]<='9')){

                ans[j]=ch[i];
                j++;

            }
        }
        char ansr[]=new char[len];int k=0;


        for(int i =len-1;i>=0;i--){
            ansr[k]=ans[i];
            k++;
        }

        String answer=Arrays.toString(ans);
        String answerR=Arrays.toString(ansr);

        if(answer.equals(answerR)){
            return true;
        }




        
    return false;
    }
}
