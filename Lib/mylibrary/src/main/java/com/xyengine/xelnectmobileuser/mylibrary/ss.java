package com.xyengine.xelnectmobileuser.mylibrary;

import android.util.Log;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by XelnectMobileUser on 3/3/2015.
 */
public class ss {
    public ss() {
        Log.e("test", "test");
    }
    public static void printData(){
        Log.e("test", "testee");Log.v("test", "Dfsssf");
        // These code snippets use an open-source library. http://unirest.io/java
        try {
            HttpResponse<String> response = Unirest.get("https://yoda.p.mashape.com/yoda?sentence=You+will+learn+how+to+speak+like+me+someday.++Oh+wait.")
                    .header("X-Mashape-Key", "wuy8RRVeaymsheipYP4cuiv3YKHTp1GtGIMjsnp2JsM73Qc0W6")
                    .header("Accept", "text/plain")
                    .asString();
            Log.v("test", response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }


    }
}
