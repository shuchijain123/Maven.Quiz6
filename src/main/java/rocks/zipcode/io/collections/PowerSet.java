package rocks.zipcode.io.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {


    protected final Set<TypeOfSet> originalSet;


    public PowerSet(TypeOfSet[] originalSet) {


        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> ret = new HashSet<Set<TypeOfSet>>();
        ret.add(originalSet);
        if (originalSet.isEmpty()) {
            return ret;
        }
        Iterator<TypeOfSet> it = originalSet.iterator();
        while (it.hasNext()) {
            Set<TypeOfSet> tmp = new HashSet<TypeOfSet>(originalSet);   //create a copy of current set
            tmp.remove(it.next());              //remove current element from copy set
            ret.add(tmp);                       //add the remaining set to result
            //recursively find subsets of copy set
        }
        return ret;
    }






    

    /**
     * @return `originalSet`
     *
     *
     */
    public Set<TypeOfSet> getOriginalSet()

    {
        return originalSet;
    }
}



