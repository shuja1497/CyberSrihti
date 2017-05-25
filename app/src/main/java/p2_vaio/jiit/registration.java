package p2_vaio.jiit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class registration extends AppCompatActivity {

    String[] eventList;
    boolean[] checkedItems;
    EditText m1,m2,m3,m4,email,phone,college_name,year,team;
    ArrayAdapter<CharSequence> adapter;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    Spinner spinner;
    TextView event ;
    Button submit;
    int no=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        Bundle get_event_name= getIntent().getExtras();
        String event_name=get_event_name.getString("event_name");

        event=(TextView)findViewById(R.id.event_name);
        event.setText(event_name);

        m2=(EditText)findViewById(R.id.member2);
        email=(EditText)findViewById(R.id.Name1);
        year=(EditText)findViewById(R.id.Enrollment1);
        phone=(EditText)findViewById(R.id.Phone);
        college_name=(EditText)findViewById(R.id.college);
        team=(EditText)findViewById(R.id.team);
        m1=(EditText)findViewById(R.id.Name);
        m3=(EditText)findViewById(R.id.member3);
        m4=(EditText)findViewById(R.id.member4);
        submit=(Button)findViewById(R.id.submit);
        spinner=(Spinner)findViewById(R.id.spinner);
        eventList = getResources().getStringArray(R.array.event_list);
        checkedItems = new boolean[eventList.length];
        adapter=ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        m2.setVisibility(View.INVISIBLE);
        m3.setVisibility(View.INVISIBLE);
        m4.setVisibility(View.INVISIBLE);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinner.getSelectedItem().toString().equalsIgnoreCase("Two")) {
                    no=2;
                    m2.setVisibility(View.VISIBLE);
                    m3.setVisibility(View.INVISIBLE);
                    m4.setVisibility(View.INVISIBLE);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("Three")) {
                    no=3;
                    m2.setVisibility(View.VISIBLE);
                    m3.setVisibility(View.VISIBLE);
                    m4.setVisibility(View.INVISIBLE);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("Four")) {
                    no=4;
                    m2.setVisibility(View.VISIBLE);
                    m3.setVisibility(View.VISIBLE);
                    m4.setVisibility(View.VISIBLE);
                } else if (spinner.getSelectedItem().toString().equalsIgnoreCase("One")) {
                    no=1;
                    m2.setVisibility(View.INVISIBLE);
                    m3.setVisibility(View.INVISIBLE);
                    m4.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

                });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                            } else {
                                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(registration.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                SendRegisterData registerRequest = new SendRegisterData(no,college_name.getText().toString(),team.getText().toString(), m1.getText().toString(),email.getText().toString(),phone.getText().toString(),year.getText().toString(),m2.getText().toString(),m3.getText().toString(),m4.getText().toString(), responseListener);
                RequestQueue queue = Volley.newRequestQueue(registration.this);
                queue.add(registerRequest);


            }
        });




    }
}
