package p2_vaio.jiit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FBpage extends AppCompatActivity {




    private static List<Person> persons_list=new ArrayList<Person>();
    private RecyclerView rv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb_base);

  //  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        persons_list.add(new Person("aPPP", "956", "a@gm", R.drawable.gdg));
      ////  persons_list.add(new Person("aynmnm", "956", "a@gm", R.drawable.gd1));
       // persons_list.add(new Person("a", "956", "a@gmhjh", R.drawable.gdg));
      //  persons_list.add(new Person("aynj", "95676", "a@gm", R.drawable.gd1));
      //  persons_list.add(new Person("ay", "956", "a@gm", R.drawable.gdg));

       // View rootView = inflater.inflate(R.layout.fb_base, null);
        //REFERENCE
        rv = (RecyclerView) findViewById(R.id.base_RV);
        //LAYOUT MANAGER

        rv.setLayoutManager(new LinearLayoutManager(this));
        //rv.setAdapter(new MyAdapter(getActivity(),electricians_names,electricians_numbers,electricians_rating,electricians_images));
        rv.setAdapter(new MyAdapter_fbcard(this, persons_list));


       // return rootView;
    }


   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbpage);
    }*/

    public void addPerson(Person e)
    {
        this.persons_list.add(e);



    }

    public static List<Person> getPersons_lists() {
        return persons_list;
    }
}
