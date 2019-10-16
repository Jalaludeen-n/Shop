package Shop;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private float amount;

    public void netAmount(float netAmount) {
        Calculator calculator = new Calculator();
        float percentage = percentage(netAmount);
        float percentageAmount;
        System.out.println("Total Bill  : " + netAmount);
        if (percentage > 0) {
            percentageAmount = calculator.calculatePercentage(percentage, netAmount);
            System.out.println("Discount " + percentage + " " + percentageAmount);
        }
        System.out.println("Net Amount   : " + (netAmount - percentage));
    }

    public float getAmount() {
        return amount;
    }

    public String CalculateBill(String number, float quantity) {
        Calculator calculator = new Calculator();
        List<ItemType> items;
        items = new Initialize().initializeItems();
        for (ItemType item : items) {
            if (number.equals(item.getCode())) {
                float total = (calculator.calculatePercentage(item.getGst(), item.getPrize() * quantity));
                float itemTotal = total + (item.getPrize() * quantity);
                amount += itemTotal;
                return String.format("%s\t      %s\t%s\t           %s\t%s\t%s", item.getCode(), item.getName(), quantity, item.getPrize(), total, itemTotal);
            }
        }
        return " ";
    }

    private float percentage(float netAmount) {
        float percent = 0;
        if (netAmount >= 1000 && netAmount < 2000) {
            percent = 2;
            return percent;
        } else if (netAmount >= 2000) {
            percent = 5;
            return percent;
        }
        return percent;
    }
}