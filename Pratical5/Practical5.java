import java.util.*;
class Practical5{

int getFactorial1(int number){
if(number>=0){
if(number<2){
return 1;
}

int factorial=2;
for(;number>=3;){
factorial*=number--;
}
return factorial;
}
else{                                                                               
return -1;//For negative numbers
}
}



int getFactorial2(int number){
if(number>=0){

if(number<2){
return 1;
}

int factorial = 2;
while(number>2){
factorial*=number--;
}
return factorial;
}else{
return -1;//For negative numbers
}
}



int getFactorial3(int number){
if(number>=0){
if(number<2){
return 1;
}
int factorial = number*getFactorial3(number-1);
return factorial;
}
else{
    return -1;//For negative numbers
}
}



int getSum(int[] numbers){
    if(numbers.length==0){
        return 0;
    }
    if(numbers.length==1){
    return numbers[0];
}
    int i=0;
    int c = numbers[i] + numbers[i+1];
    numbers[i]=0;
    numbers[i+1]=c;
    return getSum(Arrays.copyOfRange(numbers,1,numbers.length));
}


}