package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.ok;
import va.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final ok adapterSettingsInternal = s.f36163e.f36167d;

    private boolean getBoolean(String str, boolean z3) {
        ok okVar = this.adapterSettingsInternal;
        okVar.getClass();
        return !str.startsWith("adapter:") ? z3 : okVar.f14715c.optBoolean(str, z3);
    }

    private float getFloat(String str, float f10) {
        ok okVar = this.adapterSettingsInternal;
        okVar.getClass();
        return !str.startsWith("adapter:") ? f10 : (float) okVar.f14715c.optDouble(str, f10);
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

    private int getInt(String str, int i4) {
        ok okVar = this.adapterSettingsInternal;
        okVar.getClass();
        return !str.startsWith("adapter:") ? i4 : okVar.f14715c.optInt(str, i4);
    }

    private long getLong(String str, long j) {
        ok okVar = this.adapterSettingsInternal;
        okVar.getClass();
        return !str.startsWith("adapter:") ? j : okVar.f14715c.optLong(str, j);
    }

    private String getString(String str, String str2) {
        ok okVar = this.adapterSettingsInternal;
        okVar.getClass();
        return !str.startsWith("adapter:") ? str2 : okVar.f14715c.optString(str, str2);
    }
}
