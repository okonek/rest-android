package org.jbossoutreach.restandroid.backend;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by murad on 11/11/17.
 */

public class RestClient {

    public static ResponseService responseService;

    public RestClient() {

        Gson gson = new GsonBuilder().create();

        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://google.com/")
                .client(okHttpBuilder.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        responseService = retrofit.create(ResponseService.class);

    }

    public ResponseService getResponseService() {
        return responseService;
    }
}