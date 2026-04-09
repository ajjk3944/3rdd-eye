package com.vungle.ads.internal.network;

import android.os.Build;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j {

    @NotNull
    public static final j INSTANCE;

    @Nullable
    private static String appId;

    @Nullable
    private static String appVersion;

    @NotNull
    private static String headerUa;

    static {
        j jVar = new j();
        INSTANCE = jVar;
        headerUa = jVar.defaultHeader();
    }

    private j() {
    }

    private final String defaultHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.a("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb.append("7.6.3");
        return sb.toString();
    }

    @Nullable
    public final String getAppId() {
        return appId;
    }

    @Nullable
    public final String getAppVersion() {
        return appVersion;
    }

    @NotNull
    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(@Nullable String str) {
        appId = str;
    }

    public final void setAppVersion(@Nullable String str) {
        appVersion = str;
    }

    public final void setHeaderUa(@NotNull String str) {
        p.e(str, "<set-?>");
        headerUa = str;
    }
}
