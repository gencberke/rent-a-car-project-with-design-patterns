package bridge;

public abstract class OdemeGecidi {
    protected Odeme odeme;

    public OdemeGecidi(Odeme odeme) {
            this.odeme = odeme;
    }

    public abstract void islemYap(double miktar);

}
