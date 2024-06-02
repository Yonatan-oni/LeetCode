class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        int result = 0;

        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            int multiple = 1;

            while (lDividend >= tempDivisor + tempDivisor) {
                tempDivisor += tempDivisor;
                multiple += multiple;
            }

            lDividend -= tempDivisor;
            result += multiple;
        }

        return negative ? -result : result;
    }
}