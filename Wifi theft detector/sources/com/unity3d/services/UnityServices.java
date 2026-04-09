package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.Session;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/UnityServices;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "testMode", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "initializationListener", "Ly8/s;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/IUnityAdsInitializationListener;)V", "isSupported", "Z", "()Z", "isSupported$annotations", "isInitialized", "isInitialized$annotations", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "getVersion$annotations", "version", "debugMode", "getDebugMode", "setDebugMode", "(Z)V", "getDebugMode$annotations", "UnityServicesError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityServices {

    @NotNull
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityServices$UnityServicesError;", "", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "INIT_SANITY_CHECK_FAIL", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    @JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @NotNull
    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        p.d(versionName, "getVersionName()");
        return versionName;
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static final synchronized void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable IUnityAdsInitializationListener initializationListener) {
        try {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(initializationListener);
            SdkProperties.setTestMode(testMode);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            DeviceLog.info("Initializing Unity Services " + SdkProperties.getVersionName() + " (" + SdkProperties.getVersionCode() + ") with game id " + gameId + " in " + (testMode ? "test mode" : "production mode") + ", session " + Session.INSTANCE.getId());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), gameId, null, 2, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    @JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void setDebugMode(boolean z10) {
        SdkProperties.setDebugMode(z10);
    }
}
