package rocks.zipcode.io.generics;

import java.util.Collection;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection){

        T[] array = (T[]) new Object[collection.size()];




        return collection.toArray(array);



    }
}
