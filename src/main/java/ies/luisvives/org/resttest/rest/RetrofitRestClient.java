package ies.luisvives.org.resttest.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Clase que crea un cliente Retrofit con Jackson como conversor IO JSON
 * Implementa el patron singleton
 */
public class RetrofitRestClient {
    private static Retrofit instance;

    public static Retrofit getClient(String url) {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl(url)
//                    .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
