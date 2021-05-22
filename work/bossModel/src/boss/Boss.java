package boss;

import java.util.ArrayList;
import java.util.List;

public class Boss extends LeaveHandler implements  CountPerson{

    //==========
    @Override
    public void process(Integer info) {
        if(info<20){
            System.out.println("-向老板请假成功-");
        }else {
            System.out.println("请假时间过长 不予请假");
        }

    }
    //===============


    public List<Dianzhan> dianzhans = new ArrayList<>();

    public void addDianzhan(Dianzhan dianzhan)
    {

        dianzhans.add(dianzhan);
    }

    public  void free(Dianzhan dianzhan)
    {
        dianzhans.remove(dianzhan);
    }

    @Override
    public int count() {
        int sum = 0;
        for(Dianzhan dianzhan :dianzhans){
            sum  += dianzhan.count();
        }
        return sum;
    }


}
