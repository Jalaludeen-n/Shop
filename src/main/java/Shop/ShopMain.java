package Shop;

import com.sun.tools.classfile.ConstantPool;
import sun.security.provider.SHA;

import java.awt.*;
import java.util.Scanner;
//m Code	Item Name	Quantity         Unit Price	Tax		Price
//        ----------------------------------------------------------------------------------------------------------
//        00001		Coconut Oil	1		200		10		210.00
//        00004		Dhal		1.5		120.50		9.04		189.79
//        00006		Makeup Kit	2		300		90.00		690.00
//        ------------------------------------------------------------------------------------------------------------
//        Total Bill			1089.80
//        Discount (2%)                             21.80
//        Total				1068.00

public class ShopMain {
    public static void main(String... args) {
        float netAmount = 0;
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of items :");
        int total = sc.nextInt();

//        Item Code	Item Name	Quantity         Unit Price	Tax		Price
//                ----------------------------------------------------------------------------------------------------------
//        00001		Coconut Oil	1		200		10		210.00
//        00004		Dhal		1.5		120.50		9.04		189.79
//        00006		Makeup Kit	2		300		90.00		690.00
//                ------------------------------------------------------------------------------------------------------------
//        Total Bill			1089.80
//        Discount (2%)                             21.80
//        Total				1068.00

        while (total-- > 0) {
            System.out.println("Enter the item number ");
            String item = sc.next();
            System.out.println(item);
            System.out.println("Enter the quantity of item ");
            float quantity = sc.nextFloat();
            System.out.println(quantity);
            netAmount += shop.CalculateBill(item, quantity);
        }
        shop.netAmount(netAmount);

    }
}
