package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* loaded from: classes3.dex */
public final class oy0 implements gx0<MediatedRewardedAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final nx0<MediatedRewardedAdapter> f31527a;

    public oy0(nx0<MediatedRewardedAdapter> mediatedAdProvider) {
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        this.f31527a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final ex0<MediatedRewardedAdapter> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f31527a.a(context, MediatedRewardedAdapter.class);
    }
}
