package homework3;

public class Sample3_24{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cars51[] car1 = new cars51[3];

        for(int i = 0; i < car1.length; i++)
            car1[i] = new cars51();

        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        for(int i = 0; i < car1.length; i++)
            car1[i].show();
    }

}
class cars51
{
    private int num;
    private double gas;

    public cars51()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g)
    {

        num = n;
        gas = g;
        System.out.println("設車號為"+ num +"，汽油量為"+ gas);
    }

    public void show()
    {
        System.out.print("車號是:"+this.num);
        System.out.println(" 汽油量是:"+this.gas);
    }
}
