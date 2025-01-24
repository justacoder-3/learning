// int num=10;
// Integer obj=num;

// void display(Integer i){
//     System.out.println(i);
// }

// display(20);

// Autoboxing in assignment
int num = 10;
Integer obj = num;  // Primitive int is automatically converted to Integer

// Autoboxing in method calls
void printObject(Integer i) {
    System.out.println(i);
}
printObject(20);  // int 20 is converted to Integer
