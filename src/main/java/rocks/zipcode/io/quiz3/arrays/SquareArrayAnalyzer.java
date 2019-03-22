package rocks.zipcode.io.quiz3.arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        Boolean answer = false;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < squaredValues.length; j++) {
                if (Math.sqrt(input[i]) == squaredValues[j]) ;
                    answer = true;
            }
        }
            return answer;
    }


//
//    Arrays.sort(input);
//        Arrays.sort(squaredValues);
//
//        for(int i = 0; i < input.length; i++) {
//        int square = input[i] * input[i];
//        if (square != squaredValues[i]) {
//            return false;
//        }
//    }
//
//        return true;
//}

}


