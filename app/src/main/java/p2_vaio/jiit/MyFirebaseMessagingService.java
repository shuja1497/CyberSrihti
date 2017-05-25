package p2_vaio.jiit;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Bhavyam Goyal on 06-03-2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent=new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder noti=new NotificationCompat.Builder(this);
        noti.setContentTitle("CyberSrishti");
        noti.setContentText(remoteMessage.getNotification().getBody());
        noti.setAutoCancel(true);
        noti.setSmallIcon(R.drawable.logo);
        noti.setContentIntent(pendingIntent);
        NotificationManager notim=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notim.notify(0,noti.build());
    }
}
