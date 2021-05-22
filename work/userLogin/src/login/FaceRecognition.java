package login;


/*
   人别识别登录
 */


import util.ModelTrain;
import util.loginMothod.Judge;
import util.loginMothod.Method;
import util.loginMothod.SpecificJudge;

public class FaceRecognition implements LoginMethod {



   public Judge judge;

   public ModelTrain modelTrain;

    //做人脸识别准备工作
        /*
           1  判单你通过什么方式登录 pc app
              1.1调用你本机的摄像头
                 1.1.1 判断你是什么设备
                  工厂模式 做判断
                  返回 boolean

           2.传入图片的数据 模型训练
                返回boolean
         */
    @Override
    public Boolean Method() {


        /*
           这里只需要调用 具体的摄像头
         */
        judge = new SpecificJudge();
        Method pc = judge.isjudge("pc", "1");
        String s = pc.AppMethod();
        if("success".equals(s)){
                //完成准备摄像头的步骤

            boolean train = modelTrain.train();

            if(true==train){
                 return true;
            }

        }
        return false;

    }
}
