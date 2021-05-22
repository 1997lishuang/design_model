package product;

import shopMan.FruitsTarget;

public class BuyApplesFruits implements FruitsTarget {
    @Override
    public void buy() {
        ApplesFruits applesFruits = new ApplesFruits();

        System.out.println("进货水果成功");
    }
}
