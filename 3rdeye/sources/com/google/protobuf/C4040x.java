package com.google.protobuf;

import N7.C1094a9;
import com.google.protobuf.B;
import g0.C4356c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4040x extends AbstractC4020c<Float> implements B.f, RandomAccess, f0 {
    private static final C4040x EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        C4040x c4040x = new C4040x(new float[0], 0);
        EMPTY_LIST = c4040x;
        c4040x.makeImmutable();
    }

    public C4040x() {
        this(new float[10], 0);
    }

    public static C4040x emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        B.checkNotNull(collection);
        if (!(collection instanceof C4040x)) {
            return super.addAll(collection);
        }
        C4040x c4040x = (C4040x) collection;
        int i = c4040x.size;
        if (i == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        float[] fArr = this.array;
        if (i11 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(c4040x.array, 0, this.array, this.size, c4040x.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.B.f
    public void addFloat(float f10) {
        ensureIsMutable();
        int i = this.size;
        float[] fArr = this.array;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        fArr3[i10] = f10;
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
        if (!(obj instanceof C4040x)) {
            return super.equals(obj);
        }
        C4040x c4040x = (C4040x) obj;
        if (this.size != c4040x.size) {
            return false;
        }
        float[] fArr = c4040x.array;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.array[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.B.f
    public float getFloat(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == fFloatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, i10, fArr, i, this.size - i10);
        this.size -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.B.f
    public float setFloat(int i, float f10) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f11 = fArr[i];
        fArr[i] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C4040x(float[] fArr, int i) {
        this.array = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public B.f mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new C4040x(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Float remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f10 = fArr[i];
        if (i < this.size - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public Float set(int i, Float f10) {
        return Float.valueOf(setFloat(i, f10.floatValue()));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, Float f10) {
        addFloat(i, f10.floatValue());
    }

    private void addFloat(int i, float f10) {
        int i10;
        ensureIsMutable();
        if (i >= 0 && i <= (i10 = this.size)) {
            float[] fArr = this.array;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i10 - i);
            } else {
                float[] fArr2 = new float[C1094a9.d(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.array, i, fArr2, i + 1, this.size - i);
                this.array = fArr2;
            }
            this.array[i] = f10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
