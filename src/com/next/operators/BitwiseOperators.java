package com.next.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
            // Initial values
            int a = 3;
            int b = 7;

            // bitwise and
            // 0101 & 0111=0101 = 5
            System.out.println("a&b = " + (a & b));

            // bitwise or
            // 0101 | 0111=0111 = 7
            System.out.println("a|b = " + (a | b));

            // bitwise xor
            // 0101 ^ 0111=0010 = 2
            System.out.println("a^b = " + (a ^ b));
    }
}
