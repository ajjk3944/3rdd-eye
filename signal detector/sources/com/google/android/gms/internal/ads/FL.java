package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class FL extends GK implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f8087d;

    /* renamed from: e, reason: collision with root package name */
    public static final FL f8088e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8089b;

    /* renamed from: c, reason: collision with root package name */
    public int f8090c;

    static {
        Object[] objArr = new Object[0];
        f8087d = objArr;
        f8088e = new FL(objArr, 0, false);
    }

    public FL(Object[] objArr, int i, boolean z6) {
        super(z6);
        this.f8089b = objArr;
        this.f8090c = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474lL
    public final /* bridge */ /* synthetic */ InterfaceC1474lL B(int i) {
        if (i >= this.f8090c) {
            return new FL(i == 0 ? f8087d : Arrays.copyOf(this.f8089b, i), this.f8090c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        a();
        if (i < 0 || i > (i3 = this.f8090c)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        int i6 = i + 1;
        Object[] objArr = this.f8089b;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i, objArr, i6, i3 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f8089b, 0, objArr2, 0, i);
            System.arraycopy(this.f8089b, i, objArr2, i6, this.f8090c - i);
            this.f8089b = objArr2;
        }
        this.f8089b[i] = obj;
        this.f8090c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f8090c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    public final String c(int i) {
        int i3 = this.f8090c;
        return A.f.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i3).length()), "Index:", i, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f8089b[i];
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f8089b;
        Object obj = objArr[i];
        if (i < this.f8090c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f8090c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f8089b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8090c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f8090c;
        int length = this.f8089b.length;
        if (i == length) {
            this.f8089b = Arrays.copyOf(this.f8089b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f8089b;
        int i3 = this.f8090c;
        this.f8090c = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
