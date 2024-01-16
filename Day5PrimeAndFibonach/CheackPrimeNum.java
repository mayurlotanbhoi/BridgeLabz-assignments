
public class CheackPrimeNum {

    public static boolean findPrimeNum(int num) {
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int count = 0;
        int num = 2;

        while (count < 10) {
            boolean isPrime = findPrimeNum(num);
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
