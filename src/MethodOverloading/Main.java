package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.Add(2,5);
        System.out.println(addition);
        int addition2 = calculator.Add(2,5,8);
        System.out.println(addition2);
    }
}
