public class oop {
    public static class myemployee{
        private String name;
        private int age ;
        
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
       }
       public static void main(String[] args) {
        myemployee emp = new myemployee();
        emp.setName("John Doe");
        emp.setAge(30);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
    
}
