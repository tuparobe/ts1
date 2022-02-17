package cz.cvut.fel.ts1;

public class Factorial {

    public long factorial(int n) {
        if(n <= 1) {
            return 1;
        }else {
            return n * (factorial(n-1));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(4));
    }
}
