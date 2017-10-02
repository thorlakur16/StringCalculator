package TDD;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int Add(String numbers){

        String[] numbersArray = numbers.split(",");
        ArrayList<Integer> negative = new ArrayList<Integer>();
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
        for(int i = 0; i < numbersArray.length; i++){
            if(Integer.parseInt(numbersArray[i]) < 0){
                negative.add(Integer.parseInt(numbersArray[i]));
            }
        }

        if(negative.isEmpty()){
            return result;
        }
        else{
            StdOut.print("Negative numbers not allowed: ");
            for(int i = 0; i < negative.size(); i++){
                StdOut.print(negative.get(i));
                StdOut.print(" ");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = StdIn.readLine().toString();
        s = s.replace("\\n","," );
        int total = Add(s);
        if(total != -1){
            StdOut.print(total);
        }
    }

}
