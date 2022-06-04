package com.company;
import java.util.Scanner;

import com.company.Classes.Office_person;
import com.company.Classes.Office_persons;
import com.company.Classes.Product;
import com.company.Classes.Products;

public class Main {

    public static void main(String[] args) {

        task01();
       // task02();
    }


    /**
     * Определить самый дорогой товар на складе и
     * напечатать все сведения о нем.
     */
    private static void task01() {

        System.out.println("\n----Первое задание----\n");

        Product product1 = new Product(30000, 2035, "Morgan ind.", 2020);
        Product product2 = new Product(15000, 2082, "Liandri corp.", 2021);
        Product product3 = new Product(170, 2038, "Centauri monopoly", 2021);

//        System.out.println(product1);
//        System.out.println(product2);
//        System.out.println(product3);

        System.out.println();

        final Products products = new Products(3);

        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);


        System.out.println(products);

        System.out.println("The most expensive product is: " + products.findMostExpensiveProduct());
    }
        private static void task02 ()
    {
        System.out.println("\n----Второе Задание----\n");
        Office_person employee1 = new Office_person(" Игорь","Ардаков","Герасимович","Генеральный директор","Мужской");
        Office_person employee2 = new Office_person("Иван","Донченко","Андреевич","Заведующий складом","Мужской ");
        Office_person employee3 = new Office_person("Юлия","Кулагина","Анатольевна","Директор по логистике","Женский ");
        Office_person employee4 = new Office_person("Алла","Жаркова","Юрьевна","Юрист","Женский ");
        System.out.println();
        final Office_persons employees = new Office_persons(4);
       employees.addOOffice_persons(employee1);
       employees.addOOffice_persons(employee2);
       employees.addOOffice_persons(employee3);
       employees.addOOffice_persons(employee4);
        System.out.println(employees.findAgeAbove10());
        }
    }
