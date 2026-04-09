package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fo1 extends rm1 implements RandomAccess, wn1, qo1 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f11246d;

    /* renamed from: e, reason: collision with root package name */
    public static final fo1 f11247e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f11248b;

    /* renamed from: c, reason: collision with root package name */
    public int f11249c;

    static {
        long[] jArr = new long[0];
        f11246d = jArr;
        f11247e = new fo1(jArr, 0, false);
    }

    public fo1(long[] jArr, int i4, boolean z3) {
        super(z3);
        this.f11248b = jArr;
        this.f11249c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f11249c)) {
            throw new IndexOutOfBoundsException(i(i4));
        }
        int i11 = i4 + 1;
        long[] jArr = this.f11248b;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i4, jArr, i11, i10 - i4);
        } else {
            long[] jArr2 = new long[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11248b, 0, jArr2, 0, i4);
            System.arraycopy(this.f11248b, i4, jArr2, i11, this.f11249c - i4);
            this.f11248b = jArr2;
        }
        this.f11248b[i4] = jLongValue;
        this.f11249c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = yn1.f18811a;
        collection.getClass();
        if (!(collection instanceof fo1)) {
            return super.addAll(collection);
        }
        fo1 fo1Var = (fo1) collection;
        int i4 = fo1Var.f11249c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f11249c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        long[] jArr = this.f11248b;
        if (i11 > jArr.length) {
            this.f11248b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(fo1Var.f11248b, 0, this.f11248b, this.f11249c, fo1Var.f11249c);
        this.f11249c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i4) {
        g(i4);
        return this.f11248b[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        a();
        int i4 = this.f11249c;
        int length = this.f11248b.length;
        if (i4 == length) {
            long[] jArr = new long[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11248b, 0, jArr, 0, this.f11249c);
            this.f11248b = jArr;
        }
        long[] jArr2 = this.f11248b;
        int i10 = this.f11249c;
        this.f11249c = i10 + 1;
        jArr2[i10] = j;
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo1)) {
            return super.equals(obj);
        }
        fo1 fo1Var = (fo1) obj;
        if (this.f11249c != fo1Var.f11249c) {
            return false;
        }
        long[] jArr = fo1Var.f11248b;
        for (int i4 = 0; i4 < this.f11249c; i4++) {
            if (this.f11248b[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fo1 n(int i4) {
        if (i4 >= this.f11249c) {
            return new fo1(i4 == 0 ? f11246d : Arrays.copyOf(this.f11248b, i4), this.f11249c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i4) {
        if (i4 < 0 || i4 >= this.f11249c) {
            throw new IndexOutOfBoundsException(i(i4));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Long.valueOf(this.f11248b[i4]);
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f11249c; i10++) {
            long j = this.f11248b[i10];
            Charset charset = yn1.f18811a;
            i4 = (i4 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i4;
    }

    public final String i(int i4) {
        int i10 = this.f11249c;
        return je.u.q(i4, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i4).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i4 = this.f11249c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f11248b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.rm1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        g(i4);
        long[] jArr = this.f11248b;
        long j = jArr[i4];
        if (i4 < this.f11249c - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f11249c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11248b;
        System.arraycopy(jArr, i10, jArr, i4, this.f11249c - i10);
        this.f11249c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        g(i4);
        long[] jArr = this.f11248b;
        long j = jArr[i4];
        jArr[i4] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11249c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
