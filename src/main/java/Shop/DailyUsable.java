package Shop;

public class DailyUsable extends ItemType {

    public DailyUsable(String code, String name, float prize) {
        super(code, name, prize,new Tax().dailyUsableGst());
    }
}
