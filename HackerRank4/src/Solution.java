public class Solution {
    public static void main(String[] args) {
        Prime prime = new Prime();
        
        // Llamadas al método checkPrime con varios números
        prime.checkPrime(2);
        prime.checkPrime(2, 1);
        prime.checkPrime(2, 1, 3);
        prime.checkPrime(2, 1, 3, 4, 5);
    }
}