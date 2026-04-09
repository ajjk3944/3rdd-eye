package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class up implements z42 {

    /* renamed from: a, reason: collision with root package name */
    private long f34172a;

    /* renamed from: b, reason: collision with root package name */
    private long f34173b;

    public final long a() {
        return this.f34172a;
    }

    public final void b() {
        this.f34172a += this.f34173b;
        this.f34173b = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.z42
    public final void a(long j4, long j10) {
        this.f34173b = j10;
    }
}
