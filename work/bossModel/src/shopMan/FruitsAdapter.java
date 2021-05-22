package shopMan;

public class FruitsAdapter implements FruitsTarget{


    public Faced faced;

    public FruitsTarget fruitsTarget;

    public FruitsAdapter(Faced faced, FruitsTarget fruitsTarget) {
        this.faced = faced;
        this.fruitsTarget = fruitsTarget;
    }

    public void setFruitsTarget(FruitsTarget fruitsTarget) {
        this.fruitsTarget = fruitsTarget;
    }

    public FruitsTarget getFruitsTarget() {
        return fruitsTarget;
    }


    public Faced getFaced() {
        return faced;
    }

    public void setFaced(Faced faced) {
        this.faced = faced;
    }

    /*
             我的选择 注入方式为 构造注入
         */
    public FruitsAdapter(Faced faced) {
        this.faced = faced;
    }


    @Override
    public void buy() {

         faced.buy();
         fruitsTarget.buy();
    }
}
