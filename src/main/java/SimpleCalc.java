public class SimpleCalc {
    public int add(int numOne, int numTwo) {
        if (numOne < 0) {
            numOne = 0;
        } else if (numTwo < 0) {
            numTwo = 0;
        }
        return numOne + numTwo;
    }

    public int subtract (int numOne, int numTwo) {
        if (numOne < 0) {
            numOne = 0;
        } else if (numTwo < 0) {
            numTwo = 0;
        }
        return Math.max(numOne - numTwo, 0);
    }

    public int multiply(int numOne, int numTwo) {
        return numOne < 0 || numTwo < 0 ? 0:numOne * numTwo;
    }

    public int division (int divisor, int dividend) throws IllegalArgumentException {
        if (divisor <= 0) {
            throw new IllegalArgumentException("bad");
        }
        if (dividend < 0) {
            dividend = 0;
        }
        return dividend / divisor;
    }

    public int remainder (int divisor, int dividend) {
        int remain = 0;
        try {
            if (dividend < 0) {
                dividend = 0;
            }
            if (divisor < 0) {
                divisor = 0;
            }
            remain = dividend % divisor;
        } catch (ArithmeticException badDivisor) {
            System.out.println("cannot divide by zero");
            return -1;
        }
        return remain;
    }

    public boolean isOddNumber(int num) {
        return num % 2 != 0;
    }
}
