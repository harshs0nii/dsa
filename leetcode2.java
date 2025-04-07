public class leetcode2 {
    public static void main(String[] args) {
        int[] arr = {8,4,6,3,1};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }
            }
        }
    }
    
}
