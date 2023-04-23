class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        
        ArrayList<Integer>ans=new ArrayList<Integer>();
        int l=0;
        int r=0;
        int sum=arr[0];
        boolean is=false;
        if(s==0){
            ans.add(-1);
            return ans;
        }
        while(r<n){
            if(sum==s){
                is=true;
                break;
            }
            else if(sum<s){
                r++;
                if(r<n) sum+=arr[r];
            }
            else if(sum>s){
                sum-=arr[l];
                l++;
            }
        }
        if(is==true){
            ans.add(l+1);
            ans.add(r+1);
        }
        else{
            ans.add(-1);
        }
        return ans;
    }
}
