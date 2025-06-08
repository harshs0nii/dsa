public class subseq {
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        skip(p, up.substring(1));
        skip(p+ch, up.substring(1));
            }
    
        public static void main(String[] args) {
        skip(" ", "harsh");
    }
}

