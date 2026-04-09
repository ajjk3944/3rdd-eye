package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197gC extends LB {

    /* renamed from: e, reason: collision with root package name */
    public static final C1197gC f14227e = new C1197gC(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f14228c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14229d;

    public C1197gC(int i, Object[] objArr) {
        this.f14228c = objArr;
        this.f14229d = i;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final Object[] b() {
        return this.f14228c;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int d() {
        return this.f14229d;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.LB, com.google.android.gms.internal.ads.HB
    public final int g(Object[] objArr, int i) {
        Object[] objArr2 = this.f14228c;
        int i3 = this.f14229d;
        System.arraycopy(objArr2, 0, objArr, i, i3);
        return i + i3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0582Jp.k0(i, this.f14229d);
        Object obj = this.f14228c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14229d;
    }
}
