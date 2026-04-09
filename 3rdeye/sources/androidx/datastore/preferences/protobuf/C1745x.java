package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745x extends AbstractC1725c<Integer> implements RandomAccess, Z {

    /* renamed from: c, reason: collision with root package name */
    public int[] f15705c;

    /* renamed from: d, reason: collision with root package name */
    public int f15706d;

    static {
        new C1745x(new int[0], 0).f15584b = false;
    }

    public C1745x() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i10 = this.f15706d)) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15706d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int[] iArr = this.f15705c;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i10 - i);
        } else {
            int[] iArr2 = new int[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f15705c, i, iArr2, i + 1, this.f15706d - i);
            this.f15705c = iArr2;
        }
        this.f15705c[i] = iIntValue;
        this.f15706d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = C1746y.f15707a;
        collection.getClass();
        if (!(collection instanceof C1745x)) {
            return super.addAll(collection);
        }
        C1745x c1745x = (C1745x) collection;
        int i = c1745x.f15706d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15706d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f15705c;
        if (i11 > iArr.length) {
            this.f15705c = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(c1745x.f15705c, 0, this.f15705c, this.f15706d, c1745x.f15706d);
        this.f15706d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        b();
        int i10 = this.f15706d;
        int[] iArr = this.f15705c;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f15705c = iArr2;
        }
        int[] iArr3 = this.f15705c;
        int i11 = this.f15706d;
        this.f15706d = i11 + 1;
        iArr3[i11] = i;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15706d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15706d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1745x)) {
            return super.equals(obj);
        }
        C1745x c1745x = (C1745x) obj;
        if (this.f15706d != c1745x.f15706d) {
            return false;
        }
        int[] iArr = c1745x.f15705c;
        for (int i = 0; i < this.f15706d; i++) {
            if (this.f15705c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Integer.valueOf(this.f15705c[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f15706d; i10++) {
            i = (i * 31) + this.f15705c[i10];
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15706d) {
            return new C1745x(Arrays.copyOf(this.f15705c, i), this.f15706d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f15706d; i++) {
            if (obj.equals(Integer.valueOf(this.f15705c[i]))) {
                int[] iArr = this.f15705c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f15706d - i) - 1);
                this.f15706d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        b();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15705c;
        System.arraycopy(iArr, i10, iArr, i, this.f15706d - i10);
        this.f15706d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        c(i);
        int[] iArr = this.f15705c;
        int i10 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15706d;
    }

    public C1745x(int[] iArr, int i) {
        this.f15705c = iArr;
        this.f15706d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        int[] iArr = this.f15705c;
        int i10 = iArr[i];
        if (i < this.f15706d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f15706d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
