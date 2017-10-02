package TDD;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StringCalculator {

    public static int Add(String numbers){

        String[] numbersArray = numbers.split(",");
        int result = 0;
        if(numbers.length() == 0){
            return 0;
        }
        else if(numbersArray.length == 1){
            return Integer.parseInt(numbers);
        }
        else {
            for(int i = 0; i < numbersArray.length; i++){
                result = result+Integer.parseInt(numbersArray[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = StdIn.readLine().toString();
        int total = Add(s);
        StdOut.print(total);
    }

}
