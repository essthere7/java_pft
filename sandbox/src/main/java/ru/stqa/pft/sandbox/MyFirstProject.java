package ru.stqa.pft.sandbox;

public class MyFirstProject {

        public static void main(String[] args) {
            hello ("Natalia");
            hello ("Mir");
            hello("Vsem");
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
