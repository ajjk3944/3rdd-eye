package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class so1 extends rm1 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f16498d;

    /* renamed from: e, reason: collision with root package name */
    public static final so1 f16499e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f16500b;

    /* renamed from: c, reason: collision with root package name */
    public int f16501c;

    static {
        Object[] objArr = new Object[0];
        f16498d = objArr;
        f16499e = new so1(objArr, 0, false);
    }

    public so1(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f16500b = objArr;
        this.f16501c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        a();
        if (i4 < 0 || i4 > (i10 = this.f16501c)) {
            throw new IndexOutOfBoundsException(d(i4));
        }
        int i11 = i4 + 1;
        Object[] objArr = this.f16500b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i4, objArr, i11, i10 - i4);
        } else {
            Object[] objArr2 = new Object[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16500b, 0, objArr2, 0, i4);
            System.arraycopy(this.f16500b, i4, objArr2, i11, this.f16501c - i4);
            this.f16500b = objArr2;
        }
        this.f16500b[i4] = obj;
        this.f16501c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f16501c) {
            throw new IndexOutOfBoundsException(d(i4));
        }
    }

    public final String d(int i4) {
        int i10 = this.f16501c;
        return je.u.q(i4, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i4).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f16500b[i4];
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final /* bridge */ /* synthetic */ xn1 n(int i4) {
        if (i4 >= this.f16501c) {
            return new so1(i4 == 0 ? f16498d : Arrays.copyOf(this.f16500b, i4), this.f16501c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        c(i4);
        Object[] objArr = this.f16500b;
        Object obj = objArr[i4];
        if (i4 < this.f16501c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f16501c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        c(i4);
        Object[] objArr = this.f16500b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16501c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f16501c;
        int length = this.f16500b.length;
        if (i4 == length) {
            this.f16500b = Arrays.copyOf(this.f16500b, d7.n(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f16500b;
        int i10 = this.f16501c;
        this.f16501c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
