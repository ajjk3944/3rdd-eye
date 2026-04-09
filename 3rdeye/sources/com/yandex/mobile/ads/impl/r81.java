package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;

/* loaded from: classes3.dex */
public final class r81 {

    /* renamed from: a, reason: collision with root package name */
    private final kt f32554a;

    /* renamed from: b, reason: collision with root package name */
    private final ar1 f32555b;

    public r81(kt adAssets, ar1 responseNativeType) {
        kotlin.jvm.internal.l.f(adAssets, "adAssets");
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        this.f32554a = adAssets;
        this.f32555b = responseNativeType;
    }

    public static boolean a(mt image) {
        kotlin.jvm.internal.l.f(image, "image");
        return Constants.LARGE.equals(image.c()) || "wide".equals(image.c());
    }

    public final boolean b() {
        if (this.f32554a.g() != null) {
            return ar1.f24800d == this.f32555b || !e();
        }
        return false;
    }

    public final boolean c() {
        return (d() || this.f32554a.h() == null || !a(this.f32554a.h())) ? false : true;
    }

    public final boolean d() {
        return this.f32554a.i() != null;
    }

    public final boolean e() {
        return (d() || this.f32554a.h() == null || a(this.f32554a.h()) || ar1.f24800d == this.f32555b) ? false : true;
    }

    public final boolean a() {
        return (b() || this.f32554a.e() == null || !(d() || this.f32554a.h() == null || a(this.f32554a.h()))) ? false : true;
    }
}
