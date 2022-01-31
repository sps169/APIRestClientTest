package ies.luisvives.org.resttest;

import ies.luisvives.org.resttest.model.RMCharacter;
import ies.luisvives.org.resttest.model.ResponseHTTP;
import ies.luisvives.org.resttest.rest.APIRest;
import ies.luisvives.org.resttest.rest.RestTestAPI;
import retrofit2.Response;

import java.io.IOException;

public class RestTestMain {
    static RestTestAPI restService = APIRest.getService();

    public static void runCharacters() {
        charactersGetAll();
        characterGetById();
        insertCharacter();
        updateCharacter();
        deleteCharacter();
    }

    private static void charactersGetAll() {
        try {
            Response<ResponseHTTP> response = restService.charactersGetAll().execute();
            if (response.isSuccessful() && response.body() != null) {
                System.out.println("All characters:");
                response.body().getResults().forEach(System.out::println);
            } else {
                System.out.println("Que liada pipita");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void characterGetById() {
        try {
            Response<RMCharacter> response = restService.characterGetById("1").execute();
            if (response.isSuccessful() && response.body() != null) {
                System.out.println("Character with id: 1");
                System.out.println(response.body());
            } else {
                System.out.println("Que liada pipita");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void insertCharacter() {
    }

    private static void updateCharacter() {
    }

    private static void deleteCharacter() {
    }

    public static void main (String []args) {
        runCharacters();
    }

}