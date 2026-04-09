package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b0 {

    @NotNull
    public static final String TAG = "VungleAds";

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static VungleInternal vungleInternal = new VungleInternal();

    @NotNull
    private static VungleInitializer initializer = new VungleInitializer();

    @JvmField
    @NotNull
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @JvmStatic
        public final void deInit(@NotNull Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            b0.initializer.deInit$vungle_ads_release();
        }

        @JvmStatic
        public final void getBiddingToken(@NotNull Context context, @NotNull h callback) {
            kotlin.jvm.internal.p.e(context, "context");
            kotlin.jvm.internal.p.e(callback, "callback");
            b0.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        @JvmStatic
        @NotNull
        public final String getSdkVersion() {
            return b0.vungleInternal.getSdkVersion();
        }

        @JvmStatic
        public final void init(@NotNull Context appContext, @NotNull String appId, @NotNull l callback) throws Throwable {
            kotlin.jvm.internal.p.e(appContext, "context");
            kotlin.jvm.internal.p.e(appId, "appId");
            kotlin.jvm.internal.p.e(callback, "callback");
            if (!(appContext instanceof Application)) {
                appContext = appContext.getApplicationContext();
            }
            VungleInitializer vungleInitializer = b0.initializer;
            kotlin.jvm.internal.p.d(appContext, "appContext");
            vungleInitializer.init(appId, appContext, callback);
        }

        @JvmStatic
        public final boolean isInitialized() {
            return b0.initializer.isInitialized();
        }

        @JvmStatic
        public final boolean isInline(@NotNull String placementId) {
            kotlin.jvm.internal.p.e(placementId, "placementId");
            q7.h placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        @JvmStatic
        public final void setIntegrationName(@NotNull VungleWrapperFramework wrapperFramework, @NotNull String wrapperFrameworkVersion) {
            kotlin.jvm.internal.p.e(wrapperFramework, "wrapperFramework");
            kotlin.jvm.internal.p.e(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            b0.initializer.setIntegrationName(wrapperFramework, wrapperFrameworkVersion);
        }

        private a() {
        }
    }

    @JvmStatic
    public static final void deInit(@NotNull Context context) {
        Companion.deInit(context);
    }

    @JvmStatic
    public static final void getBiddingToken(@NotNull Context context, @NotNull h hVar) {
        Companion.getBiddingToken(context, hVar);
    }

    @JvmStatic
    @NotNull
    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    @JvmStatic
    public static final void init(@NotNull Context context, @NotNull String str, @NotNull l lVar) throws Throwable {
        Companion.init(context, str, lVar);
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    @JvmStatic
    public static final boolean isInline(@NotNull String str) {
        return Companion.isInline(str);
    }

    @JvmStatic
    public static final void setIntegrationName(@NotNull VungleWrapperFramework vungleWrapperFramework, @NotNull String str) {
        Companion.setIntegrationName(vungleWrapperFramework, str);
    }
}
