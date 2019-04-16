package rocks.zipcode.io.arrays;

import java.lang.reflect.Array;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {



        Integer [] newArray  =  new Integer[]{end};

       int[] array = IntStream.range(start, end+1).toArray();

        Integer[] ever = IntStream.of( array ).boxed().toArray( Integer[]::new );







        return ever;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {

        char[] charr= new char[array.length];

        for(int i=0;i<array.length;i++){

            charr[i]=array[i];


        }

        return charr;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array)


    {
        Character[] charr= new Character[array.length];

        for(int i=0;i<array.length;i++){

            charr[i]=array[i];


        }

        return charr;

    }
}
