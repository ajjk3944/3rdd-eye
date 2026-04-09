package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u5 extends t4 implements RandomAccess, l5, e6 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f19948d;

    /* renamed from: e, reason: collision with root package name */
    public static final u5 f19949e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f19950b;

    /* renamed from: c, reason: collision with root package name */
    public int f19951c;

    static {
        long[] jArr = new long[0];
        f19948d = jArr;
        f19949e = new u5(jArr, 0, false);
    }

    public u5(long[] jArr, int i4, boolean z3) {
        super(z3);
        this.f19950b = jArr;
        this.f19951c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f19951c)) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19951c, i4, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        long[] jArr = this.f19950b;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i4, jArr, i11, i10 - i4);
        } else {
            long[] jArr2 = new long[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19950b, 0, jArr2, 0, i4);
            System.arraycopy(this.f19950b, i4, jArr2, i11, this.f19951c - i4);
            this.f19950b = jArr2;
        }
        this.f19950b[i4] = jLongValue;
        this.f19951c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.f19843a;
        collection.getClass();
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u5Var = (u5) collection;
        int i4 = u5Var.f19951c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f19951c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        long[] jArr = this.f19950b;
        if (i11 > jArr.length) {
            this.f19950b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(u5Var.f19950b, 0, this.f19950b, this.f19951c, u5Var.f19951c);
        this.f19951c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i4) {
        g(i4);
        return this.f19950b[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final u5 P1(int i4) {
        if (i4 >= this.f19951c) {
            return new u5(i4 == 0 ? f19948d : Arrays.copyOf(this.f19950b, i4), this.f19951c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        if (this.f19951c != u5Var.f19951c) {
            return false;
        }
        long[] jArr = u5Var.f19950b;
        for (int i4 = 0; i4 < this.f19951c; i4++) {
            if (this.f19950b[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j) {
        a();
        int i4 = this.f19951c;
        int length = this.f19950b.length;
        if (i4 == length) {
            long[] jArr = new long[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19950b, 0, jArr, 0, this.f19951c);
            this.f19950b = jArr;
        }
        long[] jArr2 = this.f19950b;
        int i10 = this.f19951c;
        this.f19951c = i10 + 1;
        jArr2[i10] = j;
    }

    public final void g(int i4) {
        if (i4 < 0 || i4 >= this.f19951c) {
            throw new IndexOutOfBoundsException(vm1.a(this.f19951c, i4, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Long.valueOf(this.f19950b[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f19951c; i10++) {
            long j = this.f19950b[i10];
            Charset charset = n5.f19843a;
            i4 = (i4 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i4 = this.f19951c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f19950b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        g(i4);
        long[] jArr = this.f19950b;
        long j = jArr[i4];
        if (i4 < this.f19951c - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f19951c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19950b;
        System.arraycopy(jArr, i10, jArr, i4, this.f19951c - i10);
        this.f19951c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        g(i4);
        long[] jArr = this.f19950b;
        long j = jArr[i4];
        jArr[i4] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19951c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
