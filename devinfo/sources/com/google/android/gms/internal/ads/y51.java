package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y51 extends x41 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f18648c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18649d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f18650e;

    public y51(Object[] objArr, int i4, int i10) {
        this.f18648c = objArr;
        this.f18649d = i4;
        this.f18650e = i10;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        mq0.f0(i4, this.f18650e);
        Object obj = this.f18648c[i4 + i4 + this.f18649d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18650e;
    }
}
