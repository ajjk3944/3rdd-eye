package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o6 extends m5 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f19453d;

    /* renamed from: e, reason: collision with root package name */
    public static final o6 f19454e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19455b;

    /* renamed from: c, reason: collision with root package name */
    public int f19456c;

    static {
        Object[] objArr = new Object[0];
        f19453d = objArr;
        f19454e = new o6(objArr, 0, false);
    }

    public o6(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f19455b = objArr;
        this.f19456c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        a();
        if (i4 < 0 || i4 > (i10 = this.f19456c)) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f19456c, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        Object[] objArr = this.f19455b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i4, objArr, i11, i10 - i4);
        } else {
            Object[] objArr2 = new Object[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19455b, 0, objArr2, 0, i4);
            System.arraycopy(this.f19455b, i4, objArr2, i11, this.f19456c - i4);
            this.f19455b = objArr2;
        }
        this.f19455b[i4] = obj;
        this.f19456c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f19456c) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f19456c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5
    public final /* bridge */ /* synthetic */ z5 e(int i4) {
        if (i4 >= this.f19456c) {
            return new o6(i4 == 0 ? f19453d : Arrays.copyOf(this.f19455b, i4), this.f19456c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f19455b[i4];
    }

    @Override // com.google.android.gms.internal.consent_sdk.m5, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        c(i4);
        Object[] objArr = this.f19455b;
        Object obj = objArr[i4];
        if (i4 < this.f19456c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f19456c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        c(i4);
        Object[] objArr = this.f19455b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19456c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f19456c;
        int length = this.f19455b.length;
        if (i4 == length) {
            this.f19455b = Arrays.copyOf(this.f19455b, com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f19455b;
        int i10 = this.f19456c;
        this.f19456c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
