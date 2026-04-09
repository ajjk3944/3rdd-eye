package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class bg0 implements sc1<String> {

    /* renamed from: a, reason: collision with root package name */
    private final ni2<String> f25261a;

    public /* synthetic */ bg0() {
        this(new eg0());
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    public final ki2 a(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        return mc1.a(adConfiguration, this.f25261a);
    }

    public bg0(ni2<String> responseBodyParser) {
        kotlin.jvm.internal.l.f(responseBodyParser, "responseBodyParser");
        this.f25261a = responseBodyParser;
    }
}
