package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735m extends AbstractC1725c<Double> implements RandomAccess, Z {

    /* renamed from: c, reason: collision with root package name */
    public double[] f15667c;

    /* renamed from: d, reason: collision with root package name */
    public int f15668d;

    static {
        new C1735m(new double[0], 0).f15584b = false;
    }

    public C1735m() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i < 0 || i > (i10 = this.f15668d)) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15668d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        double[] dArr = this.f15667c;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i10 - i);
        } else {
            double[] dArr2 = new double[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f15667c, i, dArr2, i + 1, this.f15668d - i);
            this.f15667c = dArr2;
        }
        this.f15667c[i] = dDoubleValue;
        this.f15668d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = C1746y.f15707a;
        collection.getClass();
        if (!(collection instanceof C1735m)) {
            return super.addAll(collection);
        }
        C1735m c1735m = (C1735m) collection;
        int i = c1735m.f15668d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15668d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        double[] dArr = this.f15667c;
        if (i11 > dArr.length) {
            this.f15667c = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(c1735m.f15667c, 0, this.f15667c, this.f15668d, c1735m.f15668d);
        this.f15668d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d10) {
        b();
        int i = this.f15668d;
        double[] dArr = this.f15667c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f15667c = dArr2;
        }
        double[] dArr3 = this.f15667c;
        int i10 = this.f15668d;
        this.f15668d = i10 + 1;
        dArr3[i10] = d10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15668d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15668d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1735m)) {
            return super.equals(obj);
        }
        C1735m c1735m = (C1735m) obj;
        if (this.f15668d != c1735m.f15668d) {
            return false;
        }
        double[] dArr = c1735m.f15667c;
        for (int i = 0; i < this.f15668d; i++) {
            if (Double.doubleToLongBits(this.f15667c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Double.valueOf(this.f15667c[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f15668d; i++) {
            iB = (iB * 31) + C1746y.b(Double.doubleToLongBits(this.f15667c[i]));
        }
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15668d) {
            return new C1735m(Arrays.copyOf(this.f15667c, i), this.f15668d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f15668d; i++) {
            if (obj.equals(Double.valueOf(this.f15667c[i]))) {
                double[] dArr = this.f15667c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f15668d - i) - 1);
                this.f15668d--;
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
        double[] dArr = this.f15667c;
        System.arraycopy(dArr, i10, dArr, i, this.f15668d - i10);
        this.f15668d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        c(i);
        double[] dArr = this.f15667c;
        double d10 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15668d;
    }

    public C1735m(double[] dArr, int i) {
        this.f15667c = dArr;
        this.f15668d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        double[] dArr = this.f15667c;
        double d10 = dArr[i];
        if (i < this.f15668d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f15668d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
