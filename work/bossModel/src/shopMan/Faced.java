package shopMan;

import product.BuyEggs;
import product.BuyFrozenDrinks;
import product.BuyMeat;

public class Faced {
         public BuyEggs buyEggs;
         public BuyFrozenDrinks buyfrozenDrinks;
         public BuyMeat buyMeat;

          public Faced(BuyEggs buyEggs, BuyFrozenDrinks buyfrozenDrinks, BuyMeat buyMeat) {
             this.buyEggs = buyEggs;
             this.buyfrozenDrinks = buyfrozenDrinks;
             this.buyMeat = buyMeat;
          }

         public void buy(){
                buyEggs.buy();
                buyMeat.buy();
                buyfrozenDrinks.buy();

         }
}
