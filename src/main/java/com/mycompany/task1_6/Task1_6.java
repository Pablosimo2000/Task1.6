/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1_6;

/**
 *
 * @author pavelgulin
 */

import java.util.Scanner;

public class Task1_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.println("Вариант 2. Гулин Павел Дмитриевич");
        System.out.println("Введите название телефона: ");
        String phoneName = scan.next();
        Telephone telephone = new Telephone(phoneName);
        
        
        Seller seller = new Seller();
        seller.modify(telephone);
        System.out.println(telephone.getName());
    }
}
