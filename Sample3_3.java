package homework3;

public class Sample3_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ca car1 = new Ca();
        car1.num = 12345;
        car1.gas = 20.5;

        Ca car2 = new Ca();
        car2.num = 2345;
        car2.gas = 30.5;

        System.out.println("一號車號是:"+car1.num);
        System.out.println("一號汽油量是:"+car1.gas);
        System.out.println("二號車號是:"+car2.num);
        System.out.print("二號汽油量是:"+car2.gas);
    }

}
class Ca
{
    int num;
    double gas;
}