package com.google.ads.mediation.pangle;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class PangleConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.pangle");
    }

    public static AdError b() {
        return new AdError(103, "MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.", "com.google.ads.mediation.pangle");
    }

    public static AdError c(int i10, String str) {
        return new AdError(i10, str, "com.pangle.ads");
    }

    public static boolean d() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1;
    }
}
