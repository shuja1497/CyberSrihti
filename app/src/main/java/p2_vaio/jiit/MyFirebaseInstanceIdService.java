package p2_vaio.jiit;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Bhavyam Goyal on 06-03-2017.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private  static  final String REG_TOKEN= "REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recent_token = FirebaseInstanceId.getInstance().getToken();

    }
}
