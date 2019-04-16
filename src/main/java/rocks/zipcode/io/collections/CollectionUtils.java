package rocks.zipcode.io.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {


        E[] array = (E[]) new Object[collection.size()];

        collection.toArray(array);


        return Arrays.stream(array).collect(Collectors.toCollection(ArrayList::new));


    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {


        Boolean ans = true;

        if (Collections.disjoint(nestedCollection, collection)) {

            ans = true;

        } else{


            ans = false;

    }

    return ans;
}



    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {

     List list = new ArrayList< >();




    return (Collection<? extends Collection<?>>) Arrays.asList(collections).parallelStream().collect(Collectors.toCollection(() -> list));
    }





    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {



        return null;
    }
}
