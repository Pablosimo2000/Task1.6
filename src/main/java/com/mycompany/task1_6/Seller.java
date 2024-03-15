/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_6;

/**
 *
 * @author pavelgulin
 */
public class Seller {
    public void modify(Telephone telephone){
        String name = telephone.getName();
        char[] arr = name.toCharArray();
        String res = "";
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 'N'){
            res += 'N';
            } else if(arr[i] == 'o'){
            res += 'a';
            } else {
            res += Character.toLowerCase(arr[i]);
            }
        }
        telephone.setName(res);
    }
}
