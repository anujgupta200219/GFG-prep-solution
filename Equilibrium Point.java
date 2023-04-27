class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        int sl=0;
        int sr=0;
        if(arr.length==1){
            return 1;
        }
        for(int i=1;i<arr.length;i++){
            sr+=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(sl==sr){
                return i+1;
            }
            sl+=arr[i];
            sr-=arr[i+1];
        }
        return -1;
    }
}
