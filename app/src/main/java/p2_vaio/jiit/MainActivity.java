package p2_vaio.jiit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private FlowingDrawer mDrawer;
   // ViewFlipper vf ;
    ViewPager vp;
    Animation fade_in,fade_out;
    Toolbar tb;
    LinearLayout cm;
    TabLayout tabLayout;
    RelativeLayout rl;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tb = (Toolbar) findViewById(R.id.bar);
        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
        mDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);
        setupToolbar();
        setupMenu();

        setSupportActionBar(tb);
        tabLayout = (TabLayout) findViewById(R.id.tl);
        rl = (RelativeLayout) findViewById(R.id.rl);
        cm = (LinearLayout) findViewById(R.id.content_main);


        vp = (ViewPager) findViewById(R.id.viewpager);
        swipeadapter sa = new swipeadapter(getSupportFragmentManager());
        sa.addFragments(new BlankFragment(), "Events");
        //sa.addFragments(new BlankFragment3(), "Workshop");

        //sa.addFragments(new BlankFragment4(), "Lectures");
        sa.addFragments(new BlankFragment2(), "FB Page");
        vp.setAdapter(sa);
        tabLayout.setupWithViewPager(vp);
        tabLayout.getTabAt(0).setIcon(R.drawable.rena48);
        tabLayout.getTabAt(1).setIcon(R.drawable.face);
       // tabLayout.getTabAt(1).setIcon(R.drawable.raining48);
        //tabLayout.getTabAt(2).setIcon(R.drawable.lassroom48);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    //cm.setBackgroundResource(R.drawable.blue);
                    cm.setBackgroundResource(R.drawable.tab_brown);
                    // if you want the second page, for example
                    //Your code here
                }else if (position == 1) {
                    cm.setBackgroundColor(getResources().getColor(R.color.indigo900));
                    //rl.setBackgroundResource(R.drawable.tab_brown);
                    // if you want the second page, for example
                    //Your code here
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
      /*vf  = (ViewFlipper)findViewById(R.id.viewflipper);

        fade_in = AnimationUtils.loadAnimation(this , android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this , android.R.anim.fade_out);

        vf.setInAnimation(fade_in);
        vf.setOutAnimation(fade_out);

        vf.setAutoStart(true);
        vf.setFlipInterval(2500);

        vf.startFlipping();*/




        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(i==0) {
                    rl.setBackgroundColor(getResources().getColor(R.color.red800));
                    i++;
                }
                else if(i==1) {
                    rl.setBackgroundColor(getResources().getColor(R.color.green800));
                    i++;
                }
                else if(i==2) {
                    rl.setBackgroundColor(getResources().getColor(R.color.brown800));
                    i=0;
                }
                Snackbar.make(view, "Set Reminder", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                /*Intent i= new Intent();
                ComponentName cn =new ComponentName("com.android.calender","com.android.calender.LaunchActivity");
                i.setComponent(cn);
                startActivity(i);

            }
        });*/
    }

    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.bar);
        setSupportActionBar(toolbar);
    }



    private void setupMenu() {
        FragmentManager fm = getSupportFragmentManager();
        MenuListFragment mMenuFragment = (MenuListFragment) fm.findFragmentById(R.id.id_container_menu);
        if (mMenuFragment == null) {
            mMenuFragment = new MenuListFragment();
            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment).commit();
        }}





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.event) {
           // finish();
            startActivity(new Intent(this , Event.class));
            // Handle the camera action
        }
        else if (id == R.id.FBpage) {
            // finish();
            startActivity(new Intent(this , FBpage.class));
            // Handle the camera action
        }
        else if (id == R.id.lectures) {
            // finish();
            startActivity(new Intent(this , Event.class));
            // Handle the camera action
        }
        else if (id == R.id.workshops) {
            // finish();
            startActivity(new Intent(this , Event.class));
            // Handle the camera action
        }
        else if (id == R.id.accomodation) {
            // finish();
            startActivity(new Intent(this , Event.class));
            // Handle the camera action
        }
        else if (id == R.id.menu_reach) {
            // finish();
            startActivity(new Intent(this , MapsActivity.class));
            // Handle the camera action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerlayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
