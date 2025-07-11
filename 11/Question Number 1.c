#include <stdio.h>
int main() {
    int age,ageResult;
    printf("Enter the age:");
    scanf("%d",&age);
    if(age < 0 && age>101){
        ageResult = -1;
    }else if(age == 0 && age <= 5){
        ageResult = 0;
    }else if(age >= 6 && age <= 12){
        ageResult = 1;
    }else if(age >= 13 && age <= 19){
        ageResult = 2;
    }else if(age >= 20 && age <= 50){
        ageResult = 3;
    }else if(age >= 51 && age <= 60){
        ageResult = 4;
    }else{
        ageResult = 5;
    }
    printf("ageResult = %d\n", ageResult);
    return 0;
}
