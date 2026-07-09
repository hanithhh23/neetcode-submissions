class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] strs1=strs.clone();
        boolean [] check=new boolean[strs.length];

        List<List<String>> ans = new ArrayList<List<String>>();

        for(int i =0;i<strs1.length;i++){
            char []ch=strs1[i].toCharArray();
            Arrays.sort(ch);
            strs1[i]=new String(ch);
        }



        if(strs.length==0){
            List<String> list=new ArrayList<String>();
            list.add("");
            ans.add(list);
        }
        else{
            for(int i=0;i<strs.length;i++){
                if(check[i]==true){
                    continue;
                }
                else{
                    List<String> list=new ArrayList<String>();
                    list.add(strs[i]);

                    for(int j=i+1;j<strs.length;j++){
                        if(check[j]==false&&(strs1[i].equals(strs1[j]))){
                            check[j]=true;
                            list.add(strs[j]);
                        }
                    }

                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
