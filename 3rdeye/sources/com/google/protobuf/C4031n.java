package com.google.protobuf;

import N7.C1094a9;
import com.google.protobuf.B;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4031n extends AbstractC4020c<Double> implements B.b, RandomAccess, f0 {
    private static final C4031n EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        C4031n c4031n = new C4031n(new double[0], 0);
        EMPTY_LIST = c4031n;
        c4031n.makeImmutable();
    }

    public C4031n() {
        this(new double[10], 0);
    }

    public static C4031n emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
        sbJ.append(this.size);
        return sbJ.toString();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        B.checkNotNull(collection);
        if (!(collection instanceof C4031n)) {
            return super.addAll(collection);
        }
        C4031n c4031n = (C4031n) collection;
        int i = c4031n.size;
        if (i == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        double[] dArr = this.array;
        if (i11 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(c4031n.array, 0, this.array, this.size, c4031n.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.B.b
    public void addDouble(double d10) {
        ensureIsMutable();
        int i = this.size;
        double[] dArr = this.array;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4031n)) {
            return super.equals(obj);
        }
        C4031n c4031n = (C4031n) obj;
        if (this.size != c4031n.size) {
            return false;
        }
        double[] dArr = c4031n.array;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.array[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.B.b
    public double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + B.hashLong(Double.doubleToLongBits(this.array[i]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i10) {
        ensureIsMutable();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.array;
        System.arraycopy(dArr, i10, dArr, i, this.size - i10);
        this.size -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.B.b
    public double setDouble(int i, double d10) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d11 = dArr[i];
        dArr[i] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C4031n(double[] dArr, int i) {
        this.array = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public B.b mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new C4031n(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d10 = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Double set(int i, Double d10) {
        return Double.valueOf(setDouble(i, d10.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, Double d10) {
        addDouble(i, d10.doubleValue());
    }

    private void addDouble(int i, double d10) {
        int i10;
        ensureIsMutable();
        if (i >= 0 && i <= (i10 = this.size)) {
            double[] dArr = this.array;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i10 - i);
            } else {
                double[] dArr2 = new double[C1094a9.d(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.array, i, dArr2, i + 1, this.size - i);
                this.array = dArr2;
            }
            this.array[i] = d10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
