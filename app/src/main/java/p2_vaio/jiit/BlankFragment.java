package p2_vaio.jiit;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends android.support.v4.app.Fragment {

    private RecyclerView rv;
    RecyclerView.Adapter adapter;

    RecyclerView.LayoutManager layoutManager;
    ArrayList<cardview> evenList = new ArrayList<cardview>();

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank,container,false);
        //events(view);
        TextView tv1 = (TextView) view.findViewById(R.id.texthack);
        tv1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),hackathon.class);
                startActivity(i);
            }
        }));
        TextView tv2 = (TextView) view.findViewById(R.id.textexecute);
        tv2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),execute.class);
                startActivity(i);
            }
        }));

        TextView tv3 = (TextView) view.findViewById(R.id.textdebate);
        tv3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),debate.class);
                startActivity(i);
            }
        }));
        TextView tv4 = (TextView) view.findViewById(R.id.textquiz);
        tv4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),automation.class);
                startActivity(i);
            }
        }));
        TextView tv5 = (TextView) view.findViewById(R.id.textcircuit);
        tv5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),circuit.class);
                startActivity(i);
            }
        }));
        TextView tv6 = (TextView) view.findViewById(R.id.textstartup);
        tv6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),startup.class);
                startActivity(i);
            }
        }));
        TextView tv7 = (TextView) view.findViewById(R.id.textdebugging);
        tv7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),debug.class);
                startActivity(i);
            }
        }));
        TextView tv8 = (TextView) view.findViewById(R.id.textrobot);
        tv8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),jpl.class);
                startActivity(i);
            }
        }));
        TextView tv9 = (TextView) view.findViewById(R.id.textpaper);
        tv9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),paper.class);
                startActivity(i);
            }
        }));
 /*       TextView tv10 = (TextView) view.findViewById(R.id.textposter);
        tv10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),photoshop.class);
                startActivity(i);
            }
        }));*/
        TextView tv11 = (TextView) view.findViewById(R.id.textcreative);
        tv11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),creative.class);
                startActivity(i);
            }
        }));
        TextView tv12 = (TextView) view.findViewById(R.id.textpro);
        tv12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),project.class);
                startActivity(i);
            }
        }));
