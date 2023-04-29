class Solution{
    String longestCommonPrefix(String arr[], int n){
        String st=arr[0];
        for(int i=0;i<n-1;i++){
            String ans=compare(st,arr[i+1]);
            if(ans.equals("")){
                return "-1";
            }
            st=ans;
        }
        return st;
    }
    static String compare(String a,String b){
        String ans="";
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                ans+=String.valueOf(a.charAt(i));
            }
            else{
                return ans;
            }
            i++;j++;
        }
        return ans;
    }
}
