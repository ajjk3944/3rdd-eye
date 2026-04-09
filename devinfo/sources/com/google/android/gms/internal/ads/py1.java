package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class py1 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f15153a;

    /* renamed from: b, reason: collision with root package name */
    public final ii f15154b;

    public py1(d dVar, ii iiVar) {
        this.f15153a = dVar;
        this.f15154b = iiVar;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int K1(int i4) {
        return this.f15153a.K1(i4);
    }

    @Override // com.google.android.gms.internal.ads.d
    public final mx1 L1(int i4) {
        return this.f15154b.f12340d[this.f15153a.K1(i4)];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int P1(int i4) {
        return this.f15153a.P1(i4);
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof py1) {
            return this.f15153a.equals(((py1) obj).f15153a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final ii b() {
        return this.f15154b;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int c() {
        return this.f15153a.c();
    }

    public final boolean equals(Object obj) {
        if (a(obj) && (obj instanceof py1)) {
            return this.f15154b.equals(((py1) obj).f15154b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15154b.hashCode() + (this.f15153a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int z1() {
        return this.f15153a.z1();
    }

    @Override // com.google.android.gms.internal.ads.d
    public final mx1 zzc() {
        return this.f15154b.f12340d[this.f15153a.z1()];
    }
}
