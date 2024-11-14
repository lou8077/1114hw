package homework3;

public class Sample3_9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        mobiles car1 = new mobiles();
        car1.num = 1234;
        car1.gas = -10;

        car1.show();
    }

}
class mobiles
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車號是:"+this.num);
        System.out.print("汽油量是:"+this.gas);
    }
}