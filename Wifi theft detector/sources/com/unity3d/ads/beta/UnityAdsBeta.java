package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/beta/InitializationConfiguration;", "configuration", "Lcom/unity3d/ads/beta/InitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ly8/s;", MobileAdsBridgeBase.initializeMethodName, "(Lcom/unity3d/ads/beta/InitializationConfiguration;Lcom/unity3d/ads/beta/InitializationListener;)V", "Lcom/unity3d/ads/beta/TokenConfiguration;", "Lcom/unity3d/ads/beta/TokenListener;", "getToken", "(Lcom/unity3d/ads/beta/TokenConfiguration;Lcom/unity3d/ads/beta/TokenListener;)V", "", "isInitialize", "()Z", "", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "version", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "UnityAdsBeta")
/* loaded from: classes3.dex */
public final class UnityAdsBeta {
    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull TokenListener listener) {
        p.e(configuration, "configuration");
        p.e(listener, "listener");
    }

    @NotNull
    public static final String getVersion() {
        return "";
    }

    public static final void initialize(@NotNull InitializationConfiguration configuration, @NotNull InitializationListener listener) {
        p.e(configuration, "configuration");
        p.e(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}
