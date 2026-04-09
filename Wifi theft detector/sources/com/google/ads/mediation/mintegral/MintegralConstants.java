package com.google.ads.mediation.mintegral;

import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.out.MBConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class MintegralConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError b(int i10, String str) {
        return new AdError(i10, str, MBConfiguration.LOG_TAG);
    }
}
