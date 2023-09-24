public class Main {
    public static void main(String[] args)
    {
        double springCost = 120;
        double summerCost = 220;
        double fallCost = 255;
        double winterCost = 290;

        double yearlyTotal = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your spring maintenace cost is: $ " + springCost);
        System.out.println("Your summer maintenace cost is: $ " + summerCost);
        System.out.println("Your fall maintenace cost is: $ " + fallCost);
        System.out.println("Your winter maintenace cost is: $ " + winterCost);
        System.out.println("Your yearly maintenace total is: $ " + yearlyTotal);
    }
}