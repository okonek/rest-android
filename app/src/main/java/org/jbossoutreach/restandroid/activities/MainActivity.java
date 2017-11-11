package org.jbossoutreach.restandroid.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jbossoutreach.restandroid.R;
import org.jbossoutreach.restandroid.backend.RestClient;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Example usage of RestClient
//        Call<Response> getRequest = new RestClient().getResponseService().getCall("the url", "Body if the request has one");
//        getRequest.enqueue(new Callback<Response>() {
//            @Override
//            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<Response> call, Throwable t) {
//
//            }
//        });
    }
}