package homework3;

public class Sample3_7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        crs car1 = new crs();
        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }

}
class crs
{
    int num;
    double gas;

    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為:"+ this.num +"\n將汽油輛設為:"+this.gas );
    }
}