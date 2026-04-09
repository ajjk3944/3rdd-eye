package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;

/* loaded from: classes3.dex */
public final class vx0 implements gx0<MediatedAppOpenAdAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final nx0<MediatedAppOpenAdAdapter> f34735a;

    public vx0(nx0<MediatedAppOpenAdAdapter> mediatedAdProvider) {
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        this.f34735a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final ex0<MediatedAppOpenAdAdapter> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f34735a.a(context, MediatedAppOpenAdAdapter.class);
    }
}
