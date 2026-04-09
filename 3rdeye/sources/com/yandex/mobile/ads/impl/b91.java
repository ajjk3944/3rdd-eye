package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;

/* loaded from: classes3.dex */
public final class b91 {

    /* renamed from: a, reason: collision with root package name */
    private final kt f25145a;

    /* renamed from: b, reason: collision with root package name */
    private final ar1 f25146b;

    public b91(kt adAssets, ar1 responseNativeType) {
        kotlin.jvm.internal.l.f(adAssets, "adAssets");
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        this.f25145a = adAssets;
        this.f25146b = responseNativeType;
    }

    private final boolean b() {
        if (this.f25145a.c() != null) {
            return ar1.f24799c == this.f25146b || !d();
        }
        return false;
    }

    private final boolean d() {
        return (this.f25145a.k() == null && this.f25145a.l() == null) ? false : true;
    }

    public final boolean a() {
        return (this.f25145a.n() == null && this.f25145a.b() == null && this.f25145a.d() == null && this.f25145a.g() == null && this.f25145a.e() == null) ? false : true;
    }

    public final boolean c() {
        if (this.f25145a.h() != null) {
            return Constants.LARGE.equals(this.f25145a.h().c()) || "wide".equals(this.f25145a.h().c());
        }
        return false;
    }

    public final boolean e() {
        return (this.f25145a.a() == null && this.f25145a.m() == null && !a()) ? false : true;
    }

    public final boolean f() {
        return this.f25145a.c() != null || d();
    }

    public final boolean g() {
        return b();
    }

    public final boolean h() {
        if (this.f25145a.c() != null) {
            return b() || c();
        }
        return false;
    }

    public final boolean i() {
        return this.f25145a.o() != null;
    }

    public final boolean j() {
        if (b()) {
            return true;
        }
        return c() && !d();
    }
}
