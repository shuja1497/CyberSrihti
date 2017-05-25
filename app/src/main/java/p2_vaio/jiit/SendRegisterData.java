package p2_vaio.jiit;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SendRegisterData extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "";
    private Map<String, String> params;

    public SendRegisterData(int no,String college_name,String team, String name, String email, String phone,String year,String name2,String name3,String name4, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("college_name", college_name);
        params.put("name", name );
        params.put("team", team );
        params.put("email", email);
        params.put("Phone_number", phone);
        params.put("year", year);
        if(no==2)
        {
            params.put("member2", name2);
        }else if(no==3){
            params.put("member2", name2);
            params.put("member3", name3);
        }else if(no==4){
            params.put("member2", name2);
            params.put("member3", name3);
            params.put("member4", name4);
        }
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

