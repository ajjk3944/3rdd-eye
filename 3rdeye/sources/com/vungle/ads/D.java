package com.vungle.ads;

import android.content.Context;

/* compiled from: InterstitialAd.kt */
/* loaded from: classes2.dex */
public final class D extends AbstractC4062u {
    public /* synthetic */ D(Context context, String str, C4045c c4045c, int i, kotlin.jvm.internal.g gVar) {
        this(context, str, (i & 4) != 0 ? new C4045c() : c4045c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context, String placementId, C4045c adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(placementId, "placementId");
        kotlin.jvm.internal.l.f(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.AbstractC4059q
    public E constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return new E(context);
    }
}
