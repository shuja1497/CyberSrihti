package p2_vaio.jiit;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private static List<Person> persons_list=new ArrayList<Person>();
    private RecyclerView rv;
   // TextView load;
    String connectivity;
    public BlankFragment2() {
        // persons_list.add(new Person("ay", "956", "a@gm", R.drawable.gdg));
        // persons_list.add(new Person("aPPP", "956", "a@gm", R.drawable.gdg));
        // persons_list.add(new Person("aynmnm", "956", "a@gm", R.drawable.gd1));
        // persons_list.add(new Person("a", "956", "a@gmhjh", R.drawable.gdg));
        // persons_list.add(new Person("aynj", "95676", "a@gm", R.drawable.gd1));
        // persons_list.add(new Person("ay", "956", "a@gm", R.drawable.gdg));

        // Required empty public constructor
    }



   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.fb_base,null);
       //REFERENCE
       rv= (RecyclerView) rootView.findViewById(R.id.base_RV);
     //  load=(TextView)rootView.findViewById(R.id.loading);
      // load.setVisibility(View.VISIBLE);
       //LAYOUT MANAGER

       rv.setLayoutManager(new LinearLayoutManager(getActivity()));
       Timer t = new Timer();
//Set the schedule function and rate
       t.scheduleAtFixedRate(new TimerTask() {

                                 @Override
                                 public void run() {
                                     getdata();
                                 //    new GetDataTask().execute("http://192.168.43.31:3000/api/feed");

                                 }

                             },
//Set how long before to start calling the TimerTask (in milliseconds)
               0,
//Set the amount of time between each execution (in milliseconds)
               600000);



       //rv.setAdapter(new MyAdapter(getActivity(),electricians_names,electricians_numbers,electricians_rating,electricians_images));



       return rootView;
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
    public void addPerson_fromfrag(Person e)
    {
        this.persons_list.add(e);



    }


    public void saveData(String s){
        SharedPreferences loginData = getActivity().getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = loginData.edit();
        editor.putString("feeds", s);
        editor.apply();
    }

    public String getData(){
        SharedPreferences loginData = getActivity().getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
        String stat = loginData.getString("feeds", "");
        return stat;
    }
    String url="http://192.168.43.31:3000/api/feed";
    private void  getdata() {
        final RequestQueue requestQueue= Volley.newRequestQueue(getActivity());
        StringRequest stringRequest=new StringRequest(Request.Method.GET,url ,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        saveData(response);
                        //Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
                        try {
                            JSONArray array=new JSONArray(response);
                            for (int i=0;i<array.length();i++)
                            {
                                JSONObject object=array.getJSONObject(i);
                                //            persons_list.add(new Person(object.getString("details"),R.drawable.dog1,"null"));
                                persons_list.add(new Person(object.getString("message").toString(), R.drawable.logo));

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
//                    rv.setAdapter(new MyAdapter_Card(getActivity(),persons_list));

                    }
                },new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        Toast.makeText(getActivity(), "Check your internet connection", Toast.LENGTH_LONG).show();
                        try {
                            JSONArray array=new JSONArray(getData());
                            for (int i=0;i<array.length();i++)
                            {
                                JSONObject object=array.getJSONObject(i);
                                //            persons_list.add(new Person(object.getString("details"),R.drawable.dog1,"null"));
                                persons_list.add(new Person(object.getString("message").toString(), R.drawable.logo));

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
        requestQueue.add(stringRequest);

    }
   // public static List<Person> getPersons_lists_fromfrag() {
      //  return persons_list;
    }


