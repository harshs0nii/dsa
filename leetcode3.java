public class leetcode3 {
    public static void main(String[] args) {
        int[] arr ={8,3,6,7};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int current = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>current){
               arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1]=current;
       }
    }
    
}
