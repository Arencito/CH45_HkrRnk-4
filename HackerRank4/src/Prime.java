import java.io.*;
import java.util.*;

class Prime {
   
    public void checkPrime(int... numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); 
    }

    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; 
        }
        return true; 
    }
}