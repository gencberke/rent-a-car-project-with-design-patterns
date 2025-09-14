package service;

import data.entity.Arac;
import data.entity.Kayit;
import data.entity.Musteri;
import data.repository.AracRepository;
import data.repository.KayitRepository;
import data.repository.MusteriRepository;

import java.time.LocalDate;
import java.util.List;

public class KiralamaService {
    private AracRepository aracRepository;
    private MusteriRepository musteriRepository;
    private KayitRepository kayitRepository;

    public KiralamaService(AracRepository aracRepo, MusteriRepository musteriRepo, KayitRepository kayitRepo) {
        this.aracRepository = aracRepo;
        this.musteriRepository = musteriRepo;
        this.kayitRepository = kayitRepo;
    }

    private static KiralamaService instance;

    private KiralamaService() {
    }

    public static KiralamaService getInstance() {
        if (instance == null) {
            instance = new KiralamaService();
        }
        return instance;
    }

    public void islemYap() {
        System.out.println("Kiralama işlemi gerçekleştirildi.");
    }

    public void aracEkle(Arac arac) {
        aracRepository.ekle(arac);
    }

    public void musteriEkle(Musteri musteri) {
        musteriRepository.ekle(musteri);
    }

    public List<Arac> araclariListele() {
        return aracRepository.listele();
    }

    public List<Musteri> musterileriListele() {
        return musteriRepository.listele();

    }

    public List<Kayit> kayitlariListele() {
        return kayitRepository.listele();
    }


    public void kayitAc(Musteri musteri, Arac arac) {

        Kayit kayit = new Kayit(musteri, arac, LocalDate.now());

        kayitRepository.ekle(kayit);
    }


}
