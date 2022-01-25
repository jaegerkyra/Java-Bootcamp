public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        int simpleSales = (int)sales;

        double profit = 18562.18;
        int simpleProfit = (int)profit; 

        double refunds = 688.78; 
        int simpleRefunds = (int)refunds;

        double shipping = 1233.57; 
        int simpleShipping = (int)shipping;

        System.out.println("This month, we made $" + simpleSales + " in sales");
        System.out.println("Factoring in costs, we made $" + simpleProfit + " in profit");
        System.out.println("The refunds are at a low $" + simpleRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + simpleShipping + " in shipping");
    }
}