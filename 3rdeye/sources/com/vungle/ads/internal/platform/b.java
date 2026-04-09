package com.vungle.ads.internal.platform;

import a6.C1654c;

/* compiled from: Platform.kt */
/* loaded from: classes2.dex */
public interface b {
    public static final a Companion = a.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* compiled from: Platform.kt */
    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private a() {
        }
    }

    C1654c getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    String getCarrierName();

    String getUserAgent();

    void getUserAgentLazy(K0.b<String> bVar);

    float getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
