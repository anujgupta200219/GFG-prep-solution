class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>lead=new ArrayList<>();
        
        int max=arr[n-1];
        lead.add(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                lead.add(arr[i]);
            }
        }
        Collections.reverse(lead);
        return lead;
    }
}
