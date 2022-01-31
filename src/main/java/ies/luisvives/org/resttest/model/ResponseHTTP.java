package ies.luisvives.org.resttest.model;

import java.util.List;

public class ResponseHTTP {
    Info info;
    List<RMCharacter> results;

    public ResponseHTTP() {
    }

    public ResponseHTTP(Info info, List<RMCharacter> characters) {
        this.info = info;
        this.results = characters;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<RMCharacter> getResults() {
        return results;
    }

    public void setResults(List<RMCharacter> results) {
        this.results = results;
    }
}
