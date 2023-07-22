

// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int min=arr[0];
        int max=arr[n-1];
        int ans=max-min;
        
        for(int i=1;i<n;i++){
            int a=arr[i-1]+k;
            int b=arr[i]-k;
            
            if(b<0){
                continue;
            }
            min=Math.min(b,arr[0]+k);
            max=Math.max(a,arr[n-1]-k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
