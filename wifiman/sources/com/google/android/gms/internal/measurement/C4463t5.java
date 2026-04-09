package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4463t5 extends P3 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f35480d;

    /* renamed from: e, reason: collision with root package name */
    private static final C4463t5 f35481e;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f35482b;

    /* renamed from: c, reason: collision with root package name */
    private int f35483c;

    static {
        Object[] objArr = new Object[0];
        f35480d = objArr;
        f35481e = new C4463t5(objArr, 0, false);
    }

    private C4463t5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f35482b = objArr;
        this.f35483c = i10;
    }

    private static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    public static C4463t5 g() {
        return f35481e;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35483c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35483c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f35483c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        Object[] objArr = this.f35482b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[f(objArr.length)];
            System.arraycopy(this.f35482b, 0, objArr2, 0, i10);
            System.arraycopy(this.f35482b, i10, objArr2, i10 + 1, this.f35483c - i10);
            this.f35482b = objArr2;
        }
        this.f35482b[i10] = obj;
        this.f35483c++;
        ((AbstractList) this).modCount++;
    }

    final void e(int i10) {
        Object[] objArr = this.f35482b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f35482b = new Object[Math.max(i10, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i10) {
            length = f(length);
        }
        this.f35482b = Arrays.copyOf(this.f35482b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        j(i10);
        return this.f35482b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        j(i10);
        Object[] objArr = this.f35482b;
        Object obj = objArr[i10];
        if (i10 < this.f35483c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f35483c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        j(i10);
        Object[] objArr = this.f35482b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35483c;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4 zza(int i10) {
        if (i10 >= this.f35483c) {
            return new C4463t5(i10 == 0 ? f35480d : Arrays.copyOf(this.f35482b, i10), this.f35483c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f35483c;
        Object[] objArr = this.f35482b;
        if (i10 == objArr.length) {
            this.f35482b = Arrays.copyOf(this.f35482b, f(objArr.length));
        }
        Object[] objArr2 = this.f35482b;
        int i11 = this.f35483c;
        this.f35483c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
