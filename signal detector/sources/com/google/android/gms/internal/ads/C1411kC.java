package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.kC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411kC extends LB {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f15071c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15072d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f15073e;

    public C1411kC(Object[] objArr, int i, int i3) {
        this.f15071c = objArr;
        this.f15072d = i;
        this.f15073e = i3;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0582Jp.k0(i, this.f15073e);
        Object obj = this.f15071c[i + i + this.f15072d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15073e;
    }
}
