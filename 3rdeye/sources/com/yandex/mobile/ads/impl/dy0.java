package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* loaded from: classes3.dex */
public final class dy0 implements gx0<MediatedInterstitialAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final nx0<MediatedInterstitialAdapter> f26552a;

    public dy0(nx0<MediatedInterstitialAdapter> mediatedAdProvider) {
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        this.f26552a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final ex0<MediatedInterstitialAdapter> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f26552a.a(context, MediatedInterstitialAdapter.class);
    }
}
