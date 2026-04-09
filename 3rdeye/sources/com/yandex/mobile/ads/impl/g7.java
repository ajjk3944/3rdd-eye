package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final ha f27563a;

    /* renamed from: b, reason: collision with root package name */
    private final ea f27564b;

    public g7(ha adVisibilityValidator, ea adViewRenderingValidator) {
        kotlin.jvm.internal.l.f(adVisibilityValidator, "adVisibilityValidator");
        kotlin.jvm.internal.l.f(adViewRenderingValidator, "adViewRenderingValidator");
        this.f27563a = adVisibilityValidator;
        this.f27564b = adViewRenderingValidator;
    }

    public final boolean a() {
        return this.f27563a.a() && this.f27564b.a();
    }
}