/*        TextView tv13 = (TextView) view.findViewById(R.id.textbio);
        tv13.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),bio.class);
                startActivity(i);
            }
        }));*/
       TextView tv14 = (TextView) view.findViewById(R.id.texttechnical);
        tv14.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),codeofcodons.class);
                startActivity(i);
            }
        }));
      TextView tv15 = (TextView) view.findViewById(R.id.textmul);
        tv15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),hydrophilic.class);
                startActivity(i);
            }
        }));
        TextView tv16 = (TextView) view.findViewById(R.id.textscavenger);
        tv16.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(),develop.class);
                startActivity(i);
            }
        }));



        ImageButton b1 =(ImageButton) view.findViewById(R.id.alarmButton1);
        final ImageView im1 = (ImageView)view.findViewById(R.id.ImageView3);

        SharedPreferences savedPrefs=  getActivity().getPreferences(Context.MODE_PRIVATE);
        final int [] saved = {
                savedPrefs.getInt("option1", 0),savedPrefs.getInt("option2", 0),savedPrefs.getInt("option3", 0),
                savedPrefs.getInt("option4", 0), savedPrefs.getInt("option5", 0),savedPrefs.getInt("option6", 0),
                savedPrefs.getInt("option7", 0), savedPrefs.getInt("option8", 0), savedPrefs.getInt("option9", 0),
                savedPrefs.getInt("option10", 0),savedPrefs.getInt("option11", 0),savedPrefs.getInt("option12", 0),
                savedPrefs.getInt("option13", 0),savedPrefs.getInt("option14", 0),savedPrefs.getInt("option15", 0),
                savedPrefs.getInt("option16", 0)
        };


        if(saved[0] ==0)
            im1.setVisibility(INVISIBLE);
        else
            im1.setVisibility(VISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(im1.getVisibility()== INVISIBLE)
                {
                    im1.setVisibility(VISIBLE);
                    saved[0] =1;
                }
                else if(im1.getVisibility()== VISIBLE)
                {
                    im1.setVisibility(INVISIBLE);
                    saved[0] =0;
                }

                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option1", saved[0]);
                prefEditor.apply();

            }
        });

        ImageButton b2 =(ImageButton) view.findViewById(R.id.alarmButton2);
        final ImageView im2= (ImageView)view.findViewById(R.id.imageView4);
        //SharedPreferences savedPrefs=  getActivity().getPreferences(Context.MODE_PRIVATE);
        //final int [] saved = {savedPrefs.getInt("option2", 0)};
        if(saved[1] ==0)
            im2.setVisibility(INVISIBLE);
        else
            im2.setVisibility(VISIBLE);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im2.getVisibility()== INVISIBLE)
                {
                    im2.setVisibility(VISIBLE);
                    saved[1]=1;


                }
                else if(im2.getVisibility()== VISIBLE)
                {
                    im2.setVisibility(INVISIBLE);
                    saved[1] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option2", saved[1]);
                prefEditor.apply();
            }
        });

        ImageButton b3 =(ImageButton) view.findViewById(R.id.alarmButton3);
        final ImageView im3 = (ImageView)view.findViewById(R.id.imageView5);

        if(saved[2] ==0)
            im3.setVisibility(INVISIBLE);
        else
            im3.setVisibility(VISIBLE);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im3.getVisibility()== INVISIBLE)
                {
                    im3.setVisibility(VISIBLE);
                    saved[2]=1;

                }
                else if(im3.getVisibility()== VISIBLE)
                {
                    im3.setVisibility(INVISIBLE);
                    saved[2] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option3", saved[2]);
                prefEditor.apply();
            }
        });


        ImageButton b4 =(ImageButton) view.findViewById(R.id.alarmButton4);
        final ImageView im4 = (ImageView)view.findViewById(R.id.imageView6);

        if(saved[3] ==0)
            im4.setVisibility(INVISIBLE);
        else
            im4.setVisibility(VISIBLE);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im4.getVisibility()== INVISIBLE)
                {
                    im4.setVisibility(VISIBLE);
                    saved[3]=1;

                }
                else if(im4.getVisibility()== VISIBLE)
                {
                    im4.setVisibility(INVISIBLE);
                    saved[3] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option4", saved[3]);
                prefEditor.apply();
            }
        });


        ImageButton b5 =(ImageButton) view.findViewById(R.id.alarmButton5);
        final ImageView im5 = (ImageView)view.findViewById(R.id.imageView7);

        if(saved[4] ==0)
            im5.setVisibility(INVISIBLE);
        else
            im5.setVisibility(VISIBLE);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im5.getVisibility()== INVISIBLE)
                {
                    im5.setVisibility(VISIBLE);
                    saved[4]=1;

                }
                else if(im5.getVisibility()== VISIBLE)
                {
                    im5.setVisibility(INVISIBLE);
                    saved[4] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option5", saved[4]);
                prefEditor.apply();
            }
        });


        ImageButton b6 =(ImageButton) view.findViewById(R.id.alarmButton6);
        final ImageView im6 = (ImageView)view.findViewById(R.id.imageView8);

        if(saved[5] ==0)
            im6.setVisibility(INVISIBLE);
        else
            im6.setVisibility(VISIBLE);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im6.getVisibility()== INVISIBLE)
                {
                    im6.setVisibility(VISIBLE);
                    saved[5]=1;

                }
                else if(im6.getVisibility()== VISIBLE)
                {
                    im6.setVisibility(INVISIBLE);
                    saved[5] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option6", saved[5]);
                prefEditor.apply();
            }
        });


        ImageButton b7 =(ImageButton) view.findViewById(R.id.alarmButton7);
        final ImageView im7 = (ImageView)view.findViewById(R.id.imageView9);

        if(saved[6] ==0)
            im7.setVisibility(INVISIBLE);
        else
            im7.setVisibility(VISIBLE);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im7.getVisibility()== INVISIBLE)
                {
                    im7.setVisibility(VISIBLE);
                    saved[6]=1;

                }
                else if(im7.getVisibility()== VISIBLE)
                {
                    im7.setVisibility(INVISIBLE);
                    saved[6] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option7", saved[6]);
                prefEditor.apply();
            }
        });


        ImageButton b8 =(ImageButton) view.findViewById(R.id.alarmButton8);
        final ImageView im8 = (ImageView)view.findViewById(R.id.imageView10);

        if(saved[7] ==0)
            im8.setVisibility(INVISIBLE);
        else
            im8.setVisibility(VISIBLE);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im8.getVisibility()== INVISIBLE)
                {
                    im8.setVisibility(VISIBLE);
                    saved[7]=1;

                }
                else if(im8.getVisibility()== VISIBLE)
                {
                    im8.setVisibility(INVISIBLE);
                    saved[7] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option8", saved[7]);
                prefEditor.apply();
            }
        });


     /*   ImageButton b9 =(ImageButton) view.findViewById(R.id.alarmButton9);
        final ImageView im9 = (ImageView)view.findViewById(R.id.imageView11);

        if(saved[8] ==0)
            im9.setVisibility(INVISIBLE);
        else
            im9.setVisibility(VISIBLE);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im9.getVisibility()== INVISIBLE)
                {
                    im9.setVisibility(VISIBLE);
                    saved[8]=1;

                }
                else if(im9.getVisibility()== VISIBLE)
                {
                    im9.setVisibility(INVISIBLE);
                    saved[8] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option9", saved[8]);
                prefEditor.apply();
            }
        });

*/
        ImageButton b10 =(ImageButton) view.findViewById(R.id.alarmButton10);
        final ImageView im10 = (ImageView)view.findViewById(R.id.imageView12);

        if(saved[9] ==0)
            im10.setVisibility(INVISIBLE);
        else
            im10.setVisibility(VISIBLE);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im10.getVisibility()== INVISIBLE)
                {
                    im10.setVisibility(VISIBLE);
                    saved[9]=1;

                }
                else if(im10.getVisibility()== VISIBLE)
                {
                    im10.setVisibility(INVISIBLE);
                    saved[9]=0;

                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option10", saved[9]);
                prefEditor.apply();
            }
        });


        ImageButton b11 =(ImageButton) view.findViewById(R.id.alarmButton11);
        final ImageView im11 = (ImageView)view.findViewById(R.id.imageView13);

        if(saved[10] ==0)
            im11.setVisibility(INVISIBLE);
        else
            im11.setVisibility(VISIBLE);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im11.getVisibility()== INVISIBLE)
                {
                    im11.setVisibility(VISIBLE);
                    saved[10]=1;

                }
                else if(im11.getVisibility()== VISIBLE)
                {
                    im11.setVisibility(INVISIBLE);
                    saved[10] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option11", saved[10]);
                prefEditor.apply();
            }
        });


        ImageButton b12 =(ImageButton) view.findViewById(R.id.alarmButton12);
        final ImageView im12 = (ImageView)view.findViewById(R.id.imageView14);

        if(saved[11] ==0)
            im12.setVisibility(INVISIBLE);
        else
            im12.setVisibility(VISIBLE);

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im12.getVisibility()== INVISIBLE)
                {
                    im12.setVisibility(VISIBLE);
                    saved[11]=1;

                }
                else if(im12.getVisibility()== VISIBLE)
                {
                    im12.setVisibility(INVISIBLE);
                    saved[11] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option12", saved[11]);
                prefEditor.apply();
            }
        });


        ImageButton b13 =(ImageButton) view.findViewById(R.id.alarmButton13);
        final ImageView im13 = (ImageView)view.findViewById(R.id.imageView15);

        if(saved[12] ==0)
            im13.setVisibility(INVISIBLE);
        else
            im13.setVisibility(VISIBLE);

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im13.getVisibility()== INVISIBLE)
                {
                    im13.setVisibility(VISIBLE);
                    saved[12]=1;

                }
                else if(im13.getVisibility()== VISIBLE)
                {
                    im13.setVisibility(INVISIBLE);
                    saved[12] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option13", saved[12]);
                prefEditor.apply();
            }
        });


     /*   ImageButton b14 =(ImageButton) view.findViewById(R.id.alarmButton14);
        final ImageView im14 = (ImageView)view.findViewById(R.id.imageView16);

        if(saved[13] ==0)
            im14.setVisibility(INVISIBLE);
        else
            im14.setVisibility(VISIBLE);

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im14.getVisibility()== INVISIBLE)
                {
                    im14.setVisibility(VISIBLE);
                    saved[13]=1;

                }
                else if(im14.getVisibility()== VISIBLE)
                {
                    im14.setVisibility(INVISIBLE);
                    saved[13] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option14", saved[13]);
                prefEditor.apply();
            }
        });
*/

        ImageButton b15 =(ImageButton) view.findViewById(R.id.alarmButton15);
        final ImageView im15 = (ImageView)view.findViewById(R.id.imageView17);

        if(saved[14] ==0)
            im15.setVisibility(INVISIBLE);
        else
            im15.setVisibility(VISIBLE);

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im15.getVisibility()== INVISIBLE)
                {
                    im15.setVisibility(VISIBLE);
                    saved[14]=1;
                }
                else if(im15.getVisibility()== VISIBLE)
                {
                    im15.setVisibility(INVISIBLE);
                    saved[14] =0;
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option15", saved[14]);
                prefEditor.apply();
            }
        });


        ImageButton b16 =(ImageButton) view.findViewById(R.id.alarmButton16);
        final ImageView im16 = (ImageView)view.findViewById(R.id.imageView18);

        if(saved[15] ==0)
            im16.setVisibility(INVISIBLE);
        else
            im16.setVisibility(VISIBLE);

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(im16.getVisibility()== INVISIBLE)
                {
                    im16.setVisibility(VISIBLE);
                    saved[15]=1;
                }
                else if(im16.getVisibility()== VISIBLE)
                {
                    saved[15]=0;
                    im16.setVisibility(INVISIBLE);
                }
                SharedPreferences sPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor prefEditor = sPref.edit();
                prefEditor.putInt("option16", saved[15]);
                prefEditor.apply();
            }
        });


        return view ;
    }


 /*   private void events(View view) {
/*        int[] posters = new int[]{
                R.drawable.f1,
                R.drawable.f2,
                R.drawable.f3,
                R.drawable.f4,
                R.drawable.f5,
                R.drawable.gd1,
                R.drawable.f4,
                R.drawable.f5,
                R.drawable.f2,
                R.drawable.f1,
                R.drawable.f2};*/

