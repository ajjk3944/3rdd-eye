package com.yandex.mobile.ads.impl;

import android.content.Intent;
import com.yandex.mobile.ads.impl.C4236y0;

/* renamed from: com.yandex.mobile.ads.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4174p0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f31552a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f31553b;

    public C4174p0(a8 adResponse, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31552a = adConfiguration;
        this.f31553b = adResponse;
    }

    public final C4236y0 a(Intent resultActivityIntent) {
        kotlin.jvm.internal.l.f(resultActivityIntent, "resultActivityIntent");
        return new C4236y0(new C4236y0.a(this.f31553b, this.f31552a, new f8()).a(resultActivityIntent));
    }
}
