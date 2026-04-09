package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class or {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f31486a;

    /* renamed from: b, reason: collision with root package name */
    private final cq f31487b;

    public or(ew1 sdkSettings, cq cmpSettings) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(cmpSettings, "cmpSettings");
        this.f31486a = sdkSettings;
        this.f31487b = cmpSettings;
    }

    public final vw a() {
        String strC;
        String strA;
        boolean zC = this.f31486a.c();
        Boolean boolE = this.f31486a.e();
        Boolean boolI = this.f31486a.i();
        String strB = this.f31487b.b();
        return new vw(zC, boolE, boolI, ((strB == null || y9.q.i0(strB)) && ((strC = this.f31487b.c()) == null || y9.q.i0(strC)) && ((strA = this.f31487b.a()) == null || y9.q.i0(strA))) ? false : true);
    }
}
