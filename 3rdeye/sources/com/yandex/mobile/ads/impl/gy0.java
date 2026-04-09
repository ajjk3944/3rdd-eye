package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* loaded from: classes3.dex */
public final class gy0 implements gx0<MediatedNativeAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final nx0<MediatedNativeAdapter> f28032a;

    public gy0(nx0<MediatedNativeAdapter> mediatedAdProvider) {
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        this.f28032a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final ex0<MediatedNativeAdapter> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f28032a.a(context, MediatedNativeAdapter.class);
    }
}
