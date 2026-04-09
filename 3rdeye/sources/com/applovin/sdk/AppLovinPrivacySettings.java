package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.AbstractC2130l0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        k kVar = k.f21161C0;
        if (kVar != null) {
            return kVar.r0().a(i);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        k kVar = k.f21161C0;
        if (kVar != null) {
            return kVar.r0().b(i);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        k kVar = k.f21161C0;
        if (kVar != null) {
            return kVar.r0().c(i);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        k kVar = k.f21161C0;
        if (kVar != null) {
            return kVar.r0().d(i);
        }
        o.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
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

    public static void setDoNotSell(boolean z10) {
        setDoNotSell(z10, k.o());
    }

    public static void setHasUserConsent(boolean z10) {
        setHasUserConsent(z10, k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = AbstractC2130l0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = AbstractC2130l0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return AbstractC2130l0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return AbstractC2130l0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z10, Context context) {
        o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (AbstractC2130l0.a(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z10));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z10, Context context) {
        o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (AbstractC2130l0.b(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z10), null);
        }
    }
}
