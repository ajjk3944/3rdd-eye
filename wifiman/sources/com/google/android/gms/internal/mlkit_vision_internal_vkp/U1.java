package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class U1 extends AbstractC4625k1 implements RandomAccess, InterfaceC4549d2 {

    /* renamed from: d, reason: collision with root package name */
    private static final U1 f35643d = new U1(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private float[] f35644b;

    /* renamed from: c, reason: collision with root package name */
    private int f35645c;

    private U1(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f35644b = fArr;
        this.f35645c = i10;
    }

    public static U1 f() {
        return f35643d;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35645c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35645c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f35645c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f35644b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f35644b, i10, fArr2, i12, this.f35645c - i10);
            this.f35644b = fArr2;
        }
        this.f35644b[i10] = fFloatValue;
        this.f35645c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC4593h2.f35692b;
        collection.getClass();
        if (!(collection instanceof U1)) {
            return super.addAll(collection);
        }
        U1 u12 = (U1) collection;
        int i10 = u12.f35645c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35645c;
        if (MPv3.MAX_MESSAGE_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f35644b;
        if (i12 > fArr.length) {
            this.f35644b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(u12.f35644b, 0, this.f35644b, this.f35645c, u12.f35645c);
        this.f35645c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final float e(int i10) {
        j(i10);
        return this.f35644b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return super.equals(obj);
        }
        U1 u12 = (U1) obj;
        if (this.f35645c != u12.f35645c) {
            return false;
        }
        float[] fArr = u12.f35644b;
        for (int i10 = 0; i10 < this.f35645c; i10++) {
            if (Float.floatToIntBits(this.f35644b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f10) {
        b();
        int i10 = this.f35645c;
        float[] fArr = this.f35644b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f35644b = fArr2;
        }
        float[] fArr3 = this.f35644b;
        int i11 = this.f35645c;
        this.f35645c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Float.valueOf(this.f35644b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f35645c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f35644b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f35645c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f35644b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        float[] fArr = this.f35644b;
        float f10 = fArr[i10];
        if (i10 < this.f35645c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f35645c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f35644b;
        System.arraycopy(fArr, i11, fArr, i10, this.f35645c - i11);
        this.f35645c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        j(i10);
        float[] fArr = this.f35644b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35645c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2
    public final /* bridge */ /* synthetic */ InterfaceC4582g2 zzd(int i10) {
        if (i10 >= this.f35645c) {
            return new U1(Arrays.copyOf(this.f35644b, i10), this.f35645c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
