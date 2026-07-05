class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();

        char par[]=s.toCharArray();


        for(int i =0;i<par.length;i++){
            if(par[i]=='('||par[i]=='{'||par[i]=='['){
                st.push(par[i]);
            }
            else if (!st.empty()&&((st.peek()=='{'&&par[i]=='}')||
            (st.peek()=='['&&par[i]==']')||
            (st.peek()=='('&&par[i]==')'))){
                st.pop();
            }
            else{
                return false;
            }


        }
        
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}
