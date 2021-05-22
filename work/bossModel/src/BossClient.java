import boss.Boss;
import boss.Dianzhan;
import boss.Employee;
import boss.LeaveHandler;

public class BossClient {

    /*
         老板的功能
            1.获取公司的总人数 组合的设计模式
            2.给雇员请假 责任链模式

     */
    public static void main(String[] args) {

        /*
           测试公司一共多少人
         */
        Dianzhan dianzhan = new Dianzhan();
        dianzhan.addEmploy(new Employee(10));

        Dianzhan dianzhan2 = new Dianzhan();
        dianzhan2.addEmploy(new Employee(20));

        Boss boss = new Boss();
        boss.addDianzhan(dianzhan);
        boss.addDianzhan(dianzhan2);

        int count = boss.count();

        System.out.println(count);

        /*
           测试请假功能
         */
//        LeaveHandler dianzhan = new Dianzhan();
//        LeaveHandler boss = new Boss();
//        dianzhan.setNextleaveHandler(boss);
//        Employee employee = new Employee();
//        employee.setLeaveHandler(dianzhan);
//        employee.leave(12);

    }
}
