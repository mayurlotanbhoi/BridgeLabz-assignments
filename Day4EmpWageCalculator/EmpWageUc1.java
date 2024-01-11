public class EmpWageUc1 {

    public static void main(String[] args) {

        int isEmpPresent = 1;
        double randomValue = Math.random();
        // Convert the double value to an integer (0 or 1)
        int empCheck = (int) Math.round(randomValue);
        String empStatus = empCheck == isEmpPresent ? "Employee is Present" : "Employee is Not Present";
        System.out.println(empStatus);

    }

}