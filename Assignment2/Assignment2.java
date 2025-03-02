class Assignment2{
    static String getSumOfDigit(int number){
        if(number<10){
            return number + "=" + number;
        }
        int remainder = number%10;
        String output = getSumOfDigit(number/10);
        int sum = Integer.parseInt(output.split("=")[1]) + remainder;
        return output.split("=")[0] + "+" + remainder + "=" + sum;
    }

    static String isPalindrome(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        String compare = Integer.toString(number);
        if (sb.reverse().toString().equals(compare)) {
            return "The " + number + " is palindrome";
        }
        else if (compare.charAt(0) == compare.charAt(compare.length() - 1)) {
            String s = compare.substring(1, compare.length() - 1);
            return isPalindrome(Integer.parseInt(s));
        }else{
            char[] c = compare.toCharArray();
            return "The number is not palindrome \nbecause the digits " + c[0] + " and " + c[c.length-1] + " are not equal in the given number";
        }
    }


    static int count=0;
    static int result = 0;
    static int getCount_ppss(String string){
        if(string.isEmpty()){
            return result+1;
        }
        if(string.length()==1){
            return result+2;
        }
        else if(string.length()%2==0){
            String str = string.substring(1,string.length()-1);
            result = (count++) + 1;
            int answer = getCount_ppss(str);
            return answer+1;
        }
        else{
            String str = string.substring(1,string.length()-1);
            result = (count++) + 1;
            int answer = getCount_ppss(str);
            return answer+1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getSumOfDigit(2023));
        System.out.println(isPalindrome(12331));
        System.out.println(getCount_ppss("abccba"));
    }

}