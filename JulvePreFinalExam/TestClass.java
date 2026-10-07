/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JulvePreFinalExam;

/**
 *
 * @author User
 */ 
   public class TestClass {
    public static void main(String[] args) {
        Fruit[] fruits = {new Fruit("F001", "Apple", 250.50),new Fruit("F002", "Banana", 120.20),new Fruit("F003", "Mango", 350.75),new Fruit("F004", "Orange", 200.00),new Fruit("F005", "Grapes", 450.50),new Fruit("F006", "Watermelon", 525.25),new Fruit("F007", "Papaya", 270.80),new Fruit("F008", "Pineapple", 360.20)
        };
        System.out.println("==================================");
        System.out.println("       FRUITS BEFORE SORTING");
        System.out.println("==================================");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        InsertionSort.insertionSort(fruits);
        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("       FRUITS AFTER SORTING");
        System.out.println("==================================");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("       TOP 3 CHEAPEST FRUITS");
        System.out.println("==================================");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }
}

