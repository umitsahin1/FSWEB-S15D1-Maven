package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
     startGrocery();
    }
        public static void startGrocery () {
            Scanner scanner = new Scanner(System.in);
            int option;
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case (0):
                    break;
                case (1):
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String addInput = scanner.nextLine();
                    addItems(addInput);
                    break;
                case (2):
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String removeInput = scanner.nextLine();
                    removeItems(removeInput);
                    break;
                default:
                    System.out.println("Geçersiz seçenek, tekrar deneyin.");

            }
        }


    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (groceryList.contains(item)) {
                groceryList.remove(item);
            } else {
                System.out.println(item + " listede bulunmamaktadır.");
            }
        }
        Collections.sort(groceryList);
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            } else {
                System.out.println(item + " listede bulunmaktadır.");
            }
        }
        Collections.sort(groceryList);
    }

   public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

}


