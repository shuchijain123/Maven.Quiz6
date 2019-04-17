package rocks.zipcode.io.objectorientation;

import java.util.Arrays;
import java.util.function.Predicate;

public enum TVChannel {


    MSN (0),
    CNN (1),
    FOX (2),
    AE(3),
    MTV(4),
    BET(5),
    HBO(6),
    NBC(7),
    CBS(8)
    ;


    /**
     * @param ordinal; ordinal of the expected enumeration
     * @return enumeration with respective ordinal
     */


    int ordinal =0;

    TVChannel(int ordinal){

        this.ordinal=ordinal;
    }



    public Integer getordinal()

    {
        return ordinal;
    }
    public static TVChannel getByOrdinal(int ordinal) {

        TVChannel selectedChannel=null;




      if(ordinal==ordinal) {


        selectedChannel = TVChannel.values()[ordinal];
          return selectedChannel;

      }


  else

             throw new IllegalStateException();



}




    /**
     * @param name; name of the expected enumeration
     * @return enumeration with respective name
     */
    public static TVChannel getByName(String name) {
        return find(channel -> name.equals(channel.name()));
    }

    /**
     * @param predicate - clause to evaluate
     * @return the first channel which is applicable to the `predicate`
     */
    private static TVChannel find(Predicate<TVChannel> predicate) {
        return Arrays
                .stream(TVChannel.values())
                .filter(predicate)
                .findFirst()
                .get();
    }
}
