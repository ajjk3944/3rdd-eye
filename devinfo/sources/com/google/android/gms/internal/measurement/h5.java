package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h5 extends t4 implements RandomAccess, k5, e6 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f19765d;

    /* renamed from: e, reason: collision with root package name */
    public static final h5 f19766e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19767b;

    /* renamed from: c, reason: collision with root package name */
    public int f19768c;

    static {
        int[] iArr = new int[0];
        f19765d = iArr;
        f19766e = new h5(iArr, 0, false);
    }

    public h5(int[] iArr, int i4, boolean z3) {
        super(z3);
        this.f19767b = iArr;
        this.f19768c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f19768c)) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19768c, i4, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        int[] iArr = this.f19767b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i4, iArr, i11, i10 - i4);
        } else {
            int[] iArr2 = new int[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19767b, 0, iArr2, 0, i4);
            System.arraycopy(this.f19767b, i4, iArr2, i11, this.f19768c - i4);
            this.f19767b = iArr2;
        }
        this.f19767b[i4] = iIntValue;
        this.f19768c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.f19843a;
        collection.getClass();
        if (!(collection instanceof h5)) {
            return super.addAll(collection);
        }
        h5 h5Var = (h5) collection;
        int i4 = h5Var.f19768c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f19768c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        int[] iArr = this.f19767b;
        if (i11 > iArr.length) {
            this.f19767b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(h5Var.f19767b, 0, this.f19767b, this.f19768c, h5Var.f19768c);
        this.f19768c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h5 P1(int i4) {
        if (i4 >= this.f19768c) {
            return new h5(i4 == 0 ? f19765d : Arrays.copyOf(this.f19767b, i4), this.f19768c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        g(i4);
        return this.f19767b[i4];
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return super.equals(obj);
        }
        h5 h5Var = (h5) obj;
        if (this.f19768c != h5Var.f19768c) {
            return false;
        }
        int[] iArr = h5Var.f19767b;
        for (int i4 = 0; i4 < this.f19768c; i4++) {
            if (this.f19767b[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i4) {
        a();
        int i10 = this.f19768c;
        int length = this.f19767b.length;
        if (i10 == length) {
            int[] iArr = new int[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19767b, 0, iArr, 0, this.f19768c);
            this.f19767b = iArr;
        }
        int[] iArr2 = this.f19767b;
        int i11 = this.f19768c;
        this.f19768c = i11 + 1;
        iArr2[i11] = i4;
    }

    public final void g(int i4) {
        if (i4 < 0 || i4 >= this.f19768c) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19768c, i4, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Integer.valueOf(this.f19767b[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f19768c; i10++) {
            i4 = (i4 * 31) + this.f19767b[i10];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f19768c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f19767b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        g(i4);
        int[] iArr = this.f19767b;
        int i10 = iArr[i4];
        if (i4 < this.f19768c - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f19768c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19767b;
        System.arraycopy(iArr, i10, iArr, i4, this.f19768c - i10);
        this.f19768c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        g(i4);
        int[] iArr = this.f19767b;
        int i10 = iArr[i4];
        iArr[i4] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19768c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
