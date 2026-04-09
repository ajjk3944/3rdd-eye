package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a61 extends e51 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f9224i;
    public static final a61 j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f9225d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f9226e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f9227f;
    public final transient int g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f9228h;

    static {
        Object[] objArr = new Object[0];
        f9224i = objArr;
        j = new a61(0, 0, 0, objArr, objArr);
    }

    public a61(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f9225d = objArr;
        this.f9226e = i4;
        this.f9227f = objArr2;
        this.g = i10;
        this.f9228h = i11;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f9225d;
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9227f;
            if (objArr.length != 0) {
                int iR = yo0.r(obj);
                while (true) {
                    int i4 = iR & this.g;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iR = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.f9228h;
    }

    @Override // com.google.android.gms.internal.ads.e51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9226e;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int j(Object[] objArr, int i4) {
        Object[] objArr2 = this.f9225d;
        int i10 = this.f9228h;
        System.arraycopy(objArr2, 0, objArr, i4, i10);
        return i4 + i10;
    }

    @Override // com.google.android.gms.internal.ads.e51
    public final x41 p() {
        return x41.s(this.f9225d, this.f9228h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9228h;
    }
}
