package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

import java.util.HashMap;
import java.util.Map;

public class Rooster implements Animal {

    Map<String, String> languages;

    public Rooster() {
        languages = new HashMap<>();
        languages.put("Danish", "kykyliky");
        languages.put("Dutch", "kukeleku");
        languages.put("Finnish", "kukko kiekuu");
        languages.put("French", "cocorico");
        languages.put("German", "kikeriki");
        languages.put("Greek", "kikiriki");
        languages.put("Hebrew", "coo-koo-ri-koo");
        languages.put("Hungarian", "kukuriku");
        languages.put("Italian", "chicchirichi");
        languages.put("Japanese", "ko-ke-kok-ko-o");
        languages.put("Portuguese", "cucurucu");
        languages.put("Russian", "kukareku");
        languages.put("Swedish", "kuckeliku");
        languages.put("Turkish", "kuk-kurri-kuuu");
        languages.put("Urdu", "kuklooku");
        ;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canSing() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    public String singOverLanguage(String language) {
        return this.languages.get(language);
    }
}
