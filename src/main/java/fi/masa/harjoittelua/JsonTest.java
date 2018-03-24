package fi.masa.harjoittelua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {

//    jsonArray.getJSONArray(0).length()
    public static List<String> jsonResponses = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        JSONObject json = readJson();
        JSONArray jsonArray = json.getJSONArray("Markets");
        for (int i = 0; i < jsonArray.getJSONArray(0).length(); i++) {
            System.out.println(jsonArray.getJSONArray(0).getJSONObject(i));
        }
            
    }

    public static JSONObject readJson() throws IOException {

        String url = "https://www.worldcoinindex.com/apiservice/getmarkets?key=u5XPPRZvobkxfknm0ss03rs40hPX5t&fiat=btc";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        // add request header
        con.setRequestProperty("User-Agent", "Chrome/<Chrome Rev>");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return new JSONObject(response.toString());
    }
}
