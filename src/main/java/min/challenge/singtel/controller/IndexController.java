package min.challenge.singtel.controller;
/*
 * Created by kunnchan on 31/07/2020
 * package :  min.challenge.singtel.controller
 */

import min.challenge.singtel.model.Rooster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/{language}")
    public String makeRoosterSound(@PathVariable("language") String language) {
        if ("".equals(language) || language == null)
            return "Hi, Please add language for me to make a sound";
        else
            return new Rooster().singOverLanguage(language);
    }
}
