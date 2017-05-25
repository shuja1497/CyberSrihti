
package p2_vaio.jiit;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by mxn on 2016/12/13.
 * MenuListFragment
 */

public class MenuListFragment extends Fragment {

    private ImageView ivMenuUserProfilePhoto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container,
                false);
        //ivMenuUserProfilePhoto = (ImageView) view.findViewById(R.id.ivMenuUserProfilePhoto);
        NavigationView vNavigation = (NavigationView) view.findViewById(R.id.vNavigation);
        vNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                if(menuItem.getTitle().toString().equalsIgnoreCase("Events")){
                    startActivity(new Intent(getActivity() , Event.class));
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();

                }else if(menuItem.getTitle().toString().equalsIgnoreCase("Registeration")){
                    startActivity(new Intent(getActivity() , registration.class));
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                }
                else if(menuItem.getTitle().toString().equalsIgnoreCase("Fb Page")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    Uri uri = Uri.parse("https://www.facebook.com/cybersrishti.jiit/");
                    Intent i4= new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i4);
                } else if(menuItem.getTitle().toString().equalsIgnoreCase("Reach Us")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getActivity() , MapsActivity.class));
                }
                else if(menuItem.getTitle().toString().equalsIgnoreCase("About CyberSrishti")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getActivity() , AboutUs.class));
                }
                else if(menuItem.getTitle().toString().equalsIgnoreCase("Contact Us")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getActivity() , Contact_us.class));
                }

                else if(menuItem.getTitle().toString().equalsIgnoreCase("Accommodation")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getActivity() , Accomodationform.class));
                }
                else if(menuItem.getTitle().toString().equalsIgnoreCase("Date And Time")){
                    Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getActivity() , sustainability.class));
                }
                return false;
            }
        }) ;
     //   setupHeader();
        return  view ;
    }

}
