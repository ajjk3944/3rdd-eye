package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h6 extends t4 implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final Object[] f5058r;

    /* renamed from: x, reason: collision with root package name */
    public static final h6 f5059x;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5060d;

    /* renamed from: g, reason: collision with root package name */
    public int f5061g;

    static {
        Object[] objArr = new Object[0];
        f5058r = objArr;
        f5059x = new h6(objArr, 0, false);
    }

    public h6(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f5060d = objArr;
        this.f5061g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final /* bridge */ /* synthetic */ n5 V(int i10) {
        if (i10 >= this.f5061g) {
            return new h6(i10 == 0 ? f5058r : Arrays.copyOf(this.f5060d, i10), this.f5061g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f5061g)) {
            throw new IndexOutOfBoundsException(v4.a(this.f5061g, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f5060d;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5060d, 0, objArr2, 0, i10);
            System.arraycopy(this.f5060d, i10, objArr2, i12, this.f5061g - i10);
            this.f5060d = objArr2;
        }
        this.f5060d[i10] = obj;
        this.f5061g++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f5061g) {
            throw new IndexOutOfBoundsException(v4.a(this.f5061g, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return this.f5060d[i10];
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        Object[] objArr = this.f5060d;
        Object obj = objArr[i10];
        if (i10 < this.f5061g - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f5061g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        b(i10);
        Object[] objArr = this.f5060d;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5061g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f5061g;
        int length = this.f5060d.length;
        if (i10 == length) {
            this.f5060d = Arrays.copyOf(this.f5060d, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f5060d;
        int i11 = this.f5061g;
        this.f5061g = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
