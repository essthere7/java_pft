package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello ("Natalia");
        hello ("world");
        hello("People");
        double len =5;
        System.out.println("Square " +len+ "=" + area(len));
    }

    public static void hello(String IamWho) {
        System.out.println("Privet," +IamWho+ "!");
    }

    public static double area(double l){
        return l*l;
    }
}

