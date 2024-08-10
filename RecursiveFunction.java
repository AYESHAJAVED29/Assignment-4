import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 5
        System.out.print("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("GCD="  + gcd(x, y));

        // Task 1
        System.out.print("Enter a number");
        int factorialNumber = scanner.nextInt();
        long factorialResult = factorial(factorialNumber);
        if (factorialResult == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The factorial of " + factorialNumber + " is " + factorialResult);
        }
        // Task 2
        scanner.nextLine(); 
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int length = s.length();
        boolean isPalindrome = isPalindrome(s, length);
        if (isPalindrome) {
            System.out.println("Its a palindrome string");
        } else {
            System.out.println("Not a palindrome");
        }
        // Task 3
        System.out.print("Enter a positive number to count digit: ");
        int number = scanner.nextInt();
        System.out.print("Enter the digit between(0-9) to count: ");
        int digit = scanner.nextInt();
        if (digit < 0 || digit > 9) {
            System.out.println("Invalid digit");
            return;
        }
        if (number < 0) {
            System.out.println("pls enter a positive number.");
            return;
        }
        int countResult = countDigit(number, digit);
        System.out.println("The digit " + digit + " appears " + countResult);

        // Task 4
        System.out.print("Enter the number of people in the room: ");
        int people = scanner.nextInt();
        int totalHandshakes = handshake(people);
        System.out.println("The total number of handshakes for " + people + " people is " + totalHandshakes);

        // Task 7
        scanner.nextLine(); 
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        String reversedStr = reverse(str, str.length());
        System.out.println("Reversed string: " + reversedStr);

        // Task 6
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int powerResult = power(base, exponent);
        System.out.println(base + "the power of " + exponent + " is " + powerResult);

        scanner.close();
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean isPalindrome(String s, int len) {
        if (len <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(len - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, len - 1), len - 2);
    }
    
    public static int countDigit(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        if (lastDigit == digit) {
            return 1 + countDigit(n / 10, digit);
        } else {
            return countDigit(n / 10, digit);
        }
    }

    public static int handshake(int n) {
        int total = 0;
        for (int i = 2; i <= n; i++) {
            total += (i - 1);
        }
        return total;
    }

    public static String reverse(String str, int length) {
        if (length == 0) {
            return "";
        }
        return str.charAt(length - 1) + reverse(str, length - 1);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
