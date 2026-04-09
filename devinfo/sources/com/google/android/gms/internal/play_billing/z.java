package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z extends q {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f20270c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20271d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f20272e;

    public z(Object[] objArr, int i4, int i10) {
        this.f20270c = objArr;
        this.f20271d = i4;
        this.f20272e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        ii.a.H(i4, this.f20272e);
        Object obj = this.f20270c[i4 + i4 + this.f20271d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20272e;
    }
}
