package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hn0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11927b;

    public hn0(String str, int i4) {
        this.f11926a = str;
        this.f11927b = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        return yo0.e(new am0(this.f11926a, this.f11927b, 1));
    }
}
