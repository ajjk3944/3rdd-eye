package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j2 extends c1 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f20160d;

    /* renamed from: e, reason: collision with root package name */
    public static final j2 f20161e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20162b;

    /* renamed from: c, reason: collision with root package name */
    public int f20163c;

    static {
        Object[] objArr = new Object[0];
        f20160d = objArr;
        f20161e = new j2(objArr, 0, false);
    }

    public j2(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f20162b = objArr;
        this.f20163c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        a();
        if (i4 < 0 || i4 > (i10 = this.f20163c)) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f20163c, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        Object[] objArr = this.f20162b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i4, objArr, i11, i10 - i4);
        } else {
            Object[] objArr2 = new Object[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f20162b, 0, objArr2, 0, i4);
            System.arraycopy(this.f20162b, i4, objArr2, i11, this.f20163c - i4);
            this.f20162b = objArr2;
        }
        this.f20162b[i4] = obj;
        this.f20163c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f20163c) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f20163c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final /* bridge */ /* synthetic */ t1 e(int i4) {
        if (i4 >= this.f20163c) {
            return new j2(i4 == 0 ? f20160d : Arrays.copyOf(this.f20162b, i4), this.f20163c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f20162b[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        c(i4);
        Object[] objArr = this.f20162b;
        Object obj = objArr[i4];
        if (i4 < this.f20163c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f20163c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        c(i4);
        Object[] objArr = this.f20162b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20163c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f20163c;
        int length = this.f20162b.length;
        if (i4 == length) {
            this.f20162b = Arrays.copyOf(this.f20162b, d7.n(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f20162b;
        int i10 = this.f20163c;
        this.f20163c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
