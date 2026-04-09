package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q1 extends c1 implements RandomAccess, s1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20216d;

    /* renamed from: e, reason: collision with root package name */
    public static final q1 f20217e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f20218b;

    /* renamed from: c, reason: collision with root package name */
    public int f20219c;

    static {
        int[] iArr = new int[0];
        f20216d = iArr;
        f20217e = new q1(iArr, 0, false);
    }

    public q1(int[] iArr, int i4, boolean z3) {
        super(z3);
        this.f20218b = iArr;
        this.f20219c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f20219c)) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f20219c, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        int[] iArr = this.f20218b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i4, iArr, i11, i10 - i4);
        } else {
            int[] iArr2 = new int[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f20218b, 0, iArr2, 0, i4);
            System.arraycopy(this.f20218b, i4, iArr2, i11, this.f20219c - i4);
            this.f20218b = iArr2;
        }
        this.f20218b[i4] = iIntValue;
        this.f20219c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = u1.f20233a;
        collection.getClass();
        if (!(collection instanceof q1)) {
            return super.addAll(collection);
        }
        q1 q1Var = (q1) collection;
        int i4 = q1Var.f20219c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f20219c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        int[] iArr = this.f20218b;
        if (i11 > iArr.length) {
            this.f20218b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(q1Var.f20218b, 0, this.f20218b, this.f20219c, q1Var.f20219c);
        this.f20219c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i4) {
        f(i4);
        return this.f20218b[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4) {
        a();
        int i10 = this.f20219c;
        int length = this.f20218b.length;
        if (i10 == length) {
            int[] iArr = new int[d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f20218b, 0, iArr, 0, this.f20219c);
            this.f20218b = iArr;
        }
        int[] iArr2 = this.f20218b;
        int i11 = this.f20219c;
        this.f20219c = i11 + 1;
        iArr2[i11] = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final /* bridge */ /* synthetic */ t1 e(int i4) {
        if (i4 >= this.f20219c) {
            return new q1(i4 == 0 ? f20216d : Arrays.copyOf(this.f20218b, i4), this.f20219c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return super.equals(obj);
        }
        q1 q1Var = (q1) obj;
        if (this.f20219c != q1Var.f20219c) {
            return false;
        }
        int[] iArr = q1Var.f20218b;
        for (int i4 = 0; i4 < this.f20219c; i4++) {
            if (this.f20218b[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i4) {
        if (i4 < 0 || i4 >= this.f20219c) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f20219c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        f(i4);
        return Integer.valueOf(this.f20218b[i4]);
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f20219c; i10++) {
            i4 = (i4 * 31) + this.f20218b[i10];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f20219c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f20218b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.c1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        f(i4);
        int[] iArr = this.f20218b;
        int i10 = iArr[i4];
        if (i4 < this.f20219c - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f20219c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f20218b;
        System.arraycopy(iArr, i10, iArr, i4, this.f20219c - i10);
        this.f20219c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        f(i4);
        int[] iArr = this.f20218b;
        int i10 = iArr[i4];
        iArr[i4] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20219c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
