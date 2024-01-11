public class EmpWageUC2 {

    public static void main(String[] args) {

        int isEmpFullTime = 1;
        int empRatePerHour = 20;
        double randomValue = Math.random();
        // Convert the double value to an integer (0 or 1)
        int empCheck = (int) Math.round(randomValue);
        int empStatus = empCheck == isEmpFullTime ? 8 * empRatePerHour : 0;
        System.out.println(empStatus);

    }

}