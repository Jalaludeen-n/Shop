package Shop;

public class Cosmetic extends ItemType {

    String code;
    String name;
    float prize;

    public Cosmetic(String code, String name, float prize) {
        super(code, name, prize,15);
    }

}
