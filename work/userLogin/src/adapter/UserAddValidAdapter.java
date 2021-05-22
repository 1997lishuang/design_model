package adapter;

import util.TargetValid;
import util.UserValid;

public class UserAddValidAdapter implements TargetValid {

    public UserValid userValid;

    public UserAddValidAdapter(UserValid userValid) {
        this.userValid = userValid;
    }


    @Override
    public boolean isValidTel() {
        boolean validCode = userValid.isValidCode();
        if(validCode==true){
            return true;
        }
        return false;
    }

}
