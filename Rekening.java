/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum003;

/**
 *
 * @author Acer
 */
public class Rekening {
    String nomorRekening;
    String namaNasabah;
    double saldo;

    public Rekening(String nomorRekening, String namaNasabah, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    // Method menggunakan throws
    public void tarikTunai(double jumlah) throws SaldoTidakMencukupiException {
        if (jumlah > saldo) {
            // Melemparkan exception secara manual
            throw new SaldoTidakMencukupiException("Penarikan gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil sejumlah: Rp" + jumlah);
            System.out.println("Sisa saldo saat ini: Rp" + saldo);
        }
    }

    // Method menggunakan StringBuilder untuk masking nomor rekening
    public String maskingNomorRekening() {
        String awal = nomorRekening.substring(0, 5);
        StringBuilder sb = new StringBuilder(awal);
        
        for (int i = 5; i < nomorRekening.length(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}