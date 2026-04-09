package ru.andr7e.siminfo;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.MenuItem;
import n0.h;
import ru.andr7e.simcellinfo.R;

/* loaded from: classes.dex */
public class SettingsActivity extends n0.a {

    /* renamed from: c, reason: collision with root package name */
    private static Preference.OnPreferenceChangeListener f3222c = new a();

    class a implements Preference.OnPreferenceChangeListener {
        a() {
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            String string = obj.toString();
            if (!(preference instanceof ListPreference)) {
                q0.a.b("FDFD", "FAF" + string);
                preference.setSummary(string);
                return true;
            }
            ListPreference listPreference = (ListPreference) preference;
            int iFindIndexOfValue = listPreference.findIndexOfValue(string);
            preference.setSummary(iFindIndexOfValue >= 0 ? listPreference.getEntries()[iFindIndexOfValue] : null);
            q0.a.b("FDFD", "FAFffff" + string);
            return true;
        }
    }

    @TargetApi(11)
    public static class b extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(R.xml.pref_main);
            if (Build.VERSION.SDK_INT < 29) {
                Preference preferenceFindPreference = findPreference("show_tac_of_imei");
                PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_key_other_settings");
                preferenceCategory.removePreference(preferenceFindPreference);
                ((PreferenceScreen) findPreference("preference_screen")).removePreference(preferenceCategory);
            }
            setHasOptionsMenu(true);
            SettingsActivity.d(findPreference("language_list"));
            SettingsActivity.d(findPreference("theme_list"));
            SettingsActivity.d(findPreference("gnb_5g_len_list"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Preference preference) {
        if (preference == null) {
            return;
        }
        preference.setOnPreferenceChangeListener(f3222c);
        f3222c.onPreferenceChange(preference, PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
    }

    private void e() {
        androidx.appcompat.app.a aVarB = b();
        if (aVarB != null) {
            aVarB.s(true);
        }
    }

    @Override // android.preference.PreferenceActivity
    protected boolean isValidFragment(String str) {
        return PreferenceFragment.class.getName().equals(str) || b.class.getName().equals(str);
    }

    @Override // n0.a, android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i2;
        int iA = h.a(PreferenceManager.getDefaultSharedPreferences(this), this);
        if (iA > 0) {
            if (iA == 1) {
                i2 = R.style.AppTheme_Dark;
            } else if (iA == 2) {
                i2 = R.style.AppTheme_Black;
            }
            setTheme(i2);
        }
        super.onCreate(bundle);
        e();
        setTitle(R.string.title_activity_settings);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new b()).commit();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
