package homework3;

public class Sample3_13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cars27 car1 = new cars27();
        car1.show();
        cars27 car2 = new cars27(1234, 25.0);
        car2.show();
    }

}
class cars27
{
    private int num;
    private double gas;

    public cars27()
    {

        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public cars27(int n, double g)
    {

        num = n;
        gas = g;
        System.out.println("生產了車號為"+ num +"，汽油量為"+ gas);
    }

    public void show()
    {
        System.out.println("車號是:"+this.num);
        System.out.println("汽油量是:"+this.gas);
    }
}
