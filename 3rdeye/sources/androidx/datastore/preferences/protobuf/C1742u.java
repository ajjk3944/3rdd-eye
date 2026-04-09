package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742u extends AbstractC1725c<Float> implements RandomAccess, Z {

    /* renamed from: c, reason: collision with root package name */
    public float[] f15699c;

    /* renamed from: d, reason: collision with root package name */
    public int f15700d;

    static {
        new C1742u(new float[0], 0).f15584b = false;
    }

    public C1742u() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i < 0 || i > (i10 = this.f15700d)) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15700d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        float[] fArr = this.f15699c;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i10 - i);
        } else {
            float[] fArr2 = new float[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15699c, i, fArr2, i + 1, this.f15700d - i);
            this.f15699c = fArr2;
        }
        this.f15699c[i] = fFloatValue;
        this.f15700d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = C1746y.f15707a;
        collection.getClass();
        if (!(collection instanceof C1742u)) {
            return super.addAll(collection);
        }
        C1742u c1742u = (C1742u) collection;
        int i = c1742u.f15700d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15700d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        float[] fArr = this.f15699c;
        if (i11 > fArr.length) {
            this.f15699c = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(c1742u.f15699c, 0, this.f15699c, this.f15700d, c1742u.f15700d);
        this.f15700d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f10) {
        b();
        int i = this.f15700d;
        float[] fArr = this.f15699c;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f15699c = fArr2;
        }
        float[] fArr3 = this.f15699c;
        int i10 = this.f15700d;
        this.f15700d = i10 + 1;
        fArr3[i10] = f10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15700d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15700d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1742u)) {
            return super.equals(obj);
        }
        C1742u c1742u = (C1742u) obj;
        if (this.f15700d != c1742u.f15700d) {
            return false;
        }
        float[] fArr = c1742u.f15699c;
        for (int i = 0; i < this.f15700d; i++) {
            if (Float.floatToIntBits(this.f15699c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Float.valueOf(this.f15699c[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f15700d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f15699c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15700d) {
            return new C1742u(Arrays.copyOf(this.f15699c, i), this.f15700d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f15700d; i++) {
            if (obj.equals(Float.valueOf(this.f15699c[i]))) {
                float[] fArr = this.f15699c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f15700d - i) - 1);
                this.f15700d--;
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
        float[] fArr = this.f15699c;
        System.arraycopy(fArr, i10, fArr, i, this.f15700d - i10);
        this.f15700d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        c(i);
        float[] fArr = this.f15699c;
        float f10 = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15700d;
    }

    public C1742u(float[] fArr, int i) {
        this.f15699c = fArr;
        this.f15700d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        float[] fArr = this.f15699c;
        float f10 = fArr[i];
        if (i < this.f15700d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f15700d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
