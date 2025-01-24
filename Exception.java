public class Exception {
    public static void main(String[] args){
        try{
            int result=10/0;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by zero ");
        }
        finally{
            System.out.println("Code executed ");
        }
    }
}
