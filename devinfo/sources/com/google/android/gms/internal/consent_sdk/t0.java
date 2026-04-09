package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f19517e = new t0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f19518c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f19519d;

    public t0(Object[] objArr, int i4) {
        this.f19518c = objArr;
        this.f19519d = i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q0, com.google.android.gms.internal.consent_sdk.n0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f19518c;
        int i4 = this.f19519d;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int c() {
        return this.f19519d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final Object[] f() {
        return this.f19518c;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        l0.b(i4, this.f19519d);
        Object obj = this.f19518c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19519d;
    }
}
