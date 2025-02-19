class IT2023bit023 {

static String reverse(String str) {
    if (str.isEmpty()) {
        return str;
    }    
    char firstChar = str.charAt(0);    
    String remainingString = str.substring(1);    
    String reversedRemainingString = reverse(remainingString);
    return reversedRemainingString + firstChar;
}

static int sumOfDigits(int number) {
    if (number < 10) {
        return number;
    }
    return (number % 10) + sumOfDigits(number / 10);
}

public static boolean isPalindrome(String str) {
    if (str.length()<=1) {
        return true;
    }
    if (str.charAt(0)!=str.charAt(str.length()-1)) {
        return false;
    }
    return isPalindrome(str.substring(1,str.length()-1));
}


public static void main(String[] args) {
String outputString = reverse("Utsav 2025");
System.out.println(outputString);
int outputSum = sumOfDigits(170225);
System.out.println(outputSum);
Boolean output = isPalindrome("1721");
System.out.println(output);
    }
}
