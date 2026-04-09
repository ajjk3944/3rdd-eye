package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class d22 extends fc0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f25935b;

    public d22(rz rzVar, long j4) {
        super(rzVar);
        zf.a(rzVar.a() >= j4);
        this.f25935b = j4;
    }

    @Override // com.yandex.mobile.ads.impl.fc0, com.yandex.mobile.ads.impl.v70
    public final long a() {
        return super.a() - this.f25935b;
    }

    @Override // com.yandex.mobile.ads.impl.fc0, com.yandex.mobile.ads.impl.v70
    public final long b() {
        return super.b() - this.f25935b;
    }

    @Override // com.yandex.mobile.ads.impl.fc0, com.yandex.mobile.ads.impl.v70
    public final long d() {
        return super.d() - this.f25935b;
    }
}
