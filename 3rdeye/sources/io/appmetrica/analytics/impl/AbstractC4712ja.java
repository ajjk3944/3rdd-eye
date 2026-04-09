package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4712ja {
    public final C4738ka a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new C4738ka("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    public abstract C4738ka b(FeatureInfo featureInfo);
}
