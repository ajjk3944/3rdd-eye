package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g6 extends t4 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f19755d;

    /* renamed from: e, reason: collision with root package name */
    public static final g6 f19756e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19757b;

    /* renamed from: c, reason: collision with root package name */
    public int f19758c;

    static {
        Object[] objArr = new Object[0];
        f19755d = objArr;
        f19756e = new g6(objArr, 0, false);
    }

    public g6(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f19757b = objArr;
        this.f19758c = i4;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final /* bridge */ /* synthetic */ m5 P1(int i4) {
        if (i4 >= this.f19758c) {
            return new g6(i4 == 0 ? f19755d : Arrays.copyOf(this.f19757b, i4), this.f19758c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        a();
        if (i4 < 0 || i4 > (i10 = this.f19758c)) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19758c, i4, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        Object[] objArr = this.f19757b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i4, objArr, i11, i10 - i4);
        } else {
            Object[] objArr2 = new Object[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19757b, 0, objArr2, 0, i4);
            System.arraycopy(this.f19757b, i4, objArr2, i11, this.f19758c - i4);
            this.f19757b = objArr2;
        }
        this.f19757b[i4] = obj;
        this.f19758c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f19758c) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19758c, i4, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f19757b[i4];
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        c(i4);
        Object[] objArr = this.f19757b;
        Object obj = objArr[i4];
        if (i4 < this.f19758c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f19758c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        c(i4);
        Object[] objArr = this.f19757b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19758c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f19758c;
        int length = this.f19757b.length;
        if (i4 == length) {
            this.f19757b = Arrays.copyOf(this.f19757b, com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f19757b;
        int i10 = this.f19758c;
        this.f19758c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
