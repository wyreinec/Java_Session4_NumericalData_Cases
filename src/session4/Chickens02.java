package session4;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        double eggsMonday, eggsTuesday, eggsWednesday;
        double dailyAverage, monthlyAverage, monthlyProfit;
        
        eggsMonday = 100;
        eggsTuesday = 121;
        eggsWednesday = 117;
        
        dailyAverage = (eggsMonday + eggsTuesday + eggsWednesday) / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
