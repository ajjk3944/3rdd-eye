package com.google.protobuf;

import N7.C1094a9;
import com.google.protobuf.B;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4023f extends AbstractC4020c<Boolean> implements B.a, RandomAccess, f0 {
    private static final C4023f EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        C4023f c4023f = new C4023f(new boolean[0], 0);
        EMPTY_LIST = c4023f;
        c4023f.makeImmutable();
    }

    public C4023f() {
        this(new boolean[10], 0);
    }

    public static C4023f emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        B.checkNotNull(collection);
        if (!(collection instanceof C4023f)) {
            return super.addAll(collection);
        }
        C4023f c4023f = (C4023f) collection;
        int i = c4023f.size;
        if (i == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        boolean[] zArr = this.array;
        if (i11 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(c4023f.array, 0, this.array, this.size, c4023f.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.B.a
    public void addBoolean(boolean z10) {
        ensureIsMutable();
        int i = this.size;
        boolean[] zArr = this.array;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        zArr3[i10] = z10;
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
        if (!(obj instanceof C4023f)) {
            return super.equals(obj);
        }
        C4023f c4023f = (C4023f) obj;
        if (this.size != c4023f.size) {
            return false;
        }
        boolean[] zArr = c4023f.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.B.a
    public boolean getBoolean(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.size; i++) {
            iHashBoolean = (iHashBoolean * 31) + B.hashBoolean(this.array[i]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == zBooleanValue) {
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
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i10, zArr, i, this.size - i10);
        this.size -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.B.a
    public boolean setBoolean(int i, boolean z10) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z11 = zArr[i];
        zArr[i] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C4023f(boolean[] zArr, int i) {
        this.array = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public B.a mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new C4023f(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Boolean remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z10 = zArr[i];
        if (i < this.size - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, Boolean bool) {
        addBoolean(i, bool.booleanValue());
    }

    private void addBoolean(int i, boolean z10) {
        int i10;
        ensureIsMutable();
        if (i >= 0 && i <= (i10 = this.size)) {
            boolean[] zArr = this.array;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i10 - i);
            } else {
                boolean[] zArr2 = new boolean[C1094a9.d(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.array, i, zArr2, i + 1, this.size - i);
                this.array = zArr2;
            }
            this.array[i] = z10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
