class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for(int i=0;i<details.length;i++){
            String a=details[i];

            String sub = a.substring(11,13);

            int num=Integer.parseInt(sub);

            if(num>60){
                count++;

            }
        }

        return count;
        
    }
}