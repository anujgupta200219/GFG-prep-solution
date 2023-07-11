

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            int temp=pq.poll();
            if(arr[i]<temp){
                pq.add(arr[i]);
            }
            else{
                pq.add(temp);
            }
        }
        return pq.poll();
    }
}
