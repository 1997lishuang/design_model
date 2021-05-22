package User;


import adapter.UserAddValidAdapter;
import login.FaceRecognition;
import login.LoginMethod;
import util.TargetValid;
import util.UserValid;

/*

   设计的思路为在原有的基础上添加一个新的功能。
   设计模式为设配器模式



     登录的方式有几种  人脸识别   扫描登录等方式。

 */
public class ClientUser {

    public static void main(String[] args) {

        TargetValid targetValid = new UserAddValidAdapter(new UserValid());
        boolean validTel = targetValid.isValidTel();
        if(validTel==true){

            LoginMethod loginMethod = new FaceRecognition();
            Boolean issuccess = loginMethod.Method();
            if(true==issuccess){
                //进去管理页面
            }else {
                //请重新验证
            }
        }
    }
}