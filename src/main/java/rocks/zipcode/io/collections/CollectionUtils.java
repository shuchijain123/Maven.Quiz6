package rocks.zipcode.io.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;

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
        if (nestedCollection.contains(collection))


            return true;

        else
            return false;
    }


    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {

        Collection list = new ArrayList<>();

      list =  Arrays.stream(collections).collect(Collectors.toCollection(ArrayList::new));


          return list;
        }



    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {

        Collection colList = new ArrayList();

        for (Collection s : collections) {

          ((ArrayList) colList).addAll(s);

            System.out.println("value= " + s);
        }

        return colList;

    }
}