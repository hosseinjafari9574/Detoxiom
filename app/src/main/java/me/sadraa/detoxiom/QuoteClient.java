package me.sadraa.detoxiom;

import android.support.v4.util.Pair;

import org.json.JSONObject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by sadra on 10/8/17.
 */

public interface QuoteClient {
    //Authentication in ghesarha.ir server using a rudimentary technic. you should send a key value in body.
    //and It doesn't work with hashMap or any key value object. Fortunately retrofit has a @Field method that do the job for us
    @FormUrlEncoded
    @POST("random_quote")
    Call<QuoteModel> getQuote(@Field("api_token") String api_token);

}