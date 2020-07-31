package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public interface Animal {

    default void sing() {
        System.out.println("Animal singing!");
    }

    boolean canFly();

    boolean canWalk();

    boolean canSing();

    boolean canSwim();
}
