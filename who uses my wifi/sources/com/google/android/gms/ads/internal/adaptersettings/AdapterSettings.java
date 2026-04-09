package com.google.android.gms.ads.internal.adaptersettings;

import defpackage.hz1;
import defpackage.tw1;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final hz1 adapterSettingsInternal = tw1.e.d;

    private boolean getBoolean(String str, boolean z) {
        hz1 hz1Var = this.adapterSettingsInternal;
        hz1Var.getClass();
        return !str.startsWith("adapter:") ? z : hz1Var.c.optBoolean(str, z);
    }

    private float getFloat(String str, float f) {
        hz1 hz1Var = this.adapterSettingsInternal;
        hz1Var.getClass();
        return !str.startsWith("adapter:") ? f : (float) hz1Var.c.optDouble(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        hz1 hz1Var = this.adapterSettingsInternal;
        hz1Var.getClass();
        return !str.startsWith("adapter:") ? i : hz1Var.c.optInt(str, i);
    }

    private long getLong(String str, long j) {
        hz1 hz1Var = this.adapterSettingsInternal;
        hz1Var.getClass();
        return !str.startsWith("adapter:") ? j : hz1Var.c.optLong(str, j);
    }

    private String getString(String str, String str2) {
        hz1 hz1Var = this.adapterSettingsInternal;
        hz1Var.getClass();
        return !str.startsWith("adapter:") ? str2 : hz1Var.c.optString(str, str2);
    }
}
