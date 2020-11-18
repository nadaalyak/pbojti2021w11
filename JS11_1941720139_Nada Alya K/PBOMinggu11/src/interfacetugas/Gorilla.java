/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetugas;

/**
 *
 * @author Nada Alya
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    public String suara, warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis\t: Karnivora + Herbivora");
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t: Daging + Tumbuhan");
    }

    public void displayData() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
        System.out.println();
    }
}
