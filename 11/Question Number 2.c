#include<stdio.h>
int main(){
    int sqdnumber,sqdNumber_result = 0,d;
    printf("Enter a number: ");
    scanf("%d",&sqdnumber);
    while(sqdnumber != 0){
        d = sqdnumber % 10;
        sqdNumber_result = sqdNumber_result + d*d;
        sqdnumber = sqdnumber / 10;
    }
    printf("Sum of squares of digits is: %d\n",sqdNumber_result);
    return 0;
}
