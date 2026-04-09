package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.n7;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i4) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().a(i4);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i4) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().b(i4);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i4) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().c(i4);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i4) {
        k kVarF = n7.f();
        if (kVarF != null) {
            return kVarF.r0().d(i4);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(k.o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(k.o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(k.o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(k.o());
    }

    public static void setDoNotSell(boolean z3) {
        setDoNotSell(z3, k.o());
    }

    public static void setHasUserConsent(boolean z3) {
        setHasUserConsent(z3, k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = p0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = p0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return p0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return p0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z3, Context context) {
        o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (p0.a(z3, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z3));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z3, Context context) {
        o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (p0.b(z3, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z3), null);
        }
    }
}
