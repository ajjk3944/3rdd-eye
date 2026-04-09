package com.google.android.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;

    @Deprecated
    public static final String DEFAULT_USER_AGENT;
    public static final boolean GL_ASSERTIONS_ENABLED = false;
    public static final String TAG = "ExoPlayer";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.15.1";
    public static final int VERSION_INT = 2015001;
    public static final String VERSION_SLASHY = "ExoPlayerLib/2.15.1";
    private static final HashSet<String> registeredModules;
    private static String registeredModulesString;

    static {
        String str = Build.VERSION.RELEASE;
        DEFAULT_USER_AGENT = c7.a.k(c7.a.d(57, str), "ExoPlayerLib/2.15.1 (Linux; Android ", str, ") ExoPlayerLib/2.15.1");
        registeredModules = new HashSet<>();
        registeredModulesString = "goog.exo.core";
    }

    private ExoPlayerLibraryInfo() {
    }

    public static synchronized void registerModule(String str) {
        if (registeredModules.add(str)) {
            String str2 = registeredModulesString;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            registeredModulesString = sb2.toString();
        }
    }

    public static synchronized String registeredModules() {
        return registeredModulesString;
    }
}