//        String[] events=new String[]{"HACKATHON","EXECUTE","ROBOTICS","",""};

        /*cardview cv = new cardview("HACKATHON",posters[0]);
        evenList.add(cv);
         cv = new cardview("HACKATHON",posters[1]);
        evenList.add(cv);
         cv = new cardview("HACKATHON",posters[2]);
        evenList.add(cv);
         cv = new cardview("HACKATHON",posters[3]);
        evenList.add(cv);
         cv = new cardview("EXECUTE",posters[4]);
        evenList.add(cv);
         cv = new cardview("EXECUTE",posters[5]);
        evenList.add(cv);
         cv = new cardview("EXECUTE",posters[6]);
        evenList.add(cv);
         cv = new cardview("ROBOTICS",posters[7]);
        evenList.add(cv);
        cv = new cardview("ROBOTICS",posters[0]);
        evenList.add(cv);
        cv = new cardview("ROBOTICSe",posters[4]);
        evenList.add(cv);
        cv = new cardview("ROBOTICS",posters[8]);
        evenList.add(cv);
        cv = new cardview("ROBOTICS",posters[1]);
        evenList.add(cv);
        cv = new cardview("ROBOTICS",posters[3]);
        evenList.add(cv);
        cv = new cardview("ROBOTICS",posters[4]);
        evenList.add(cv);*/

       /* cardview cv = new cardview("HACKATHON");
        evenList.add(cv);
        cv = new cardview("HACKATHON");
        evenList.add(cv);
        cv = new cardview("EXECUTE");
        evenList.add(cv);
        cv = new cardview("DEBATE");
        evenList.add(cv);
        cv = new cardview("QUIZ");
        evenList.add(cv);
        cv = new cardview("CIRCUITIX");
        evenList.add(cv);
        cv = new cardview("START-UP");
        evenList.add(cv);
        cv = new cardview("DEBUGGING");
        evenList.add(cv);
        cv = new cardview("ROBOTICS CHALLENGE");
        evenList.add(cv);
        cv = new cardview("PAPER PRESENTATION");
        evenList.add(cv);
        cv = new cardview("POSTER MAKING");
        evenList.add(cv);
        cv = new cardview("CREATIVE DESIGN");
        evenList.add(cv);
        cv = new cardview("PRJECT EXHIBITION");
        evenList.add(cv);
        cv = new cardview("BIO-INFORMATICS");
        evenList.add(cv);
        cv = new cardview("TECHNICAL SUMMIT");
        evenList.add(cv);
        cv = new cardview("MULTIMEDIA");
        evenList.add(cv);
        cv = new cardview("SCAVENGER HUNT");
        evenList.add(cv);

      rv = (RecyclerView)view.findViewById(R.id.recyclerview);
       layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
       // layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),2);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true); //improves the performance of recycler view
        // rv.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        rv.setItemAnimator(new DefaultItemAnimator());
        adapter = new cardviewadapter(evenList,getActivity().getApplicationContext());
        rv.setAdapter(adapter);



        //adapter.notifyDataSetChanged();
    }*/





}
