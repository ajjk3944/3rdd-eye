package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727e extends AbstractC1725c<Boolean> implements RandomAccess, Z {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f15594c;

    /* renamed from: d, reason: collision with root package name */
    public int f15595d;

    static {
        new C1727e(new boolean[0], 0).f15584b = false;
    }

    public C1727e() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i < 0 || i > (i10 = this.f15595d)) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15595d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        boolean[] zArr = this.f15594c;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i10 - i);
        } else {
            boolean[] zArr2 = new boolean[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f15594c, i, zArr2, i + 1, this.f15595d - i);
            this.f15594c = zArr2;
        }
        this.f15594c[i] = zBooleanValue;
        this.f15595d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = C1746y.f15707a;
        collection.getClass();
        if (!(collection instanceof C1727e)) {
            return super.addAll(collection);
        }
        C1727e c1727e = (C1727e) collection;
        int i = c1727e.f15595d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15595d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        boolean[] zArr = this.f15594c;
        if (i11 > zArr.length) {
            this.f15594c = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(c1727e.f15594c, 0, this.f15594c, this.f15595d, c1727e.f15595d);
        this.f15595d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z10) {
        b();
        int i = this.f15595d;
        boolean[] zArr = this.f15594c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f15594c = zArr2;
        }
        boolean[] zArr3 = this.f15594c;
        int i10 = this.f15595d;
        this.f15595d = i10 + 1;
        zArr3[i10] = z10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15595d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15595d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1727e)) {
            return super.equals(obj);
        }
        C1727e c1727e = (C1727e) obj;
        if (this.f15595d != c1727e.f15595d) {
            return false;
        }
        boolean[] zArr = c1727e.f15594c;
        for (int i = 0; i < this.f15595d; i++) {
            if (this.f15594c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Boolean.valueOf(this.f15594c[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f15595d; i10++) {
            int i11 = i * 31;
            boolean z10 = this.f15594c[i10];
            Charset charset = C1746y.f15707a;
            i = i11 + (z10 ? 1231 : 1237);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15595d) {
            return new C1727e(Arrays.copyOf(this.f15594c, i), this.f15595d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f15595d; i++) {
            if (obj.equals(Boolean.valueOf(this.f15594c[i]))) {
                boolean[] zArr = this.f15594c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f15595d - i) - 1);
                this.f15595d--;
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
        boolean[] zArr = this.f15594c;
        System.arraycopy(zArr, i10, zArr, i, this.f15595d - i10);
        this.f15595d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        c(i);
        boolean[] zArr = this.f15594c;
        boolean z10 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15595d;
    }

    public C1727e(boolean[] zArr, int i) {
        this.f15594c = zArr;
        this.f15595d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        boolean[] zArr = this.f15594c;
        boolean z10 = zArr[i];
        if (i < this.f15595d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f15595d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
