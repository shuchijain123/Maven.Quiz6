package rocks.zipcode.io.objectorientation;

public class Television {
    public void turnOn() {






    }

    TVChannel mychannel=null;

    public void setChannel(Integer channel) {

       mychannel = TVChannel.getByOrdinal(channel);

        throw new IllegalStateException();



    }

    public TVChannel getChannel()

    {
        return mychannel;
    }
}
