package ies.luisvives.org.resttest.rest;

import ies.luisvives.org.resttest.model.RMCharacter;
import ies.luisvives.org.resttest.model.ResponseHTTP;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestTestAPI {

    //Personajes
    @GET("character")
    Call<ResponseHTTP> charactersGetAll();

    @GET("character/{id}")
    Call<RMCharacter> characterGetById(@Path("id") String id);

    @POST("character")
    Call<RMCharacter> insertCharacter(@Body RMCharacter character);

    @PUT("character/{id}")
    Call<RMCharacter> updateCharacter(@Path("id") String id, @Body RMCharacter character);

    @DELETE("character/{id}")
    Call<RMCharacter> deleteCharacter(@Path("id") String id);
}
