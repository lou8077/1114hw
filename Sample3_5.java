package homework3;

public class Sample3_5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        cars car1 = new cars();
        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
    }

}
class cars
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車號是:"+this.num);
        System.out.print("汽油量是:"+this.gas);
    }

    void showCar()
    {
        System.out.println("開始顯示車子資料");
        this.show();
    }
}
