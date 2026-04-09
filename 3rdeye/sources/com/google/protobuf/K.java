package com.google.protobuf;

import N7.C1094a9;
import com.google.protobuf.B;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes2.dex */
public final class K extends AbstractC4020c<Long> implements B.h, RandomAccess, f0 {
    private static final K EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        K k10 = new K(new long[0], 0);
        EMPTY_LIST = k10;
        k10.makeImmutable();
    }

    public K() {
        this(new long[10], 0);
    }

    public static K emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        B.checkNotNull(collection);
        if (!(collection instanceof K)) {
            return super.addAll(collection);
        }
        K k10 = (K) collection;
        int i = k10.size;
        if (i == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        long[] jArr = this.array;
        if (i11 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(k10.array, 0, this.array, this.size, k10.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.B.h
    public void addLong(long j4) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        jArr3[i10] = j4;
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
        if (!(obj instanceof K)) {
            return super.equals(obj);
        }
        K k10 = (K) obj;
        if (this.size != k10.size) {
            return false;
        }
        long[] jArr = k10.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.B.h
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + B.hashLong(this.array[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == jLongValue) {
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i10, jArr, i, this.size - i10);
        this.size -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.B.h
    public long setLong(int i, long j4) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j10 = jArr[i];
        jArr[i] = j4;
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private K(long[] jArr, int i) {
        this.array = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public B.h mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new K(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j4 = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Long set(int i, Long l5) {
        return Long.valueOf(setLong(i, l5.longValue()));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l5) {
        addLong(l5.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, Long l5) {
        addLong(i, l5.longValue());
    }

    private void addLong(int i, long j4) {
        int i10;
        ensureIsMutable();
        if (i >= 0 && i <= (i10 = this.size)) {
            long[] jArr = this.array;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i10 - i);
            } else {
                long[] jArr2 = new long[C1094a9.d(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
                this.array = jArr2;
            }
            this.array[i] = j4;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
