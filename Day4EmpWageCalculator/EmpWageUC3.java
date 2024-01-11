public class EmpWageUC3 {

    public static void main(String[] args) {

        int isEmpPartTime = 1;
        int isEmpFullTime = 2;
        int empRatePerHour = 20;
        double randomValue = Math.random();
        // Convert the double value to an integer (0 or 1)
        int empCheck = (int) Math.round(randomValue * 3);

        int empStatus = empCheck == isEmpPartTime ? 4 : 8;
        System.out.println(empStatus * empRatePerHour);

    }

}