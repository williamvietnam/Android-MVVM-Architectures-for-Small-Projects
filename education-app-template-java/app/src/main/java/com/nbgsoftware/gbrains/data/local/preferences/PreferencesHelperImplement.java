package com.nbgsoftware.gbrains.data.local.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.nbgsoftware.gbrains.di.ApplicationContext;
import com.nbgsoftware.gbrains.di.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

public class PreferencesHelperImplement implements PreferencesHelper {

    private static final String PREF_KEY_IS_SHOW_WELCOME_SCREEN = "PREF_KEY_IS_SHOW_WELCOME_SCREEN";

    private final SharedPreferences prefs;

    public PreferencesHelperImplement(@ApplicationContext Context context, @PreferenceInfo String prefFileName) {
        this.prefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public boolean isShowedWelcomeScreen() {
        return prefs.getBoolean(PREF_KEY_IS_SHOW_WELCOME_SCREEN, false);
    }

    @Override
    public void setShowedWelcomeScreen() {
        prefs.edit().putBoolean(PREF_KEY_IS_SHOW_WELCOME_SCREEN, true).apply();
    }

    @Override
    public void clearAllDataExceptWelcome() {

    }
}
