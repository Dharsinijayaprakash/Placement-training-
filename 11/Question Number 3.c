#include<stdio.h>
int main(){
    int n,s,d,i,t;
    printf("Enter a number: ");
    scanf("%d",&n);
    t=n;
    for (i = 1; i <= 10; i++) {
        s =0;
        while(t != 0){
        d = t % 10;
        s += d*d;
        t = t / 10;
        }
        printf("Cycle %d: %d\n", i,s);
        if(s == 1){
            printf("It's a happy number");
            return 0;
        }
        t = s;
    }
    printf("It's not a happy number");
    return 0;
}
