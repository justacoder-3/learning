public class Employee {
    String name;
    int salary;
    static int empcount=0;

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
        empcount++;
    }

    public void displaydetails(){
        System.out.println("Name: "+name+","+" Salary: "+salary);
    }

    public void raise(int per){
        salary=salary+(int)(salary*(per/100.0));
        System.out.println("Salary: "+salary);
    }

    public void display(){
        System.out.println("Count: "+empcount);
    }
    
    public static void main(String[] args){
        Employee emp1=new Employee("Arjun",19000);
        Employee emp2=new Employee("Ahaan",20000);
        emp1.displaydetails();
        emp2.displaydetails();
        emp1.raise(10);
        emp2.raise(10);
        emp1.display();
    }
}
