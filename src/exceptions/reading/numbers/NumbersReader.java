package exceptions.reading.numbers;

import java.util.Scanner;

public class NumbersReader {

    public static void run() throws OutOfBoundsException
    {
        Scanner scanner  = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number != 0){
            if ((number > 100) || (number < 0)){
                throw new OutOfBoundsException("WENT_OUT_OF_BOUNDS");
            }
            number = scanner.nextInt();
        }
    }
}
