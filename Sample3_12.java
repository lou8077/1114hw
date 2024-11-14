package homework3;

public class Sample3_12 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    cars26 car1 = new cars26();
    car1.show();
}

}
class cars26
{
    private int num;
    private double gas;

    public cars26()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show()
    {
        System.out.println("車號是:"+this.num);
        System.out.print("汽油量是:"+this.gas);
    }
}
