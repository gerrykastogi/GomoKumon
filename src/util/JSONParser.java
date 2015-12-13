package util;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by elvan_owen on 11/29/15.
 */
public class JSONParser {
    public static JSONArray parseArray(String body){
        JSONArray arrays = null;

        try {
            arrays =  new JSONArray(body);
        } catch (Exception e){
            System.out.println(e);
        }

        return arrays;
    }

//    Check if success
    public static boolean success(String body){
        JSONObject response = null;

        try {
            response =  new JSONObject(body);
        } catch (Exception e){
            System.out.println(e);
        }

        boolean success = false;

        try {
            if (response.getString("status").equals("OK")){
                success = true;
            } else {
                success = false;
            }
        } catch(Exception e){
            System.out.println(e);
        }

        return success;
    }
}
