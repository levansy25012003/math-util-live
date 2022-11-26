
package com.fu.mathutil;
// Ta viết cái class cung cấp tiện ích cho nơi kahcs xài.
public class MathUtil {
       
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("nhap n lo");
            // hàm dừng liền.
        if (n == 0 || n == 1)
            return 1; 
        long product = 1;// tich khởi đầu bằng 1
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }   
    
    
}
