class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        ArrayList <ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        int buy=0;
        int sell=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                sell++;
            }
            else{
                if(sell>buy){
                    ArrayList<Integer>l1=new ArrayList<Integer>();
                    l1.add(buy);
                    l1.add(sell);
                    ans.add(l1);
                }
                buy=i+1;
                sell=i+1;
            }
        }
        if(sell>buy){
            ArrayList<Integer>l1=new ArrayList<Integer>();
            l1.add(buy);
            l1.add(sell);
            ans.add(l1);
        }
        return ans;
    }
}
