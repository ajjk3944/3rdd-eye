package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;

/* loaded from: classes3.dex */
public final class wx0 implements gx0<MediatedBannerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final nx0<MediatedBannerAdapter> f35107a;

    public wx0(nx0<MediatedBannerAdapter> mediatedAdProvider) {
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        this.f35107a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final ex0<MediatedBannerAdapter> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f35107a.a(context, MediatedBannerAdapter.class);
    }
}
