package Shop;

public abstract class ItemType  {

    private String code;
    private String name;
    private float prize;
    private float gst;

    public ItemType(String code, String name, float prize, float gst) {
        this.code = code;
        this.name = name;
        this.prize = prize;
        this.gst = gst;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public float getPrize() {
        return prize;
    }

    float getGst() {
        return gst;
    }
}
