

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        long l[]=new long[n];
        long r[]=new long[n];
        l[0]=arr[0];
        r[arr.length-1]=arr[arr.length-1];
        
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],arr[i]);
        }
    
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],arr[i]);
        }
        
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(l[i],r[i])-arr[i];
        }
        return ans;
    } 
}
