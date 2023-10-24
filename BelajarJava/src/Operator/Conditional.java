/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operator;

/**
 *
 * @author gawah
 */
public class Conditional {

    public static void main(String[] args) {
//    &&	Conditional-AND
//    ||        Conditional-OR
        int value = 4;
        int anotherValue = 5;
        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;
        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;
        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
    }
}
