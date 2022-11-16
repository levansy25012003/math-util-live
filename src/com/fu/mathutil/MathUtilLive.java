
package com.fu.mathutil;

public class MathUtilLive {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println(result); 
        System.out.println(MathUtil.getFactorial(6));
        System.out.println(MathUtil.getFactorial(0));

        //MathUtil.getFactorial(-5);
    }
}
