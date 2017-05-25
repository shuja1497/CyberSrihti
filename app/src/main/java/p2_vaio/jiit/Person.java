package p2_vaio.jiit;

/**
 * Created by Ayush on 04/03/2017.
 */

public class Person {


    private String name;
    //private String number;
    //private String email;
    private Integer image;

    public Person(String name,Integer image)
    {

        this.name=name;
      //  this.number=number;
      //  this.email=email;
        this.image=image;


    }


    public String getName()
    {
        return this.name;
    }

 public Integer getImageId()
    {
        return this.image;
    }
  /*
    public String getNumber()
    {
        return this.number;
    }
    public String getEmail()
    {
        return this.number;
    }
*/


}
