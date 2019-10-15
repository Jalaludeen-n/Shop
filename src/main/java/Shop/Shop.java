package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Calculator {

    List<ItemType> initializeItems() {
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

    void netAmount(float netAmount) {

        float percentage = 0;
        System.out.println("Total Bill  : " + netAmount);
        if (netAmount >= 1000 && netAmount < 2000) {
            percentage = calculatePercentage(2, netAmount);
            System.out.println("Discount(2%)   :" + percentage);
        } else if (netAmount >= 2000) {
            percentage = calculatePercentage(2, netAmount);
            System.out.println("Discount(5%)  :" + percentage);
        } else
            System.out.println("Discount(0%)" + percentage);

        System.out.println("Net Amount   : " + (netAmount - percentage));
    }

    float CalculateBill(String number, float quantity) {
        List<ItemType> items;
        float amount = 0;
        items = initializeItems();
        System.out.println("Item Code\t  Item Name\t   Quantity  \t  Unit Price\tTax\t\tPrice");
        for (ItemType item : items) {
            if (number.equals(item.code)) {
                float total = (calculatePercentage(item.getGst(), item.getPrize() * quantity));
                float itemTotal = total + (item.getPrize() * quantity);
                System.out.println(item.getCode() + "\t      " +
                        item.getName() + "\t" +
                        quantity + "\t           " + item.getPrize() +
                        "\t" + total + "\t"
                        + itemTotal);
                amount += itemTotal;
            }
        }
        return amount;
    }
}
