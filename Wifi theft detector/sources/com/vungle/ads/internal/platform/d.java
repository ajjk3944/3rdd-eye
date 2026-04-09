package com.vungle.ads.internal.platform;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface d {

    @NotNull
    public static final a Companion = a.$$INSTANCE;

    @NotNull
    public static final String MANUFACTURER_AMAZON = "Amazon";

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        @NotNull
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private a() {
        }
    }

    @Nullable
    q7.b getAdvertisingInfo();

    @Nullable
    String getAppSetId();

    @Nullable
    Integer getAppSetIdScope();

    long getBuildTime();

    @NotNull
    String getCarrierName();

    @Nullable
    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    @Nullable
    String getUserAgent();

    void getUserAgentLazy(@NotNull r0.b bVar);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
