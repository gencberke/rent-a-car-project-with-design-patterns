package data.repository;

import java.util.ArrayList;
import java.util.List;
import data.entity.Arac;

public class AracRepository {
        private List<Arac> araclar = new ArrayList<>();

        public void ekle(Arac arac) {
            araclar.add(arac);
        }

        public List<Arac> listele() {
            return araclar;
        }
}
