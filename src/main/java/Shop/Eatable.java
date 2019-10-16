package Shop;

class Eatable extends ItemType {
    public Eatable(String code, String name, float prize) {
        super(code, name, prize, new Tax().eatableGst());

    }
}
