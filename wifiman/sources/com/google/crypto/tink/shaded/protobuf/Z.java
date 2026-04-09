package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class Z extends AbstractC5076c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Z f38478d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f38479b;

    /* renamed from: c, reason: collision with root package name */
    private int f38480c;

    static {
        Z z10 = new Z(new Object[0], 0);
        f38478d = z10;
        z10.n();
    }

    private Z(Object[] objArr, int i10) {
        this.f38479b = objArr;
        this.f38480c = i10;
    }

    private static Object[] e(int i10) {
        return new Object[i10];
    }

    public static Z f() {
        return f38478d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f38480c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f38480c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        int i10 = this.f38480c;
        Object[] objArr = this.f38479b;
        if (i10 == objArr.length) {
            this.f38479b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f38479b;
        int i11 = this.f38480c;
        this.f38480c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        g(i10);
        return this.f38479b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5097y.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Z p(int i10) {
        if (i10 >= this.f38480c) {
            return new Z(Arrays.copyOf(this.f38479b, i10), this.f38480c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5076c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        b();
        g(i10);
        Object[] objArr = this.f38479b;
        Object obj = objArr[i10];
        if (i10 < this.f38480c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f38480c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        b();
        g(i10);
        Object[] objArr = this.f38479b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38480c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f38480c)) {
            Object[] objArr = this.f38479b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrE = e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f38479b, 0, objArrE, 0, i10);
                System.arraycopy(this.f38479b, i10, objArrE, i10 + 1, this.f38480c - i10);
                this.f38479b = objArrE;
            }
            this.f38479b[i10] = obj;
            this.f38480c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i10));
    }
}
