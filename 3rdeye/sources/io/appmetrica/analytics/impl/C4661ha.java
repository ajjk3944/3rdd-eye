package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4661ha extends AbstractC4712ja {
    @Override // io.appmetrica.analytics.impl.AbstractC4712ja
    @TargetApi(24)
    public final C4738ka b(FeatureInfo featureInfo) {
        return new C4738ka(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
