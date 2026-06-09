public class getterandsetter {
    public static void main(String[] args) {
        Student s1 = new Student();

    //     set value using setter 
            s1.setName("karnik");
            s1.setAge(21);

         //get value using getter
        System.out.println("Name: "+ s1.getName());
        System.out.println("Age: " + s1.getAge());
    
    }
}

    class Student{
        private String name = "Karnik";
        private int age = 21;

        //getter for name 
        public String getName(){
            return name;
        }
        //setter for name 
        public void setName(String NewName){
            name = NewName;
        }

        //getter for age 

        public int getAge(){
            return age;
        }
        //setter for age
        public void setAge(int newAge){
            // if(age<0){
            //     System.out.println("The age should be positive");
            // }
            age = newAge;
        }
    }



