// public class Student{
//     String name;
//     int age;

//     public Student(){
//         name="Unknown";
//         age=0;
//         System.out.println("Default constructor called !");
//     }

//     public Student(String name, int age){
//         this.name=name;
//         this.age=age;
//         System.out.println("Parameterized constructor called !");
//     }

//     public void displayDetails(){
//         System.out.println("Name: "+name+", Age: "+age);
//     }

//     public static void main(String[] args){
//         Student student1 = new Student();
//         student1.displayDetails();
//         Student student2 = new Student();
//         student2.displayDetails();
//     }
// }


public class Student{
    String name;
    int age;

    public Student(){
        name="Unknown";
        age=0;
        System.out.println("Default constructor");
    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor");
    }

    public void displayDetails(){
        System.out.println("Name: "+name+", Age: "+age);
    }

    public static void main(String[] args){
        Student student1=new Student();
        student1.displayDetails();
        Student student2=new Student("Rama",19);
        student2.displayDetails();
    }
}