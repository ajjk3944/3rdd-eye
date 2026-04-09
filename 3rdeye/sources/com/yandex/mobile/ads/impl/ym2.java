package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ym2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final le1 f35928a;

    public ym2(le1 omSdkUsageValidator) {
        kotlin.jvm.internal.l.f(omSdkUsageValidator, "omSdkUsageValidator");
        this.f35928a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.qa2
    public final xm2 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (this.f35928a.a(context)) {
            return new xm2(context);
        }
        return null;
    }
}
