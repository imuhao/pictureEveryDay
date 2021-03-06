package com.imuhao.pictureeveryday.http;

import com.imuhao.pictureeveryday.utils.Constant;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * @author Smile
 * @time 2016/6/24  13:31
 * @desc ${TODD}
 */
public class Retrofits {
    private static Retrofit mRetrofit;

    public static ApiInterface getApiService() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mRetrofit.create(ApiInterface.class);
    }

}
