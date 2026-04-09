package com.phuongpn.whousemywifi.networkscanner;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import defpackage.bm0;
import defpackage.ex0;
import defpackage.f20;
import defpackage.fm0;
import defpackage.g9;
import defpackage.gm0;
import defpackage.i5;
import defpackage.m54;
import defpackage.pu0;
import defpackage.q3;
import defpackage.xw;
import defpackage.yo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class SettingsActivity extends i5 {

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static final class a extends bm0 {
        public f20 h0;

        @Override // defpackage.bm0
        public final void O(String str) throws Resources.NotFoundException {
            gm0 gm0Var = this.a0;
            if (gm0Var == null) {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
            Context contextG = G();
            gm0Var.e = true;
            fm0 fm0Var = new fm0(contextG, gm0Var);
            XmlResourceParser xml = contextG.getResources().getXml(R.xml.root_preferences);
            try {
                PreferenceGroup preferenceGroupC = fm0Var.c(xml);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupC;
                preferenceScreen.k(gm0Var);
                SharedPreferences.Editor editor = gm0Var.d;
                if (editor != null) {
                    editor.apply();
                }
                gm0Var.e = false;
                Preference preference = preferenceScreen;
                if (str != null) {
                    Preference preferenceY = preferenceScreen.y(str);
                    boolean z = preferenceY instanceof PreferenceScreen;
                    preference = preferenceY;
                    if (!z) {
                        throw new IllegalArgumentException(ex0.h("Preference object with key ", str, " is not a PreferenceScreen"));
                    }
                }
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
                gm0 gm0Var2 = this.a0;
                PreferenceScreen preferenceScreen3 = gm0Var2.g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.n();
                    }
                    gm0Var2.g = preferenceScreen2;
                    this.c0 = true;
                    if (this.d0) {
                        q3 q3Var = this.f0;
                        if (!q3Var.hasMessages(1)) {
                            q3Var.obtainMessage(1).sendToTarget();
                        }
                    }
                }
                ListPreference listPreference = (ListPreference) N("key_theme");
                if (listPreference != null) {
                    listPreference.j = new yo(2);
                }
                Preference preferenceN = N("key_open_source");
                if (preferenceN != null) {
                    preferenceN.k = new pu0(this, 0);
                }
                Preference preferenceN2 = N("key_localization");
                if (preferenceN2 != null) {
                    preferenceN2.k = new pu0(this, 1);
                }
                Preference preferenceN3 = N("key_version");
                if (preferenceN3 != null) {
                    preferenceN3.v("1.9.2");
                }
                Preference preferenceN4 = N("key_feedback");
                if (preferenceN4 != null) {
                    preferenceN4.k = new pu0(this, 2);
                }
                Preference preferenceN5 = N("key_privacy");
                if (preferenceN5 != null) {
                    preferenceN5.k = new pu0(this, 3);
                }
                f20 f20VarE = f20.h.e(G());
                this.h0 = f20VarE;
                f20VarE.g(F(), new pu0(this, 4));
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
    }

    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        getWindow().getDecorView();
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        if (bundle == null) {
            xw xwVarO = o();
            xwVarO.getClass();
            g9 g9Var = new g9(xwVarO);
            g9Var.e(R.id.settings, new a(), null, 2);
            g9Var.d(false);
        }
        m54 m54VarN = n();
        if (m54VarN != null) {
            m54VarN.y(true);
        }
    }

    @Override // defpackage.i5
    public final boolean v() {
        if (o().N(-1, 0)) {
            return true;
        }
        return super.v();
    }
}
