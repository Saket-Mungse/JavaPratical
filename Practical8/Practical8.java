class Practical8{

// 1)
static int i = 1;
static void display1(int size){
    if(size==-1){
        return;
    }
    
    String str = "*";
    System.out.println(str.repeat(i));
    i++;
    display1(size-- - 1);
    System.out.println(str.repeat(--i - 1));
}


// 2)
static int j = -1;
static void display2(int size){
if(size==0){
    return;
}
String space = " ";
String star = "*";
String slash = "/";
String plus = "+";
j++;
System.out.print(space.repeat(size));
System.out.println(star.repeat(j+1));
display2(size-1);
if(size==1){
    System.out.println(plus.repeat(j+2));
}
System.out.print(space.repeat(size));
System.out.println(slash.repeat(j-- + 1));

    }
    public static void main(String[] args){
        display1(3);
    display2(3);
}
}




