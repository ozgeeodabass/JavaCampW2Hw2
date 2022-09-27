package MethodOverloading;

public class Calculator {
    public int Add(int num1, int num2){
        return num1+num2;
    }

    //method overloading
    public int Add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
