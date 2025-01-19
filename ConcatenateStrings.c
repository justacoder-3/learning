//Concatenate two strings
void concatenateStrings(char *str1, char *str2) {
    int i = 0, j = 0;

    // Find the end of the first string
    while (str1[i] != '\0') {
        i++;
    }

    // Append the second string to the first
    while (str2[j] != '\0') {
        str1[i] = str2[j];
        i++;
        j++;
    }

    // Add the null terminator
    str1[i] = '\0';
}

//practised one
void concatenate(char *str1,char *str2){
    int i=0,j=0;
    while(str1[i]!='\0'){
        i++;
    }
    while(str2[j]!='\0'){
        str1[i]=str2[j];
        i++;
        j++;
    }
    str1[i]='\0';
}