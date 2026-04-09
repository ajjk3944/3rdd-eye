package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.snmp4j.mp.MPv3;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4527b2 extends AbstractC4625k1 implements RandomAccess, InterfaceC4560e2 {

    /* renamed from: d, reason: collision with root package name */
    private static final C4527b2 f35669d = new C4527b2(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f35670b;

    /* renamed from: c, reason: collision with root package name */
    private int f35671c;

    private C4527b2(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f35670b = iArr;
        this.f35671c = i10;
    }

    public static C4527b2 f() {
        return f35669d;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35671c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35671c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f35671c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f35670b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f35670b, i10, iArr2, i12, this.f35671c - i10);
            this.f35670b = iArr2;
        }
        this.f35670b[i10] = iIntValue;
        this.f35671c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = AbstractC4593h2.f35692b;
        collection.getClass();
        if (!(collection instanceof C4527b2)) {
            return super.addAll(collection);
        }
        C4527b2 c4527b2 = (C4527b2) collection;
        int i10 = c4527b2.f35671c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35671c;
        if (MPv3.MAX_MESSAGE_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f35670b;
        if (i12 > iArr.length) {
            this.f35670b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c4527b2.f35670b, 0, this.f35670b, this.f35671c, c4527b2.f35671c);
        this.f35671c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        j(i10);
        return this.f35670b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4527b2)) {
            return super.equals(obj);
        }
        C4527b2 c4527b2 = (C4527b2) obj;
        if (this.f35671c != c4527b2.f35671c) {
            return false;
        }
        int[] iArr = c4527b2.f35670b;
        for (int i10 = 0; i10 < this.f35671c; i10++) {
            if (this.f35670b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        b();
        int i11 = this.f35671c;
        int[] iArr = this.f35670b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f35670b = iArr2;
        }
        int[] iArr3 = this.f35670b;
        int i12 = this.f35671c;
        this.f35671c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Integer.valueOf(this.f35670b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35671c; i11++) {
            i10 = (i10 * 31) + this.f35670b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f35671c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f35670b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4625k1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        int[] iArr = this.f35670b;
        int i11 = iArr[i10];
        if (i10 < this.f35671c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f35671c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f35670b;
        System.arraycopy(iArr, i11, iArr, i10, this.f35671c - i11);
        this.f35671c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        j(i10);
        int[] iArr = this.f35670b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35671c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2
    public final /* bridge */ /* synthetic */ InterfaceC4582g2 zzd(int i10) {
        if (i10 >= this.f35671c) {
            return new C4527b2(Arrays.copyOf(this.f35670b, i10), this.f35671c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
