package p2_vaio.jiit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Event extends AppCompatActivity implements View.OnClickListener{

    ImageButton Ev1,Ev2,Ev3,Ev4,Ev5,Ev6,Ev7,Ev8,Ev9,Ev10,Ev11,Ev12,Ev13, Ev14,Ev15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);



        Ev1= (ImageButton)findViewById(R.id.ev1);
        // Ev2= (ImageButton)findViewById(R.id.ev2);
        Ev3= (ImageButton)findViewById(R.id.ev3);
        Ev4= (ImageButton)findViewById(R.id.ev4);
        Ev5= (ImageButton)findViewById(R.id.ev5);
        Ev6= (ImageButton)findViewById(R.id.ev6);
        Ev7= (ImageButton)findViewById(R.id.ev7);
        Ev8= (ImageButton)findViewById(R.id.ev8);
        Ev9= (ImageButton)findViewById(R.id.ev9);
        Ev10= (ImageButton)findViewById(R.id.ev10);
        Ev11= (ImageButton)findViewById(R.id.ev11);
        Ev12= (ImageButton)findViewById(R.id.ev12);
        Ev13= (ImageButton)findViewById(R.id.ev13);
        Ev14= (ImageButton)findViewById(R.id.ev14);
        Ev15= (ImageButton)findViewById(R.id.ev15);

        Ev1.setOnClickListener(this);
        //Ev2.setOnClickListener(this);
        Ev3.setOnClickListener(this);
        Ev4.setOnClickListener(this);
        Ev5.setOnClickListener(this);
        Ev6.setOnClickListener(this);
        Ev7.setOnClickListener(this);
        Ev8.setOnClickListener(this);
        Ev9.setOnClickListener(this);
        Ev10.setOnClickListener(this);
        Ev11.setOnClickListener(this);
        Ev12.setOnClickListener(this);
        Ev13.setOnClickListener(this);
        Ev14.setOnClickListener(this);
        Ev15.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view==Ev1)
        {
            startActivity(new Intent(this , automation.class));

        }
        else if(view==Ev3)
        {
            startActivity(new Intent(this , codeofcodons.class));

        }
        else if(view==Ev4)
        {
            startActivity(new Intent(this , circuit.class));

        }
        else if(view==Ev5)
        {
            startActivity(new Intent(this , creative.class));

        }
        else if(view==Ev6)
        {
            startActivity(new Intent(this , debate.class));

        }
        else if(view==Ev7)
        {
            startActivity(new Intent(this , debug.class));

        }
        else if(view==Ev8)
        {
            startActivity(new Intent(this , execute.class));

        }
        else if(view==Ev9)
        {
            startActivity(new Intent(this , hydrophilic.class));

        }
        else if(view==Ev10)
        {
            startActivity(new Intent(this , hackathon.class));

        }
        else if(view==Ev11)
        {
            startActivity(new Intent(this , jpl.class));

        } else if(view==Ev12)
        {
            startActivity(new Intent(this , develop.class));

        }
        else if(view==Ev13)
        {
            startActivity(new Intent(this , paper.class));

        }
        else if(view==Ev14)
        {
            startActivity(new Intent(this , startup.class));

        }
        else if(view==Ev15)
        {
            startActivity(new Intent(this , project.class));

        }

    }
}
