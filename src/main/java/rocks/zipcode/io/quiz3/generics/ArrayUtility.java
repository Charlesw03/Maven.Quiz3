package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
            int count = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[i]==array[j]){
                    count++;
                }
            }


        }
            return null;
}

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
