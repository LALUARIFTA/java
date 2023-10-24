/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author gawah
 */
public class LoopingArray {

    public static void main(String[] args) {
        int[] arrInt = new int[10];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 100
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
