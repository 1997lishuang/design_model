package util.loginMothod;

public class XiaomiWay implements Method {

    public CameraMethodValid cameraMethodValid;

    public XiaomiWay(CameraMethodValid cameraMethodValid) {
        this.cameraMethodValid = cameraMethodValid;
    }

    @Override
    public String PcMethod() {
        return null;
    }

    @Override
    public String AppMethod() {
        return null;
    }
}
