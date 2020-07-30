package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public interface Animal {

    default void walk() {
        System.out.println("I am walking");
    }
}
