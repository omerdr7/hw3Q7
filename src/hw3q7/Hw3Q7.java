package hw3q7;

import java.util.ArrayList;

public class Hw3Q7 {

    public static boolean isDecimalHarshad(int sayi) {
        int counter = 0;

        ArrayList<Integer> list = new ArrayList<>();
        int sumOfDigits = 0;
        if (sayi > 0) {
            while (sayi > 0) {
                int digit = sayi % 10;
                list.add(digit);
                sayi = sayi / 10;
                counter++;
            }
            sayi = 3245;//I defined it again because after the digit count process sayi is eqaul zero. 
            System.out.println("digit count=" + counter);
            for (Integer integer : list) {
                System.out.println("digits=" + integer);
            }
            for (int i = 0; i < counter; i++) {
                sumOfDigits = sumOfDigits + list.get(i);
            }

            System.out.println("Sum of digits= " + sumOfDigits);
            if (sayi % sumOfDigits == 0) {
                System.out.println("It is Harshad number= " + sayi);
            } else {
                System.out.println(sayi + " ->It is not a Harshad number.");
            }
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        isDecimalHarshad(3245);
      
    }

}
