package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class v5 extends t4 implements RandomAccess, m5, f6 {

    /* renamed from: r, reason: collision with root package name */
    public static final long[] f5233r;

    /* renamed from: x, reason: collision with root package name */
    public static final v5 f5234x;

    /* renamed from: d, reason: collision with root package name */
    public long[] f5235d;

    /* renamed from: g, reason: collision with root package name */
    public int f5236g;

    static {
        long[] jArr = new long[0];
        f5233r = jArr;
        f5234x = new v5(jArr, 0, false);
    }

    public v5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f5235d = jArr;
        this.f5236g = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f5236g)) {
            throw new IndexOutOfBoundsException(v4.a(this.f5236g, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f5235d;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5235d, 0, jArr2, 0, i10);
            System.arraycopy(this.f5235d, i10, jArr2, i12, this.f5236g - i10);
            this.f5235d = jArr2;
        }
        this.f5235d[i10] = jLongValue;
        this.f5236g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = o5.f5148a;
        collection.getClass();
        if (!(collection instanceof v5)) {
            return super.addAll(collection);
        }
        v5 v5Var = (v5) collection;
        int i10 = v5Var.f5236g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5236g;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f5235d;
        if (i12 > jArr.length) {
            this.f5235d = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(v5Var.f5235d, 0, this.f5235d, this.f5236g, v5Var.f5236g);
        this.f5236g = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i10) {
        e(i10);
        return this.f5235d[i10];
    }

    @Override // com.google.android.gms.internal.measurement.n5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final v5 V(int i10) {
        if (i10 >= this.f5236g) {
            return new v5(i10 == 0 ? f5233r : Arrays.copyOf(this.f5235d, i10), this.f5236g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        a();
        int i10 = this.f5236g;
        int length = this.f5235d.length;
        if (i10 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5235d, 0, jArr, 0, this.f5236g);
            this.f5235d = jArr;
        }
        long[] jArr2 = this.f5235d;
        int i11 = this.f5236g;
        this.f5236g = i11 + 1;
        jArr2[i11] = j;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f5236g) {
            throw new IndexOutOfBoundsException(v4.a(this.f5236g, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return super.equals(obj);
        }
        v5 v5Var = (v5) obj;
        if (this.f5236g != v5Var.f5236g) {
            return false;
        }
        long[] jArr = v5Var.f5235d;
        for (int i10 = 0; i10 < this.f5236g; i10++) {
            if (this.f5235d[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        e(i10);
        return Long.valueOf(this.f5235d[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5236g; i11++) {
            long j = this.f5235d[i11];
            Charset charset = o5.f5148a;
            i10 = (i10 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f5236g;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5235d[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        e(i10);
        long[] jArr = this.f5235d;
        long j = jArr[i10];
        if (i10 < this.f5236g - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f5236g--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5235d;
        System.arraycopy(jArr, i11, jArr, i10, this.f5236g - i11);
        this.f5236g -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        e(i10);
        long[] jArr = this.f5235d;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5236g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
