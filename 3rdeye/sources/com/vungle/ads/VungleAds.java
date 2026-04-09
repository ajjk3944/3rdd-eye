package com.vungle.ads;

import a6.C1661j;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.vungle.ads.internal.network.g;
import java.util.HashSet;

/* compiled from: VungleAds.kt */
/* loaded from: classes2.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final a Companion = new a(null);
    private static com.vungle.ads.internal.l vungleInternal = new com.vungle.ads.internal.l();
    private static com.vungle.ads.internal.j initializer = new com.vungle.ads.internal.j();
    public static final Y5.c firstPartyData = new Y5.c();

    /* compiled from: VungleAds.kt */
    @Keep
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    /* compiled from: VungleAds.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void deInit$vungle_ads_release() {
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final String getBiddingToken(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            return VungleAds.vungleInternal.getAvailableBidTokens(context);
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(Context appContext, String appId, B callback) {
            kotlin.jvm.internal.l.f(appContext, "context");
            kotlin.jvm.internal.l.f(appId, "appId");
            kotlin.jvm.internal.l.f(callback, "callback");
            if (!(appContext instanceof Application)) {
                appContext = appContext.getApplicationContext();
            }
            com.vungle.ads.internal.j jVar = VungleAds.initializer;
            kotlin.jvm.internal.l.e(appContext, "appContext");
            jVar.init(appId, appContext, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final boolean isInline(String placementId) {
            kotlin.jvm.internal.l.f(placementId, "placementId");
            C1661j placement = com.vungle.ads.internal.f.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(WrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
            kotlin.jvm.internal.l.f(wrapperFramework, "wrapperFramework");
            kotlin.jvm.internal.l.f(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            if (wrapperFramework != WrapperFramework.none) {
                g.b bVar = com.vungle.ads.internal.network.g.Companion;
                bVar.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(wrapperFramework);
                String headerUa = bVar.getHeaderUa();
                String str = wrapperFramework + (wrapperFrameworkVersion.length() > 0 ? "/".concat(wrapperFrameworkVersion) : "");
                if (new HashSet(y9.q.r0(headerUa, new String[]{";"})).add(str)) {
                    bVar.setHeaderUa(headerUa + ';' + str);
                }
            } else {
                com.vungle.ads.internal.util.k.Companion.e(VungleAds.TAG, "Wrapper is null or is none");
            }
            if (isInitialized()) {
                com.vungle.ads.internal.util.k.Companion.w(VungleAds.TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
            }
        }

        private a() {
        }
    }

    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, B b10) {
        Companion.init(context, str, b10);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(WrapperFramework wrapperFramework, String str) {
        Companion.setIntegrationName(wrapperFramework, str);
    }
}
