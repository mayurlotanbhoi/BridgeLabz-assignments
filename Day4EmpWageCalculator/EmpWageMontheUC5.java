public class EmpWageMontheUC5 {

    public static void main(String[] args) {

        int empRatePerHour = 20;
        double randomValue = Math.random();
        // Convert the double value to an integer (0 or 1)
        int howManyDaysPresent = (int) Math.round(randomValue * 20);

        int empWageAccordintToMonthe = howManyDaysPresent * 8;
        System.out.println("Employee Wages According to working Day in  Month " + "No of Day Present " +
                +howManyDaysPresent + "Day " + empWageAccordintToMonthe);

    }

}