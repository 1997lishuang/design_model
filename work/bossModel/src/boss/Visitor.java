package boss;

public interface Visitor {

    //访问的目的为 获取全部雇员的工资情况
    public  abstract void visite(Element element);

    //获取全部雇员的总工资
    public  abstract int calSalarySum(Element element);


}
