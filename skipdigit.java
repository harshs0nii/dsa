// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static void skip(String take , String give){
        if(give.isEmpty()){
            System.out.println(take);
            return;
        }
        char ch = give.charAt(0);
        if(ch=='a'){
             skip(take , give.substring(1));
        }
        else{
            skip( take+ch ,give.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("" , "baccad");
        
    }
}
