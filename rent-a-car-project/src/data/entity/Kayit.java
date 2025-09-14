package data.entity;

import java.time.LocalDate;

public class Kayit {

    private Musteri musteri;
    private Arac arac;
    private LocalDate tarih;

    public Kayit(Musteri musteri, Arac arac, LocalDate tarih) {
        this.musteri = musteri;
        this.arac = arac;
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Kayit{" +
                "arac=" + arac +
                ", musteri=" + musteri +
                ", tarih=" + tarih +
                '}';
    }
}
