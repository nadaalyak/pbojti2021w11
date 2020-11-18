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
public class Keledai extends Binatang implements IHerbivora {

    public String suara, warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis\t: Herbivora");
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t: Tumbuhan");
    }

    public void displayData() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
        System.out.println();
    }
}
