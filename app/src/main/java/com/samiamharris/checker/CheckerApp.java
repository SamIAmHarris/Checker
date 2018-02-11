package com.samiamharris.checker;

import android.app.Application;

/**
 * Created by SamIAm on 2/11/18.
 */

public class CheckerApp extends Application {

    private static CheckerApp app;

    // Exposed Methods

    public CheckerApp() {
        app = this;
    }

    // Statically Exposed Methods

    public static CheckerApp getApp() {
        return app;
    }
}
