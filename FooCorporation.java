public class FooCorporation {
    public static void weeklyPay (double basePay,int hoursWorked) {
        double totalPay = 0;
        double hoursOverForty = 0;
        if (basePay < 8 || hoursWorked > 60)
            System.out.println("Invalid Value");
        else if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
            System.out.println("weekly pay = " + totalPay);
        } else if (hoursWorked > 40) {
            hoursOverForty=(((hoursWorked-40)*1.5)*basePay)+(40*basePay);
            System.out.println("weekly pay = "+hoursOverForty);
        }
    }
}
