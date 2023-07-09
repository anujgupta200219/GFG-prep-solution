class Solution{
    static int minJumps(int[] arr){
        int max=0;
        int mr=0;
        int jump=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]+i);
            if(i==mr){
                mr=max;
                jump++;
                if(mr>=arr.length-1){
                    return jump;
                }
            }
        }
        return -1;
    }
}
