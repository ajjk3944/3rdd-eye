package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v extends q {

    /* renamed from: e, reason: collision with root package name */
    public static final v f20241e = new v(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f20242c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20243d;

    public v(Object[] objArr, int i4) {
        this.f20242c = objArr;
        this.f20243d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.q, com.google.android.gms.internal.play_billing.n
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f20242c;
        int i4 = this.f20243d;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int c() {
        return this.f20243d;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        ii.a.H(i4, this.f20243d);
        Object obj = this.f20242c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final Object[] i() {
        return this.f20242c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20243d;
    }
}
