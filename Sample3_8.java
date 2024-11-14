package homework3;

public class Sample3_8
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        mobile car1 = new mobile();
        car1.setNumGas(1234, 20.5);
        int number = car1.getNum();
        double gasoline = car1.getGas();
        System.out.println("調查樣品車時得知");
        System.out.println("車號是"+ number +"\n汽油量是"+ gasoline);

    }

}
class mobile
{
    int num;
    double gas;

    int getNum()
    {
        System.out.println("調查車號");
        return num;
    }

    double getGas()
    {
        System.out.print("調查汽油量");
        return gas;
    }
    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為:"+ this.num +"\n將汽油輛設為:"+this.gas );
    }
}
