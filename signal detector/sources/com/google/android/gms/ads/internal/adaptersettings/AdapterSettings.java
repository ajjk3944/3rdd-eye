package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.D9;
import q2.C2841s;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final D9 adapterSettingsInternal = C2841s.f23267e.f23271d;

    private boolean getBoolean(String str, boolean z6) {
        D9 d9 = this.adapterSettingsInternal;
        d9.getClass();
        return !str.startsWith("adapter:") ? z6 : d9.f7730c.optBoolean(str, z6);
    }

    private float getFloat(String str, float f2) {
        D9 d9 = this.adapterSettingsInternal;
        d9.getClass();
        return !str.startsWith("adapter:") ? f2 : (float) d9.f7730c.optDouble(str, f2);
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
        D9 d9 = this.adapterSettingsInternal;
        d9.getClass();
        return !str.startsWith("adapter:") ? i : d9.f7730c.optInt(str, i);
    }

    private long getLong(String str, long j6) {
        D9 d9 = this.adapterSettingsInternal;
        d9.getClass();
        return !str.startsWith("adapter:") ? j6 : d9.f7730c.optLong(str, j6);
    }

    private String getString(String str, String str2) {
        D9 d9 = this.adapterSettingsInternal;
        d9.getClass();
        return !str.startsWith("adapter:") ? str2 : d9.f7730c.optString(str, str2);
    }
}
