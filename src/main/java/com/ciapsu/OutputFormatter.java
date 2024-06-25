package main.java.com.ciapsu;

import java.util.List;

public class OutputFormatter {
    public static void printAddition(List<Integer> numbers) {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total = Calculator.add(total, numbers.get(i));
            if (i == 0) {
                System.out.print("\t"+numbers.get(i));
            } else {
                System.out.print("\t+" + numbers.get(i) + " (=" + total + ")");
            }
            System.out.println();
        }
        System.out.println("-------");
        System.out.println("total = " + total + " (addition)");
    }

    public static void printMultiplication(List<Integer> numbers) {
        int total = 1;
        for (int i = 0; i < numbers.size(); i++) {
            total = Calculator.multiply(total, numbers.get(i));
            if (i == 0) {
                System.out.print("\t"+numbers.get(i));
            } else {
                System.out.print("\t*" + numbers.get(i) + " (=" + total + ")");
            }
            System.out.println();
        }
        System.out.println("-------");
        System.out.println("total = " + total + " (multiplication)");
    }
}
