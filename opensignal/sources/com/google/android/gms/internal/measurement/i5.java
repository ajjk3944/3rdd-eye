package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class i5 extends t4 implements RandomAccess, l5, f6 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f5075r;

    /* renamed from: x, reason: collision with root package name */
    public static final i5 f5076x;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5077d;

    /* renamed from: g, reason: collision with root package name */
    public int f5078g;

    static {
        int[] iArr = new int[0];
        f5075r = iArr;
        f5076x = new i5(iArr, 0, false);
    }

    public i5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f5077d = iArr;
        this.f5078g = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f5078g)) {
            throw new IndexOutOfBoundsException(v4.a(this.f5078g, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f5077d;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5077d, 0, iArr2, 0, i10);
            System.arraycopy(this.f5077d, i10, iArr2, i12, this.f5078g - i10);
            this.f5077d = iArr2;
        }
        this.f5077d[i10] = iIntValue;
        this.f5078g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = o5.f5148a;
        collection.getClass();
        if (!(collection instanceof i5)) {
            return super.addAll(collection);
        }
        i5 i5Var = (i5) collection;
        int i10 = i5Var.f5078g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5078g;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f5077d;
        if (i12 > iArr.length) {
            this.f5077d = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(i5Var.f5077d, 0, this.f5077d, this.f5078g, i5Var.f5078g);
        this.f5078g = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i5 V(int i10) {
        if (i10 >= this.f5078g) {
            return new i5(i10 == 0 ? f5075r : Arrays.copyOf(this.f5077d, i10), this.f5078g, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i10) {
        e(i10);
        return this.f5077d[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        a();
        int i11 = this.f5078g;
        int length = this.f5077d.length;
        if (i11 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5077d, 0, iArr, 0, this.f5078g);
            this.f5077d = iArr;
        }
        int[] iArr2 = this.f5077d;
        int i12 = this.f5078g;
        this.f5078g = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f5078g) {
            throw new IndexOutOfBoundsException(v4.a(this.f5078g, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return super.equals(obj);
        }
        i5 i5Var = (i5) obj;
        if (this.f5078g != i5Var.f5078g) {
            return false;
        }
        int[] iArr = i5Var.f5077d;
        for (int i10 = 0; i10 < this.f5078g; i10++) {
            if (this.f5077d[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        e(i10);
        return Integer.valueOf(this.f5077d[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5078g; i11++) {
            i10 = (i10 * 31) + this.f5077d[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f5078g;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5077d[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        e(i10);
        int[] iArr = this.f5077d;
        int i11 = iArr[i10];
        if (i10 < this.f5078g - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f5078g--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5077d;
        System.arraycopy(iArr, i11, iArr, i10, this.f5078g - i11);
        this.f5078g -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        e(i10);
        int[] iArr = this.f5077d;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5078g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
