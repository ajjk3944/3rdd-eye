package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4687ia extends AbstractC4712ja {
    @Override // io.appmetrica.analytics.impl.AbstractC4712ja
    public final C4738ka b(FeatureInfo featureInfo) {
        return new C4738ka(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
