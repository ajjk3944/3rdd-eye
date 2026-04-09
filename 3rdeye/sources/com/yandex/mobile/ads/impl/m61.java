package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class m61 implements bq1<p61> {

    /* renamed from: a, reason: collision with root package name */
    private final cr1<p61> f30280a;

    public /* synthetic */ m61(Context context, mp1 mp1Var) {
        this(context, mp1Var, new t61(context, mp1Var));
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final p61 a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        return this.f30280a.a(networkResponse);
    }

    public m61(Context context, mp1 reporter, cr1<p61> nativeAdResponseParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdResponseParser, "nativeAdResponseParser");
        this.f30280a = nativeAdResponseParser;
    }
}
