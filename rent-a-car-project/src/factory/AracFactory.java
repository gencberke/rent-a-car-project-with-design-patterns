package factory;

import data.entity.Arac;

public class AracFactory {
    public static Arac createArac(String tip) {

        return switch (tip.toLowerCase()) {

            case "sedan" -> new Arac("34ABC12","honda","civic");

            case "suv" -> new Arac("06DEF456","toyota", "rav4");

            default -> new Arac("00XYZ0000","Generic","ModelX");
        };
    }
}
