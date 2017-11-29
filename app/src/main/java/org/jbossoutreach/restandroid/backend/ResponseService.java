package org.jbossoutreach.restandroid.backend;

import android.support.annotation.Nullable;

import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Url;

/**
 * Created by murad on 11/11/17.
 */

public interface ResponseService {

    @GET
    Call<Response> getCall(@Url String url,
                           @Nullable @Body RequestBody requestBody);

    @DELETE
    Call<Response> deleteCall(@Url String url,
                              @Nullable @Body RequestBody requestBody);

    @POST
    Call<Response> postCall(@Url String url,
                            @Nullable @Body RequestBody requestBody);

    @PUT
    Call<Response> putCall(@Url String url,
                           @Nullable @Body RequestBody requestBody);
}
