package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u51 extends x41 {

    /* renamed from: e, reason: collision with root package name */
    public static final u51 f17096e = new u51(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f17097c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f17098d;

    public u51(Object[] objArr, int i4) {
        this.f17097c = objArr;
        this.f17098d = i4;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f17097c;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.f17098d;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        mq0.f0(i4, this.f17098d);
        Object obj = this.f17097c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x41, com.google.android.gms.internal.ads.t41
    public final int j(Object[] objArr, int i4) {
        Object[] objArr2 = this.f17097c;
        int i10 = this.f17098d;
        System.arraycopy(objArr2, 0, objArr, i4, i10);
        return i4 + i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17098d;
    }
}
