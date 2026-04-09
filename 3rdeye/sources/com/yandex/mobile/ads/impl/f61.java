package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class f61 implements sc1<p61> {

    /* renamed from: a, reason: collision with root package name */
    private final bq1<p61> f27210a;

    /* renamed from: b, reason: collision with root package name */
    private final ni2<p61> f27211b;

    public /* synthetic */ f61(bq1 bq1Var) {
        this(bq1Var, new q61(bq1Var));
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    public final ki2 a(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        return mc1.a(adConfiguration, this.f27211b);
    }

    public f61(bq1<p61> requestPolicy, ni2<p61> responseBodyParser) {
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(responseBodyParser, "responseBodyParser");
        this.f27210a = requestPolicy;
        this.f27211b = responseBodyParser;
    }
}
