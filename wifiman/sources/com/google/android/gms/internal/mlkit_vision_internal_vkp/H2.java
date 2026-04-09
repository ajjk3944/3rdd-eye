package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class H2 extends AbstractC4625k1 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final H2 f35595d = new H2(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f35596b;

    /* renamed from: c, reason: collision with root package name */
    private int f35597c;

    private H2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f35596b = objArr;
        this.f35597c = i10;
    }

    public static H2 e() {
        return f35595d;
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35597c;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f35597c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f35597c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f35596b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f35596b, i10, objArr2, i12, this.f35597c - i10);
            this.f35596b = objArr2;
        }
        this.f35596b[i10] = obj;
        this.f35597c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f35596b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        g(i10);
        Object[] objArr = this.f35596b;
        Object obj = objArr[i10];
        if (i10 < this.f35597c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f35597c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        g(i10);
        Object[] objArr = this.f35596b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35597c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2
    public final /* bridge */ /* synthetic */ InterfaceC4582g2 zzd(int i10) {
        if (i10 >= this.f35597c) {
            return new H2(Arrays.copyOf(this.f35596b, i10), this.f35597c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f35597c;
        Object[] objArr = this.f35596b;
        if (i10 == objArr.length) {
            this.f35596b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f35596b;
        int i11 = this.f35597c;
        this.f35597c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
