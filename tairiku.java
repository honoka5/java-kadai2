import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class tairiku {
    
    public static final String[] COUNTRY_STRINGS ={
        "マレーシア","インドネシア","タイ","カンボジア","ラオス","オーストラリア",
        "フィリピン","香港","マカオ","インド","","","","","","","",

    };
    URL url =new URL("http://services.bluekai.com/Services/WS/audiences");

    HttpURLConnection con =(HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");

    con.connect();

    

}
