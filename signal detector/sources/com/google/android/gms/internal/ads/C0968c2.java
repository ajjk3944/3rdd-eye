package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968c2 implements InterfaceC0914b2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f13513a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13515c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13516d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13517e;

    public C0968c2(long[] jArr, long[] jArr2, long j6, long j7, int i) {
        this.f13513a = jArr;
        this.f13514b = jArr2;
        this.f13515c = j6;
        this.f13516d = j7;
        this.f13517e = i;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f13515c;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long d() {
        return this.f13516d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final int e() {
        return this.f13517e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long g(long j6) {
        return this.f13513a[Vt.q(this.f13514b, j6, true)];
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        long[] jArr = this.f13513a;
        int iQ = Vt.q(jArr, j6, true);
        long j7 = jArr[iQ];
        long[] jArr2 = this.f13514b;
        M0 m02 = new M0(j7, jArr2[iQ]);
        if (j7 >= j6 || iQ == jArr.length - 1) {
            return new K0(m02, m02);
        }
        int i = iQ + 1;
        return new K0(m02, new M0(jArr[i], jArr2[i]));
    }
}
