package boss;

public class Employee extends Element implements CountPerson {

    public Dianzhan dianzhan;
    public LeaveHandler leaveHandler;

    public void setLeaveHandler(LeaveHandler leaveHandler) {
        this.leaveHandler = leaveHandler;
    }

//    public Employee() {
//
//    }

    private int sum = 0;

    public Employee(int sum) {
        this.sum = sum;
    }


    /*
         员工向领导请假功能
     */
    public void leave(Integer info){
         leaveHandler.process(info);
    }
    @Override
    public int count() {
        return sum;
    }

     //+++++++

    //身份标识
    public int cardCode;

    //工作年限
    public int workTime;

    //等级
    public int grade;

    //雇员总工资
    public int sumSalary;

    public int getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(int sumSalary) {
        this.sumSalary = sumSalary;
    }

    public int getCardCode() {
        return cardCode;
    }

    public void setCardCode(int cardCode) {
        this.cardCode = cardCode;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Employee(int cardCode, int workTime, int grade) {
        this.cardCode = cardCode;
        this.workTime = workTime;
        this.grade = grade;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);

    }

    @Override
    public void acceptTwo(Visitor visitor) {
        visitor.calSalarySum(this);
    }
    //++++++



}
