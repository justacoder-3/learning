int evaluate(char *expression){
    Stack stack;
    initstack(&stack);
    for(int i=0;expression[i]!='\0';i++){
        char ch=expression[i];
        if(isdigit(ch)){
            push(&stack,ch-'0');
        }
        else{
            int val2=pop(&stack);
            int val1=pop(&stack);
            switch(ch){
                case'+':
                    push(&stack,val1+val2);
                    break;
                case '-':
                    push(&stack,val1-val2);
                    break;
                case '*':
                    push(&stack,val1*val2);
                    break;
                case '/':
                    if(val2==0){
                        printf("Division by zero is not allowed \n");
                        exit(1);
                    }
                    else{
                        push(&stack,val1/val2);
                        break;
                    }
                default:
                    printf("Invalid operator: %c\n", ch);
                    exit(1);
            }
        }
    }
    return pop(&stack);
}

//practised one
int evaluate(char * expression){
    Stack stack;
    initstack(&stack);
    for(int i=0;expression[i]!='\0',i++){
        char ch=expression[i];
        if(isdigit(ch)){
            push(&stack,ch-'0');
        }
        else{
            int val2=pop(&stack);
            int val1=pop(&stack);
            switch(ch){
                case '+':
                    push(&stack,val1+val2);
                    break;
                case '-':
                    push(&stack,val1-val2);
                    break;
                case '*':
                    push(&stack,val1*val2);
                    break;
                case '/':
                    if(val2==0){
                        printf("Error \n");
                        exit(1);
                    }
                    else{
                        push(&stack,val1/val2);
                        break;
                    }
                default:
                    printf("Enter properly \n");
                    exit(1);
            }
        }
    }
    return pop(&stack);
}