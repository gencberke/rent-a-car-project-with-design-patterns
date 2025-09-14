package bridge;

public class KayitOdeme extends OdemeGecidi{
    public KayitOdeme(Odeme odeme) {
        super(odeme);
    }

    @Override
    public void islemYap(double miktar) {
        odeme.odemeYap(miktar);
    }

}
