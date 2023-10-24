/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operator;

/**
 *
 * @author gawah
 */
public class Unary {

    public static void main(String[] args) {

//        Operasi Unary
//    Operator Deskripsi
//
//    +	Operator Unary positif
//    -	Operator Unary negatif
//    ++	Operator penambahan; peningkatan nilai sebesar 1 point
//    --	Operator pengurangan,; pengurangan nilai sebesar 1 point
//    !	Operator komplemet logika, operator; membalikan sebuah nilai bolean
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();
        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();
        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();
        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();
        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
