class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                max=Math.max(max,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
