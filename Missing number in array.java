class Solution {
    int MissingNumber(int a[], int n) {
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        
        for(int i=0;i<arr.length-1;i++){
            arr[a[i]-1]=1;
        }
        int p=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                p=i+1;
                break;
            }
        }
        return p;
    }
}
