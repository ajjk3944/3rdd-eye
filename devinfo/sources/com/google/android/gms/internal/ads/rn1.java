package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rn1 extends rm1 implements RandomAccess, un1, qo1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f15713d;

    /* renamed from: e, reason: collision with root package name */
    public static final rn1 f15714e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15715b;

    /* renamed from: c, reason: collision with root package name */
    public int f15716c;

    static {
        int[] iArr = new int[0];
        f15713d = iArr;
        f15714e = new rn1(iArr, 0, false);
    }

    public rn1(int[] iArr, int i4, boolean z3) {
        super(z3);
        this.f15715b = iArr;
        this.f15716c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f15716c)) {
            throw new IndexOutOfBoundsException(i(i4));
        }
        int i11 = i4 + 1;
        int[] iArr = this.f15715b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i4, iArr, i11, i10 - i4);
        } else {
            int[] iArr2 = new int[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f15715b, 0, iArr2, 0, i4);
            System.arraycopy(this.f15715b, i4, iArr2, i11, this.f15716c - i4);
            this.f15715b = iArr2;
        }
        this.f15715b[i4] = iIntValue;
        this.f15716c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = yn1.f18811a;
        collection.getClass();
        if (!(collection instanceof rn1)) {
            return super.addAll(collection);
        }
        rn1 rn1Var = (rn1) collection;
        int i4 = rn1Var.f15716c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f15716c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        int[] iArr = this.f15715b;
        if (i11 > iArr.length) {
            this.f15715b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(rn1Var.f15715b, 0, this.f15715b, this.f15716c, rn1Var.f15716c);
        this.f15716c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final rn1 n(int i4) {
        if (i4 >= this.f15716c) {
            return new rn1(i4 == 0 ? f15713d : Arrays.copyOf(this.f15715b, i4), this.f15716c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        g(i4);
        return this.f15715b[i4];
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn1)) {
            return super.equals(obj);
        }
        rn1 rn1Var = (rn1) obj;
        if (this.f15716c != rn1Var.f15716c) {
            return false;
        }
        int[] iArr = rn1Var.f15715b;
        for (int i4 = 0; i4 < this.f15716c; i4++) {
            if (this.f15715b[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i4) {
        a();
        int i10 = this.f15716c;
        int length = this.f15715b.length;
        if (i10 == length) {
            int[] iArr = new int[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f15715b, 0, iArr, 0, this.f15716c);
            this.f15715b = iArr;
        }
        int[] iArr2 = this.f15715b;
        int i11 = this.f15716c;
        this.f15716c = i11 + 1;
        iArr2[i11] = i4;
    }

    public final void g(int i4) {
        if (i4 < 0 || i4 >= this.f15716c) {
            throw new IndexOutOfBoundsException(i(i4));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Integer.valueOf(this.f15715b[i4]);
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f15716c; i10++) {
            i4 = (i4 * 31) + this.f15715b[i10];
        }
        return i4;
    }

    public final String i(int i4) {
        int i10 = this.f15716c;
        return je.u.q(i4, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i4).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f15716c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f15715b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        g(i4);
        int[] iArr = this.f15715b;
        int i10 = iArr[i4];
        if (i4 < this.f15716c - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f15716c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15715b;
        System.arraycopy(iArr, i10, iArr, i4, this.f15716c - i10);
        this.f15716c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        g(i4);
        int[] iArr = this.f15715b;
        int i10 = iArr[i4];
        iArr[i4] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15716c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
