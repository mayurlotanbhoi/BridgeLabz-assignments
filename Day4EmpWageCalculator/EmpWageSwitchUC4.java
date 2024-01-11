public class EmpWageSwitchUC4 {

    public static final int isEmpPartTime = 1;
    public static final int isEmpFullTime = 2;
    public static final int empRatePerHour = 20;

    public static void main(String[] args) {

        double randomValue = Math.random();
        // Convert the double value to an integer (0 or 1)
        int empCheck = (int) Math.round(randomValue * 2);
        int empWage = 0;
        System.out.println(empCheck);

        switch (empCheck) {
            case isEmpPartTime:
                empWage = (4 * empRatePerHour);
                break;
            case isEmpFullTime:
                empWage = (8 * empRatePerHour);
                break;
            default:
                empWage = (0 * empRatePerHour);
                break;
        }

        // int empStatus = empCheck == isEmpPartTime ? 4 : 8;
        System.out.println(empWage);

    }

}