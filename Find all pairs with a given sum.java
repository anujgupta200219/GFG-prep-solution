class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Set<Long>set=new HashSet<>();
        ArrayList<pair>li=new ArrayList<>();
        for(int i=0;i<M;i++){
            set.add(B[i]);
        }
        Arrays.sort(A);
        for(int i=0;i<N;i++){
            if(set.contains(X-A[i])){
                pair p=new pair(A[i],X-A[i]);
                li.add(p);
            }
        }
        pair[] ans=new pair[li.size()];
        int k=0;
        for(pair x:li){
            ans[k]=x;
            k++;
        }
        return ans;
    }
}
