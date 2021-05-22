package util.loginMothod;

public class HuaweiWay implements Method  {



    public CameraMethodValid cameraMethodValid;

    public HuaweiWay(CameraMethodValid cameraMethodValid) {
        this.cameraMethodValid = cameraMethodValid;
    }

    @Override
    public String PcMethod() {
        boolean camera = cameraMethodValid.camera();
        if(camera==true){
            return "success";
        }

        return "false";
    }

    @Override
    public String AppMethod() {
        boolean camera = cameraMethodValid.camera();
        if(camera==true){
            return "success";
        }

        return "false";
    }

    public CameraMethodValid getCameraMethodValid() {
        return cameraMethodValid;
    }

    public void setCameraMethodValid(CameraMethodValid cameraMethodValid) {
        this.cameraMethodValid = cameraMethodValid;
    }

}
