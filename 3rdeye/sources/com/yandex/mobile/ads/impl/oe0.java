package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class oe0 implements jc {

    /* renamed from: a, reason: collision with root package name */
    private final re0 f31353a;

    /* renamed from: b, reason: collision with root package name */
    private final te0 f31354b;

    public /* synthetic */ oe0(Context context) {
        this(context, new re0(context), new te0(context));
    }

    @Override // com.yandex.mobile.ads.impl.jc
    public final ec a() {
        ec ecVarA = this.f31353a.a();
        return ecVarA == null ? this.f31354b.a() : ecVarA;
    }

    public oe0(Context context, re0 gmsClientAdvertisingInfoProvider, te0 gmsServiceAdvertisingInfoProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(gmsClientAdvertisingInfoProvider, "gmsClientAdvertisingInfoProvider");
        kotlin.jvm.internal.l.f(gmsServiceAdvertisingInfoProvider, "gmsServiceAdvertisingInfoProvider");
        this.f31353a = gmsClientAdvertisingInfoProvider;
        this.f31354b = gmsServiceAdvertisingInfoProvider;
    }
}
