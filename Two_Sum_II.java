class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        int l=0,r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                 return new ArrayList(Arrays.asList(l+1,r+1));
            }
            else if(sum>target) r--;
            else l++;
        }
        return new ArrayList(Arrays.asList(-1,-1));
    }
}
