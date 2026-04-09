package com.google.protobuf;

import N7.C1094a9;
import com.google.protobuf.B;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* loaded from: classes2.dex */
public final class A extends AbstractC4020c<Integer> implements B.g, RandomAccess, f0 {
    private static final A EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        A a10 = new A(new int[0], 0);
        EMPTY_LIST = a10;
        a10.makeImmutable();
    }

    public A() {
        this(new int[10], 0);
    }

    public static A emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        B.checkNotNull(collection);
        if (!(collection instanceof A)) {
            return super.addAll(collection);
        }
        A a10 = (A) collection;
        int i = a10.size;
        if (i == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.array;
        if (i11 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(a10.array, 0, this.array, this.size, a10.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.B.g
    public void addInt(int i) {
        ensureIsMutable();
        int i10 = this.size;
        int[] iArr = this.array;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        iArr3[i11] = i;
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
        if (!(obj instanceof A)) {
            return super.equals(obj);
        }
        A a10 = (A) obj;
        if (this.size != a10.size) {
            return false;
        }
        int[] iArr = a10.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.B.g
    public int getInt(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i = (i * 31) + this.array[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == iIntValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, i10, iArr, i, this.size - i10);
        this.size -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.B.g
    public int setInt(int i, int i10) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i11 = iArr[i];
        iArr[i] = i10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private A(int[] iArr, int i) {
        this.array = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public B.g mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new A(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i10 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        addInt(i, num.intValue());
    }

    private void addInt(int i, int i10) {
        int i11;
        ensureIsMutable();
        if (i >= 0 && i <= (i11 = this.size)) {
            int[] iArr = this.array;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i11 - i);
            } else {
                int[] iArr2 = new int[C1094a9.d(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.array, i, iArr2, i + 1, this.size - i);
                this.array = iArr2;
            }
            this.array[i] = i10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
