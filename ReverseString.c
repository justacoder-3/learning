//reversing a string
void reverseString(char *str) {
    int start = 0, end = 0;

    // Find the length of the string
    while (str[end] != '\0') {
        end++;
    }
    end--; // Move to the last character

    // Swap characters from start and end until the middle
    while (start < end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        start++;
        end--;
    }
}

//practised one
void reverse(char *str){
    int start=0,end=0;
    while(str[end]!='\0'){
        end++;
    }
    end--;
    while(start<end){
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
    }
}