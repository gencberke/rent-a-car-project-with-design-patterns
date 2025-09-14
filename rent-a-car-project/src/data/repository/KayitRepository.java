package data.repository;
import data.entity.Kayit;
import java.util.ArrayList;
import java.util.List;

public class KayitRepository {
    private List<Kayit> kayitlar = new ArrayList<>();

    public void ekle(Kayit kayit) {
        kayitlar.add(kayit);
    }

    public List<Kayit> listele() {
        return kayitlar;
    }


}
