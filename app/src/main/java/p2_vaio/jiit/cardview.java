package p2_vaio.jiit;

/**
 * Created by shuja reshi on 1/19/2017.
 */

public class cardview {

    private int poster;
    private String event;

    public cardview(){

    }

    /*public cardview(String event, int photoshop){
        this.event=event;
        this.photoshop=photoshop;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setPoster(int photoshop) {
        this.photoshop = photoshop;
    }



    public int getPoster() {
        return photoshop;
    }*/
    public String getEvent() {

        return event;
    }

    public cardview(String event){this.event= event;}

    public void setEvent(String event) {
        this.event = event;
    }

}

