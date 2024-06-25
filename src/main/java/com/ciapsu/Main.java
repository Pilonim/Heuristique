package main.java.com.ciapsu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Il faut le nom du fichier et l'operateur en argument");
            return;
        }
        String fileName = args[0];
        String operation = args[1];

        List<Integer> numbers = CSVReader.readCSV(fileName);

        switch (operation) {
            case "+":
                OutputFormatter.printAddition(numbers);
                break;
            case "*":
                OutputFormatter.printMultiplication(numbers);
                break;
            default:
                System.out.println("L'operateur n'est pas supporter");
                break;
        }
    }
}
