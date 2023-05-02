class Solution
{
    static int majorityElement(int arr[], int n)
    {
        int idx=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[idx]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                idx=i;
                count=1;
            }
        }
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[idx]){
                temp++;
            }
        }
        if(temp>n/2){
            return arr[idx];
        }else return -1;
    }
}
