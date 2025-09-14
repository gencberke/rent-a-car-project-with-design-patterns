package data.repository;
import data.entity.Musteri;
import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {
    private List<Musteri> musteriler = new ArrayList<>();

    public void ekle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public List<Musteri> listele() {
        return musteriler;
    }
}
