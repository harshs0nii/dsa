public class fibonaaci {
    static int fibo(int n ){
            if(n<2){
                return n;
            }
        return fibo (n-1) + fibo (n+1);
    }
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    
}
