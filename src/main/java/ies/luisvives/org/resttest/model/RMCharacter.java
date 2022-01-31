package ies.luisvives.org.resttest.model;

import java.net.URL;
import java.util.List;


public class RMCharacter {
    String id;
    String name;
    String status;
    String species;
    String type;
    Gender gender;
    Location origin;
    Location location;
    URL image;
    List<String> episode;
    String url;
    String created;

    public RMCharacter() {

    }

    public RMCharacter(String id, String name, String status, String species, String type
            , Gender gender, Location originLocation, Location lastKnownLocation, URL image, List<String> episode, String url, String created
    ) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = originLocation;
        this.location = lastKnownLocation;
        this.image = image;
        this.episode = episode;
        this.url = url;
        this.created = created;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender=" + gender +
                ", originLocation=" + origin +
                ", lastKnownLocation=" + location +
                ", image=" + image +
                ", episodesUrl=" + episode +
                ", episodes=" + url +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public List<String> getEpisode() {
        return episode;
    }

    public void setEpisode(List<String> episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public enum Gender {
        unknown,
        Female,
        Male,
        Genderless
    }

    public enum Status {
        unknown,
        Alive,
        Dead
    }
}
