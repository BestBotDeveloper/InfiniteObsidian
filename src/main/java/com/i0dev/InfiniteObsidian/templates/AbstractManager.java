package com.i0dev.InfiniteObsidian.templates;


import com.i0dev.InfiniteObsidian.Heart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractManager {

    /*
    Credit given to EmberCM
    Discord: Ember#1404
    GitHub: https://github.com/EmberCM
     */

    public Heart heart;
    public boolean loaded = false;

    public void initialize() {

    }

    public void deinitialize() {

    }

    public AbstractManager(Heart heart) {
        this.heart = heart;
    }
}
