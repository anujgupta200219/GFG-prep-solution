

class Solution{
    long maxSubarraySum(int arr[], int n){
        int sum=0;
        long max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    
}
