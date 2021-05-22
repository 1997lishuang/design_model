package boss;

import java.util.ArrayList;
import java.util.List;

public class Dianzhan extends LeaveHandler implements CountPerson,Visitor{
    private List<Employee> Employees = new ArrayList<>();

    public Boss boss;

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> employees) {
        Employees = employees;
    }

    public Dianzhan() {

    }
    public Dianzhan(Boss boss) {
        this.boss = boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public void addEmploy(Employee employee){
        Employees.add(employee);
    }
    //请假

    @Override
    public void process(Integer info) {
        if(info<10){
            System.out.println("-向店长请假成功—");
        }else {
            nextleaveHandler.process(info);
        }
    }

      @Override
    public int count() {
        int sum = 0;
        for(CountPerson countPerson :Employees){
            sum  += countPerson.count();
        }
        return sum;
    }


    @Override
    public void visite(Element element) {

        Employee employee = (Employee) element;

        System.out.println("工资为："+employee.getGrade()*employee.getWorkTime()*10);

    }


    @Override
    public int calSalarySum(Element element) {

        Employee employee = (Employee) element;
        employee.setSumSalary(employee.getGrade()*employee.getWorkTime()*10);
        return employee.getSumSalary();
    }

    /*
       统计本店员工的总工资
     */

    public int calShopSalary(Visitor visitor){
        int sum =0;
         for (Employee employee:Employees){

            employee.acceptTwo(visitor);
            sum += employee.getSumSalary();
         }
        System.out.println("雇员的总工资为"+sum);
        return sum;
    }

    public void showEveryOneSalary(Visitor visitor){

        for (Employee employee:Employees){
            employee.accept(visitor);
        }

    }
}
