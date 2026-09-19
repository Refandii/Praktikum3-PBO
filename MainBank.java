/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum003;

/**
 *
 * @author Acer
 */
public class MainBank {
    public static void main(String[] args) {
        Rekening rekening = new Rekening("00927809001", "Re'fandi Indra Maulana", 500000.0);

        try {
            // Penarikan pertama yang valid (saldo cukup)
            rekening.tarikTunai(200000.0);

        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Peringatan Sistem: " + e.getMessage());
        } finally {
            System.out.println("Transaksi selesai diproses.");
            System.out.println("Nomor Rekening: " + rekening.maskingNomorRekening());
        }
    }
}