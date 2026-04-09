package com.vungle.ads;

import a6.C1661j;
import android.content.Context;

/* compiled from: InterstitialAd.kt */
/* loaded from: classes2.dex */
public final class E extends AbstractC4067z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(C1661j placement) {
        kotlin.jvm.internal.l.f(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}
