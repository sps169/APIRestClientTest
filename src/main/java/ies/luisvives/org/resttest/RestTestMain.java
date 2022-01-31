package ies.luisvives.org.resttest;

import ies.luisvives.org.resttest.model.Location;
import ies.luisvives.org.resttest.model.RMCharacter;
import ies.luisvives.org.resttest.model.ResponseHTTP;
import ies.luisvives.org.resttest.rest.APIRest;
import ies.luisvives.org.resttest.rest.RestTestAPI;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;

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
        RMCharacter character = new RMCharacter(
                "827",
                "Porro",
                "Alive",
                "Human",
                "",
                RMCharacter.Gender.Male,
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
                new ArrayList<String>(),
                "",
                "true");

        try {
            Response<RMCharacter> response = restService.insertCharacter(character).execute();
            if (response.isSuccessful() && response.body() != null) {
                RMCharacter responseCharacter = response.body();
                System.out.println("Se ha insertado correctamente el personaje: " +responseCharacter);
            }else {
                System.out.println("liada, codigo: " +  response.code());
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void updateCharacter() {
        RMCharacter character = new RMCharacter(
                "1",
                "Rick Sanchez",
                "Alive",
                "Human",
                "",
                RMCharacter.Gender.Male,
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
                new ArrayList<String>(),
                "https://rickandmortyapi.com/api/character/1",
                "2017-11-04T18:48:46.250Z");

        try {
            Response<RMCharacter> response = restService.updateCharacter(character.getId(), character).execute();
            if (response.isSuccessful() && response.body() != null) {
                RMCharacter responseCharacter = response.body();
                System.out.println("Se ha actualizado correctamente el personaje: " +responseCharacter);
            }else {
                System.out.println("liada, codigo: " +  response.code());
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void deleteCharacter() {
        RMCharacter character = new RMCharacter(
                "1",
                "Rick Sanchez",
                "Alive",
                "Human",
                "",
                RMCharacter.Gender.Male,
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                new Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
                "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
                new ArrayList<String>(),
                "https://rickandmortyapi.com/api/character/1",
                "2017-11-04T18:48:46.250Z");

        try {
            Response<RMCharacter> response = restService.deleteCharacter(character.getId()).execute();
            if (response.isSuccessful() && response.body() != null) {
                RMCharacter responseCharacter = response.body();
                System.out.println("Se ha eliminado correctamente el personaje: " +responseCharacter);
            }else {
                System.out.println("liada, codigo: " +  response.code());
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main (String []args) {
        runCharacters();
    }

}