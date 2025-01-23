public class StaticCode {
    static int count;

    public StaticCode(){
        count++;
    }

    public static void display(){
        System.out.println("Count: "+count);
    }

    public static void main(String[] args){
        StaticCode obj1=new StaticCode();
        StaticCode.display();
        StaticCode obj2=new StaticCode();
        StaticCode.display();
    }
}
