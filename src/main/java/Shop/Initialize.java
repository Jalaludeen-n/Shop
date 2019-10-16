package Shop;

import java.util.ArrayList;
import java.util.List;

public class Initialize {
    public List<ItemType> initializeItems() {
        Eatable coconut_oil = new Eatable("00001", "COCONUT OIL", 200);
        Eatable rice = new Eatable("00002", "RICE", 60);
        Eatable dhal = new Eatable("00004", "DHAL", (float) 120.50);
        DailyUsable tooth_paste = new DailyUsable("00005", "Tooth paste", (float) 45.25);
        Cosmetic makeup_kit = new Cosmetic("00006", "Makeup Kit", (float) 300.0);
        List<ItemType> items = new ArrayList<>();
        items.add(coconut_oil);
        items.add(rice);
        items.add(dhal);
        items.add(tooth_paste);
        items.add(makeup_kit);
        return items;
    }

}
