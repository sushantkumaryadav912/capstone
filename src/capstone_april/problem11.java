package capstone_april;

public class problem11 {

    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];

        sieve(n, prime);
    }

    static void sieve(int num, boolean[] prime) {
        for(int i = 2; i*i <= num; i++) {
            if(!prime[i]) {
                for(int j = i*2; j <= num; j = j+i) {
                    prime[j] = true;
                }
            }
        }
        //for space complexity
        for(int i = 2; i <= num; i++) {
            if(!prime[i]) {
                System.out.println(i + " ");
            }
        }
    }
}