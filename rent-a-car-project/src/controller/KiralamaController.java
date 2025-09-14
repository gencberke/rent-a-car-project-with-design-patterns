package controller;

import data.entity.Arac;
import data.entity.Kayit;
import data.entity.Musteri;
import service.KiralamaService;

public class KiralamaController {
    private KiralamaService kiralamaServisi;

    public KiralamaController(KiralamaService kiralamaServisi) {
        this.kiralamaServisi = kiralamaServisi;
    }

    public void basla() {

        // dummy araç ve müşteri oluşturuluyor
        Arac arac1 = new Arac("34AAD25", "Toyota", "Corolla");
        Arac arac2 = new Arac("06GHA789", "Ford", "Focus");

        Musteri musteri1 = new Musteri("Berke", "Genç");
        Musteri musteri2 = new Musteri("Yusuf", "akıllı");

        // Veriler ilgili lisetelere ekleniyor (database ve transaction işlemlerinin taklidi)
        kiralamaServisi.aracEkle(arac1);
        kiralamaServisi.aracEkle(arac2);

        kiralamaServisi.musteriEkle(musteri1);
        kiralamaServisi.musteriEkle(musteri2);

        // Kayıt oluşturuluyor (bir müşteri ile bir araç eşleşiyor, listede beraber tutuluyor)
        kiralamaServisi.kayitAc(musteri1, arac1);

        // Çıktılar
        System.out.println("### Araçlar ###");
        for (Arac arac : kiralamaServisi.araclariListele()) {
            System.out.println(arac);
        }
        System.out.println();

        System.out.println("### Müşteriler ###");
        for (Musteri musteri : kiralamaServisi.musterileriListele()) {
            System.out.println(musteri);
        }
        System.out.println();

        System.out.println("### Kayıtlar ###");
        for (Kayit kayit : kiralamaServisi.kayitlariListele()) {
            System.out.println(kayit);
        }
        
    }
}
