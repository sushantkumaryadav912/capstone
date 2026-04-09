package capstone_april;

//Prime Number (Time complexity)

public class problem10 {

    public static void main(String[] args) {
        int n = 40;

        for(int i = 2; i <= 40; i++) {
            System.out.println(i + " : " + isPrime(i));
        }
    }

    static boolean isPrime(int num) {
        int i = 2;
        while(i*i <= num) {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}