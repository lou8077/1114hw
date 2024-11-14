package homework3;

public class Sample3_15{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cars31.showSum();
        cars31 car1 = new cars31();
        car1.setCar(1234, 20.5);

        cars31.showSum();
        cars31 car2 = new cars31();
        car2.setCar(4567, 30.5);;
    }

}
class cars31
{
    public static int sum = 0;
    private int num;
    private double gas;

    public cars31()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g)
    {

        num = n;
        gas = g;
        System.out.println("生產了車號為"+ num +"，汽油量為"+ gas);
    }

    public static void showSum()
    {
        System.out.println("車子總共有"+ sum +"台");
    }

    public void show()
    {
        System.out.println("車號是:"+this.num);
        System.out.println("汽油量是:"+this.gas);
    }
}
