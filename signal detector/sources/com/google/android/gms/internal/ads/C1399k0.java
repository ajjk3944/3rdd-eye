package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399k0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1507m0 f15032a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15033b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15034c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15035d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15036e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15037f;

    public C1399k0(InterfaceC1507m0 interfaceC1507m0, long j6, long j7, long j8, long j9, long j10) {
        this.f15032a = interfaceC1507m0;
        this.f15033b = j6;
        this.f15034c = j7;
        this.f15035d = j8;
        this.f15036e = j9;
        this.f15037f = j10;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f15033b;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        M0 m02 = new M0(j6, C1453l0.a(this.f15032a.g(j6), 0L, this.f15034c, this.f15035d, this.f15036e, this.f15037f));
        return new K0(m02, m02);
    }
}
