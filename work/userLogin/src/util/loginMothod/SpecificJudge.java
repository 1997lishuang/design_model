package util.loginMothod;

public class SpecificJudge implements Judge{


    public  Method m;
    @Override
    public Method isjudge(String way, String id) {


        if("0".equals(id)&&"pc".equals(way)){

               Method m  = new HuaweiWay(new HuaweiCamera());

        }else if("1".equals(id)&&"pc".equals(way)){

               Method m  = new XiaomiWay(new XiaomiCamera());

        }else if("0".equals(id)&&"app".equals(way)) {

                Method m  = new HuaweiWay(new HuaweiCamera());

        }else if ("1".equals(id)&&"app".equals(way)){
                Method m  = new XiaomiWay(new XiaomiCamera());
        }
        else {
            m = null;
        }
        return m;

    }
}
