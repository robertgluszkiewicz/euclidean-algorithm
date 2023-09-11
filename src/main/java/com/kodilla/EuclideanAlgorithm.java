package com.kodilla;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class EuclideanAlgorithm {
    public int a;
    public int b;

    public EuclideanAlgorithm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void calculateGreatestCommonDivisor() {
        int firstA = a;
        int firstB = b;

        if (a>0 && b>0) {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            System.out.println("For numbers " + firstA + " and " + firstB + " the greatest common divisor is " + a);
        } else {
            System.out.println("At least one of the numbers is less or equal zero. The greatest common divisor does not exist!");
        }
    }
}

