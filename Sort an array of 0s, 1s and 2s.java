class Solution
{
    public static void sort012(int arr[], int n)
    {
        int one=0;
        int two=0;
        int zero=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int i=0;
        while(zero!=0){
            arr[i]=0;
            i++;
            zero--;
        }
        while(one!=0){
            arr[i]=1;
            i++;
            one--;
        }
        while(two!=0){
            arr[i]=2;
            i++;
            two--;
        }
        
    }
}