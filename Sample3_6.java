package homework3;

public class Sample3_6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        carss car1 = new carss();
        car1.num = 1234;
        car1.gas = 20.5;

        car1.setNum(1234);
        car1.setGas(20.6);
    }

}
class carss
{
    int num;
    double gas;

    void setNum(int n)
    {
        num = n;
        System.out.println("將車號設為:"+this.num);
    }

    void setGas(double g)
    {
        gas = g;
        System.out.print("將汽油設為:"+this.gas);
    }
}