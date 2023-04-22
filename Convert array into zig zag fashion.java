class Solution{
    public void zigZag(int arr[], int n){
        int i=0;
        while(i<n-1){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            i++;
        }
    }
}
