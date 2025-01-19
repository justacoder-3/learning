#include <string.h> // For strlen

int pmatch(char *string, char *pat, int *prefix) {
    int i = 0, j = 0;
    int lens = strlen(string); // Length of the string
    int lenp = strlen(pat);    // Length of the pattern

    while (i < lens && j < lenp) {
        if (string[i] == pat[j+1]) { // Match
            i++;
            j++;
        } else if (j == 0) {       // Mismatch at the start of the pattern
            i++;
        } else {                   // Mismatch within the pattern
            j = prefix[j];     // Fallback to the prefix position
        }
    }

    // Check if the full pattern was matched
    return (j == lenp) ? (i - lenp) : -1;
}

// #include <string.h>
// int evalPat(char * string, char * pat, int * prefix){
//     int i=0,j=0;
//     int lens=strlen(string);
//     int lenp=strlen(pat);
//     while(i<lens && j<lenp){
//         if(string[i]==string[j+1]){
//             i++;
//             j++;
//         }
//         else if(j==0){
//             i++;
//         }
//         else{
//             j=prefix[j];
//         }
//     }
//     return ((j==lenp) ? (i-lenp) : -1);
// }