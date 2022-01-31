package ies.luisvives.org.resttest.rest;

public class APIRest {
    private static final String server = "localhost";
    private static final String port = "4000";
    private static final String endpoint = "/gnomosAPI/";
    private static final String API_URL = "http://"+ server + ":" + port + endpoint;
    private static final String RICK_MORTY_URL = "https://rickandmortyapi.com/api/";

    private APIRest() {

    }

    public static RestTestAPI getService() {
        return RetrofitRestClient.getClient(RICK_MORTY_URL).create(RestTestAPI.class);
    }
}
