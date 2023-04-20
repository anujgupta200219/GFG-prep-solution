class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i=i+k){
            if(i+k-1<n)
            reverse(arr,n,i,i+k-1);
            else
            reverse(arr,n,i,n-1);
        }
    }
    void reverse(ArrayList<Integer> arr, int n,int start,int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
