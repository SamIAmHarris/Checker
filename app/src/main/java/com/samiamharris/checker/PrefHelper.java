package com.samiamharris.checker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

/**
 * Created by SamIAm on 2/11/18.
 */

public abstract class PrefHelper {

    // Private Properties

    private static SharedPreferences sharedPreferences = CheckerApp.getApp().getSharedPreferences(
            Constant.DEFAULT_NAME, Context.MODE_PRIVATE
    );

    // Exposed Methods

    public static void setCheckerCount(Integer value) {
        setInt(Key.CHECKER_COUNT, value);
    }

    public static int getCheckerCount() {
        return getInt(Key.CHECKER_COUNT);
    }

    // Statically Private Methods

    @SuppressLint("ApplySharedPref")
    private static void setInt(String key, Integer value) {
        if (value == null) {
            remove(key);
            return;
        }
        sharedPreferences
                .edit()
                .putInt(key, value)
                .commit();
    }

    private static int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    @SuppressLint("ApplySharedPref")
    private static void setString(String key, String value) {
        if (value == null) {
            remove(key);
            return;
        }

        sharedPreferences
                .edit()
                .putString(key, value)
                .commit();
    }


    @Nullable
    private static String getString(String key) {
        final String value = sharedPreferences.getString(key, "");
        if (value.isEmpty()) {
            return null;
        }
        return value;
    }

    @SuppressLint("ApplySharedPref")
    private static void remove(String key) {
        sharedPreferences
                .edit()
                .remove(key)
                .commit();
    }

    // Statically Private Types

    private static abstract class Key {
        static final String CHECKER_COUNT = "checker_count";
    }

    private static abstract class Constant {
        static final String DEFAULT_NAME = "checker_shared_preferences";
    }
}
