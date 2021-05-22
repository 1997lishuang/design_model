package shopMan;


/*
     店长采购 商品采用门面模式
 */


import boss.Dianzhan;
import boss.Employee;
import product.*;

import java.util.ArrayList;
import java.util.List;

/*
    现在 老板  又有增加了一个采购的需求 为采购 fruits水果。

    分析：
         不在原有的代码中修改 所以采用 设配器模式 来扩展功能
 */
public class ShopDianZhan {

       public  void  buy(Faced faced){

           faced.buy();
           System.out.println("通过中间人完成了进货");
       }
       /*
           新增加进货水果的功能   采用 设配器模式
        */
       public  void enhanceBuy(FruitsAdapter fruitsAdapter){

           fruitsAdapter.buy();

       }

    public static void main(String[] args) {
           /*
              门面模式 加 设配器测试
            */
//        ShopDianZhan shopDianZhan = new ShopDianZhan();
//
//        shopDianZhan.enhanceBuy(new FruitsAdapter(new Faced(new BuyEggs(),new BuyFrozenDrinks(),new BuyMeat()),new BuyApplesFruits()));
//
        /*
           访问者模式 测试
         */
        Dianzhan dianzhan = new Dianzhan();
        List employees = new ArrayList();
        Employee one  = new Employee(1,2,1);
        Employee two   = new Employee(2,20,1);
        Employee three = new Employee(3,200,1);
        employees.add(one);
        employees.add(two);
        employees.add(three);
        dianzhan.setEmployees(employees);

//        dianzhan.showEveryOneSalary(dianzhan);

        dianzhan.calShopSalary(dianzhan);
    }


}
