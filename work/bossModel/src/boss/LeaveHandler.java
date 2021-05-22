package boss;

public  abstract class LeaveHandler {

    public LeaveHandler nextleaveHandler;

    public abstract void process(Integer info);

    public void setNextleaveHandler(LeaveHandler nextleaveHandler) {
        this.nextleaveHandler = nextleaveHandler;
    }
}
