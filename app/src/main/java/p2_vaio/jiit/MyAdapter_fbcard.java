package p2_vaio.jiit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush on 04/03/2017.
 */

public class MyAdapter_fbcard  extends RecyclerView.Adapter<MyAdapter_fbcard.RecyclerVH> {
    Context c;
    private List <Person> persons_list=new ArrayList<>();
    // public MyAdapter(Context c, String[] servicemen_names,String[] servicemen_number,Float[] servicemen_rating,Integer[]servicemen_images) {
    public MyAdapter_fbcard(Context c,List <Person> l ) {

        this.c = c;
persons_list.addAll(l);

    }
    public RecyclerVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model_fbcard,parent,false);
        return new RecyclerVH(v);
    }
    @Override
    public void onBindViewHolder(RecyclerVH holder, int position) {

      Person con=persons_list.get(position);
        //holder.nameTxt.setMovementMethod(new ScrollingMovementMethod());
        holder.nameTxt.setText(con.getName());

        //holder.noTxt.setText(con.getNumber());
        holder.img.setImageResource(con.getImageId());
       // holder.email.setText(( con.getEmail()));


        //holder.book_b.setText(servicemen_bu[position]);
    }
    @Override
    public int getItemCount() {
        return persons_list.size();
    }
    /*
    VIEWHOLDER CLASS
     */
    public class RecyclerVH extends RecyclerView.ViewHolder  implements View.OnClickListener
    {

        TextView nameTxt;
        TextView noTxt;
        ImageView img;
        TextView email;
        public RecyclerVH(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
             nameTxt= (TextView) itemView.findViewById(R.id.persons_name);
            // noTxt=(TextView) itemView.findViewById(R.id.persons_mobile);
             img=(ImageView)itemView.findViewById(R.id.persons_image);
             //email=(TextView) itemView.findViewById(R.id.persons_email);
            //book_b=(Button) itemView.findViewById(R.id.book_rqst);
        }


        @Override
        public void onClick(View view) {



        }
    }
}