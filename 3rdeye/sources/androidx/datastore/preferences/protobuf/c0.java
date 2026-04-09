package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
public final class c0<E> extends AbstractC1725c<E> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final c0<Object> f15585e;

    /* renamed from: c, reason: collision with root package name */
    public E[] f15586c;

    /* renamed from: d, reason: collision with root package name */
    public int f15587d;

    static {
        c0<Object> c0Var = new c0<>(new Object[0], 0);
        f15585e = c0Var;
        c0Var.f15584b = false;
    }

    public c0(E[] eArr, int i) {
        this.f15586c = eArr;
        this.f15587d = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        b();
        int i = this.f15587d;
        E[] eArr = this.f15586c;
        if (i == eArr.length) {
            this.f15586c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15586c;
        int i10 = this.f15587d;
        this.f15587d = i10 + 1;
        eArr2[i10] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15587d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15587d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        c(i);
        return this.f15586c[i];
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15587d) {
            return new c0(Arrays.copyOf(this.f15586c, i), this.f15587d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        b();
        c(i);
        E[] eArr = this.f15586c;
        E e4 = eArr[i];
        if (i < this.f15587d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.f15587d--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e4) {
        b();
        c(i);
        E[] eArr = this.f15586c;
        E e10 = eArr[i];
        eArr[i] = e4;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15587d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e4) {
        int i10;
        b();
        if (i >= 0 && i <= (i10 = this.f15587d)) {
            E[] eArr = this.f15586c;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i10 - i);
            } else {
                E[] eArr2 = (E[]) new Object[C1094a9.d(i10, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f15586c, i, eArr2, i + 1, this.f15587d - i);
                this.f15586c = eArr2;
            }
            this.f15586c[i] = e4;
            this.f15587d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
        sbJ.append(this.f15587d);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
