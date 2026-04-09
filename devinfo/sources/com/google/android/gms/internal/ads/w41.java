package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w41 extends x41 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f17887c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f17888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x41 f17889e;

    public w41(x41 x41Var, int i4, int i10) {
        this.f17889e = x41Var;
        this.f17887c = i4;
        this.f17888d = i10;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f17889e.c();
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int d() {
        return this.f17889e.d() + this.f17887c;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.f17889e.d() + this.f17887c + this.f17888d;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        mq0.f0(i4, this.f17888d);
        return this.f17889e.get(i4 + this.f17887c);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x41, java.util.List
    /* renamed from: k */
    public final x41 subList(int i4, int i10) {
        mq0.h0(i4, i10, this.f17888d);
        int i11 = this.f17887c;
        return this.f17889e.subList(i4 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17888d;
    }
}
