class Parent {
    Parent(String pname) {
        System.out.println("Parent constructor: " + pname);
    }
}

class Child extends Parent {
    Child(String cname) {
        super(cname); // Calls the Parent class constructor
        System.out.println("Child constructor: " + cname);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child("John");
    }
}
