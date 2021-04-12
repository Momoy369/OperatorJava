package com.lomboktech.javafundamental.operatorjava;

public class OperatorUnary {

    public static void main(String[] args){
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 adalah: " +hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -5 adalah: " +hasil2);
        System.out.println();

        System.out.println("Operator Peningkatan Nilai Sebesar 1 Poin");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil dari 5++ adalah: " +nilaiAwal3);
        System.out.println();

        System.out.println("Operator Pengurangan Nilai Sebesar 1 Poin");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil dari 5-- adalah: " +nilaiAwal4);
        System.out.println();

        System.out.println("Operator Komplemen Logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false adalah: " +!sukses);
        System.out.println();
    }
}
