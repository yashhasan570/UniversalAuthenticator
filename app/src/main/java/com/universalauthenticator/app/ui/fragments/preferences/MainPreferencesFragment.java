package com.universalauthenticator.app.ui.fragments.preferences;

import android.os.Bundle;

import com.universalauthenticator.app.R;

public class MainPreferencesFragment extends PreferencesFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
