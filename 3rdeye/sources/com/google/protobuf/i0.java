package com.google.protobuf;

import N7.C1094a9;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes2.dex */
public final class i0<E> extends AbstractC4020c<E> implements RandomAccess {
    private static final i0<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        i0<Object> i0Var = new i0<>(new Object[0], 0);
        EMPTY_LIST = i0Var;
        i0Var.makeImmutable();
    }

    public i0() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> i0<E> emptyList() {
        return (i0<E>) EMPTY_LIST;
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

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        ensureIsMutable();
        int i = this.size;
        E[] eArr = this.array;
        if (i == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        eArr2[i10] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        E[] eArr = this.array;
        E e4 = eArr[i];
        if (i < this.size - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public E set(int i, E e4) {
        ensureIsMutable();
        ensureIndexInRange(i);
        E[] eArr = this.array;
        E e10 = eArr[i];
        eArr[i] = e4;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private i0(E[] eArr, int i) {
        this.array = eArr;
        this.size = i;
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public i0<E> mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new i0<>(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, E e4) {
        int i10;
        ensureIsMutable();
        if (i >= 0 && i <= (i10 = this.size)) {
            E[] eArr = this.array;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i10 - i);
            } else {
                E[] eArr2 = (E[]) createArray(C1094a9.d(i10, 3, 2, 1));
                System.arraycopy(this.array, 0, eArr2, 0, i);
                System.arraycopy(this.array, i, eArr2, i + 1, this.size - i);
                this.array = eArr2;
            }
            this.array[i] = e4;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
