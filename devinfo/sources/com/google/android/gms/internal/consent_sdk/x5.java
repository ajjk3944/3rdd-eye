package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x5 extends m5 implements RandomAccess, y5 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f19564d;

    /* renamed from: e, reason: collision with root package name */
    public static final x5 f19565e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19566b;

    /* renamed from: c, reason: collision with root package name */
    public int f19567c;

    static {
        int[] iArr = new int[0];
        f19564d = iArr;
        f19565e = new x5(iArr, 0, false);
    }

    public x5(int[] iArr, int i4, boolean z3) {
        super(z3);
        this.f19566b = iArr;
        this.f19567c = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i4 < 0 || i4 > (i10 = this.f19567c)) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f19567c, "Index:", ", Size:"));
        }
        int i11 = i4 + 1;
        int[] iArr = this.f19566b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i4, iArr, i11, i10 - i4);
        } else {
            int[] iArr2 = new int[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19566b, 0, iArr2, 0, i4);
            System.arraycopy(this.f19566b, i4, iArr2, i11, this.f19567c - i4);
            this.f19566b = iArr2;
        }
        this.f19566b[i4] = iIntValue;
        this.f19567c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = a6.f19264a;
        collection.getClass();
        if (!(collection instanceof x5)) {
            return super.addAll(collection);
        }
        x5 x5Var = (x5) collection;
        int i4 = x5Var.f19567c;
        if (i4 == 0) {
            return false;
        }
        int i10 = this.f19567c;
        if (Integer.MAX_VALUE - i10 < i4) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i4;
        int[] iArr = this.f19566b;
        if (i11 > iArr.length) {
            this.f19566b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(x5Var.f19566b, 0, this.f19566b, this.f19567c, x5Var.f19567c);
        this.f19567c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i4) {
        d(i4);
        return this.f19566b[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4) {
        if (i4 < 0 || i4 >= this.f19567c) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, this.f19567c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5
    public final /* bridge */ /* synthetic */ z5 e(int i4) {
        if (i4 >= this.f19567c) {
            return new x5(i4 == 0 ? f19564d : Arrays.copyOf(this.f19566b, i4), this.f19567c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.m5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return super.equals(obj);
        }
        x5 x5Var = (x5) obj;
        if (this.f19567c != x5Var.f19567c) {
            return false;
        }
        int[] iArr = x5Var.f19566b;
        for (int i4 = 0; i4 < this.f19567c; i4++) {
            if (this.f19566b[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        d(i4);
        return Integer.valueOf(this.f19566b[i4]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.m5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f19567c; i10++) {
            i4 = (i4 * 31) + this.f19566b[i10];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f19567c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f19566b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        a();
        d(i4);
        int[] iArr = this.f19566b;
        int i10 = iArr[i4];
        if (i4 < this.f19567c - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f19567c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        a();
        if (i10 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19566b;
        System.arraycopy(iArr, i10, iArr, i4, this.f19567c - i10);
        this.f19567c -= i10 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        d(i4);
        int[] iArr = this.f19566b;
        int i10 = iArr[i4];
        iArr[i4] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19567c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        int i4 = this.f19567c;
        int length = this.f19566b.length;
        if (i4 == length) {
            int[] iArr = new int[com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19566b, 0, iArr, 0, this.f19567c);
            this.f19566b = iArr;
        }
        int[] iArr2 = this.f19566b;
        int i10 = this.f19567c;
        this.f19567c = i10 + 1;
        iArr2[i10] = iIntValue;
        return true;
    }
}
