package session4;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        
        // First Scenario = 45
        int eggsPerChicken, chickenCount, totalEggs;
        int eggsPerChicken2, chickenCount2, totalEggs2;
        
        eggsPerChicken = 5;
        chickenCount = 3;

        //monday
        totalEggs = eggsPerChicken * chickenCount;
        System.out.println("total eggs monday " + totalEggs);
        
        //tuesday
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("total eggs tuesday " + totalEggs);
        
        //wednesday;
        chickenCount = chickenCount / 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("total eggs wednesday " + totalEggs);
        
        // Second Scenario = 84
        System.out.println("");
        System.out.println("Second Scenario");
        eggsPerChicken2 = 4;
        chickenCount2 = 8;
        
        //monday
        totalEggs2 = eggsPerChicken2 * chickenCount2;
        System.out.println("total eggs monday " + totalEggs2);
        
        //tuesday
        chickenCount2++;
        totalEggs2 += eggsPerChicken2 * chickenCount2;
        System.out.println("total eggs tuesday " + totalEggs2);
        
        //wednesday;
        chickenCount2 = chickenCount2 / 2;
        totalEggs2 += eggsPerChicken2 * chickenCount2;
        System.out.println("total eggs wednesday " + totalEggs2);
        
    }   
}
