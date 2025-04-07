/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_calculator;

/**
 *
 * @author VICTUS
 */
public class ExpressionEvaluator{
    public static float evaluate(String expression){
        expression = expression.replaceAll(" ", "");
        return evaluateExpression(expression,0,expression.length() - 1);
    }

    private static float evaluateExpression(String expr,int start,int end) {
        if(start> end){ 
            return 0;
        }    
        float result = 0;
        float currentNumber = 0;
        float tempResult = 0;
        char lastOperator = '+';
        boolean hasMulDiv = false;

        for(int i=start;i<=end;i++){
            char c = expr.charAt(i);
                if(Character.isDigit(c) || c =='.'){
                if(c=='.'){
                    int decimalPlace = 1;
                    i++;
                    while(i<=end && Character.isDigit(expr.charAt(i))){
                        currentNumber += (expr.charAt(i)-'0') / Math.pow(10,decimalPlace);
                        decimalPlace++;
                        i++;
                    }
                    i--;
                }else{
                    currentNumber = currentNumber*10+(c-'0');
                }
            }

            if(i==end || "+-*/".indexOf(c)!=-1){
                if(hasMulDiv) { 
                    if(lastOperator=='*'){ 
                        tempResult *= currentNumber;
                    }    
                    else if(lastOperator == '/'){
                        tempResult /= currentNumber;
                    }
                }else{
                    tempResult = currentNumber;
                }

                if(i==end || c=='+' || c=='-'){
                    result += tempResult;
                    hasMulDiv = false;
                }else{
                    hasMulDiv = true;
                }

                lastOperator = c;
                currentNumber = 0;
            }
        }
        return result;
    }
}

