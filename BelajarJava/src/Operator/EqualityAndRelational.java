/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operator;

/**
 *
 * @author gawah
 */
public class EqualityAndRelational {

    public static void main(String[] args) {
//    ==	equal to
//    !=	not equal to
//    >	greater than
//    >=	greater than or equal to
//    <	less than
//    <=	less than or equal to
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;
        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah " + result);
        System.out.println();
    }

}
