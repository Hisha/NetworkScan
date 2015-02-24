package com.HishaTech.android.networkscan.network;

import com.HishaTech.android.networkscan.json.JsonConstants;
import com.HishaTech.android.networkscan.json.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by smithkev on 2/24/2015.
 */
public class ExternalIP {

    public static String getIP() {

        String externalIP = "";

        try {
            JsonParser jParser = new JsonParser();
            JSONObject jObject = jParser.getJSONFromUrl(JsonConstants
                    .json_BaseURL + JsonConstants.json_ipURL);

            externalIP = jObject.getString(JsonConstants.json_ipGroup);

        } catch (JSONException e) {
            externalIP = JsonConstants.json_ipFail;
        }

        return externalIP;
    }
}
