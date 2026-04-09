package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class n0 extends a implements RandomAccess {
    private static final n0 EMPTY_LIST = new n0(new Object[0], 0, false);
    private Object[] array;
    private int size;

    public n0() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> n0 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        return "Index:" + i10 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i10 = this.size;
        Object[] objArr = this.array;
        if (i10 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj = objArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private n0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.array = objArr;
        this.size = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    public n0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new n0(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            Object[] objArr = this.array;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrCreateArray = createArray(((i11 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, objArrCreateArray, 0, i10);
                System.arraycopy(this.array, i10, objArrCreateArray, i10 + 1, this.size - i10);
                this.array = objArrCreateArray;
            }
            this.array[i10] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
