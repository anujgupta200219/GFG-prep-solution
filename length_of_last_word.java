// User function Template for Java
class Solution {
    int findLength(String s) {
        int ans=0;
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        for(int j=i;j>=0;j--){
            if(s.charAt(j)==' '){
                return ans;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}
