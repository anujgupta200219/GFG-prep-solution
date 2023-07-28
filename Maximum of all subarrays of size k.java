

//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        ArrayList<Integer> st=new ArrayList<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
    
        int i=0;
        for(i=0;i<k;i++){
            pq.add(arr[i]);
        }
        st.add(pq.peek());
        pq.remove(arr[0]);
        
        for(;i<n;i++){
            pq.add(arr[i]);
            st.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        return st;
    }
}
