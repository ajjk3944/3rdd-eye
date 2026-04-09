package com.zipoapps.premiumhelper.toto;

import com.google.gson.internal.c;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TotoServiceConfig.kt */
/* loaded from: classes3.dex */
public final class TotoServiceConfig {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ TotoServiceConfig[] $VALUES;
    public static final TotoServiceConfig PRODUCTION = new TotoServiceConfig("PRODUCTION", 0, "https://config.toto.zipoapps.com/");
    public static final TotoServiceConfig STAGING = new TotoServiceConfig("STAGING", 1, "https://staging.config.toto.zipoapps.com/");
    private final String endpoint;

    private static final /* synthetic */ TotoServiceConfig[] $values() {
        return new TotoServiceConfig[]{PRODUCTION, STAGING};
    }

    static {
        TotoServiceConfig[] totoServiceConfigArr$values = $values();
        $VALUES = totoServiceConfigArr$values;
        $ENTRIES = c.l(totoServiceConfigArr$values);
    }

    private TotoServiceConfig(String str, int i, String str2) {
        this.endpoint = str2;
    }

    public static InterfaceC4463a<TotoServiceConfig> getEntries() {
        return $ENTRIES;
    }

    public static TotoServiceConfig valueOf(String str) {
        return (TotoServiceConfig) Enum.valueOf(TotoServiceConfig.class, str);
    }

    public static TotoServiceConfig[] values() {
        return (TotoServiceConfig[]) $VALUES.clone();
    }

    public final String getEndpoint() {
        return this.endpoint;
    }
}
