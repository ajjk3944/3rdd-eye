package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004<=>?B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ+\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010J5\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\u0011J#\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001cJ7\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010\"J-\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010%J\u0019\u0010'\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010+R\u001a\u0010,\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0003\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010-R\u001a\u00104\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0003\u001a\u0004\b1\u00102R*\u00105\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b9\u0010\u0003\u001a\u0004\b6\u0010-\"\u0004\b7\u00108R\u001c\u0010;\u001a\u0004\u0018\u00010\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0003\u001a\u0004\b'\u00102¨\u0006@"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "Ly8/s;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "initializationListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsInitializationListener;)V", "", "testMode", "(Landroid/content/Context;Ljava/lang/String;Z)V", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/IUnityAdsInitializationListener;)V", "Landroid/app/Activity;", "activity", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "show", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsShowListener;", "showListener", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "Lcom/unity3d/ads/UnityAdsShowOptions;", "options", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "load", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getToken", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "Lcom/unity3d/ads/TokenConfiguration;", "configuration", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "isInitialized", "()Z", "isInitialized$annotations", "isSupported", "isSupported$annotations", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "getVersion$annotations", "version", "debugMode", "getDebugMode", "setDebugMode", "(Z)V", "getDebugMode$annotations", "getToken$annotations", BidResponsed.KEY_TOKEN, "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowCompletionState", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    @JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @JvmStatic
    public static /* synthetic */ void getToken$annotations() {
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        p.d(version, "getInstance().version");
        return version;
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static final void initialize(@Nullable Context context, @Nullable String gameId) {
        UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void load(@Nullable String placementId) {
        load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds.load.1
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(@NotNull String placementId2) {
                p.e(placementId2, "placementId");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(@NotNull String placementId2, @NotNull UnityAdsLoadError error, @NotNull String message) {
                p.e(placementId2, "placementId");
                p.e(error, "error");
                p.e(message, "message");
            }
        });
    }

    public static final void setDebugMode(boolean z10) {
        UnityAdsImplementation.getInstance().setDebugMode(z10);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void show(@Nullable Activity activity, @Nullable String placementId) {
        UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
    }

    @JvmStatic
    public static final void getToken(@Nullable IUnityAdsTokenListener listener) {
        UnityAdsImplementation.getInstance().getToken(listener);
    }

    @JvmStatic
    public static final void initialize(@Nullable Context context, @Nullable String gameId, @Nullable IUnityAdsInitializationListener initializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
    }

    @JvmStatic
    public static final void load(@Nullable String placementId, @Nullable IUnityAdsLoadListener listener) {
        UnityAdsImplementation.getInstance().load(placementId, new UnityAdsLoadOptions(), listener);
    }

    @JvmStatic
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable IUnityAdsShowListener showListener) {
        UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
    }

    @JvmStatic
    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull IUnityAdsTokenListener listener) {
        p.e(configuration, "configuration");
        p.e(listener, "listener");
        UnityAdsImplementation.getInstance().getToken(configuration, listener);
    }

    @JvmStatic
    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode) {
        UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
    }

    @JvmStatic
    public static final void load(@Nullable String placementId, @Nullable UnityAdsLoadOptions loadOptions, @Nullable IUnityAdsLoadListener listener) {
        IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
        if (loadOptions == null) {
            loadOptions = new UnityAdsLoadOptions();
        }
        unityAdsImplementation.load(placementId, loadOptions, listener);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options) {
        UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
    }

    @JvmStatic
    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable IUnityAdsInitializationListener initializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
    }

    @JvmStatic
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options, @Nullable IUnityAdsShowListener showListener) {
        UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
    }
}
