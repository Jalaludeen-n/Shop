package Shop;

public class Cosmetic extends ItemType {
    public Cosmetic(String code, String name, float prize) {
        super(code, name, prize, new Tax().cosmeticGst());
    }

}
