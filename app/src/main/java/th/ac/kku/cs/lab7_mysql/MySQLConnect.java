package th.ac.kku.cs.lab7_mysql;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class MySQLConnect {

    private final Activity main;
    private List<String> list;
    private String URL="http://10.199.9.78/", GET_URL = "get_post.php",SENT_URL = "sent_post.php";

    public MySQLConnect() { main = null;}

    public MySQLConnect(Activity mainA){
        main = mainA;
        list = new ArrayList<String>();

    }

    public List<String> getData() {
        String url = URL + GET_URL;
        




        return list;
    }
}
