package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class G4 extends P3 implements K4, InterfaceC4455s5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f35023d;

    /* renamed from: e, reason: collision with root package name */
    private static final G4 f35024e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f35025b;

    /* renamed from: c, reason: collision with root package name */
    private int f35026c;

    static {
        int[] iArr = new int[0];
        f35023d = iArr;
        f35024e = new G4(iArr, 0, false);
    }

    private G4(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f35025b = iArr;
        this.f35026c = i10;
    }

    public static G4 f() {
        return f35024e;
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35026c;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.f35026c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f35026c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f35025b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[j(iArr.length)];
            System.arraycopy(this.f35025b, 0, iArr2, 0, i10);
            System.arraycopy(this.f35025b, i10, iArr2, i10 + 1, this.f35026c - i10);
            this.f35025b = iArr2;
        }
        this.f35025b[i10] = iIntValue;
        this.f35026c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        F4.e(collection);
        if (!(collection instanceof G4)) {
            return super.addAll(collection);
        }
        G4 g42 = (G4) collection;
        int i10 = g42.f35026c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35026c;
        if (MPv3.MAX_MESSAGE_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f35025b;
        if (i12 > iArr.length) {
            this.f35025b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(g42.f35025b, 0, this.f35025b, this.f35026c, g42.f35026c);
        this.f35026c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        zzh(i10);
        return this.f35025b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return super.equals(obj);
        }
        G4 g42 = (G4) obj;
        if (this.f35026c != g42.f35026c) {
            return false;
        }
        int[] iArr = g42.f35025b;
        for (int i10 = 0; i10 < this.f35026c; i10++) {
            if (this.f35025b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        b();
        int i11 = this.f35026c;
        int[] iArr = this.f35025b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[j(iArr.length)];
            System.arraycopy(this.f35025b, 0, iArr2, 0, this.f35026c);
            this.f35025b = iArr2;
        }
        int[] iArr3 = this.f35025b;
        int i12 = this.f35026c;
        this.f35026c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(e(i10));
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35026c; i11++) {
            i10 = (i10 * 31) + this.f35025b[i11];
        }
        return i10;
    }

    final void i(int i10) {
        int[] iArr = this.f35025b;
        if (i10 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f35025b = new int[Math.max(i10, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i10) {
            length = j(length);
        }
        this.f35025b = Arrays.copyOf(this.f35025b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f35025b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        b();
        zzh(i10);
        int[] iArr = this.f35025b;
        int i11 = iArr[i10];
        if (i10 < this.f35026c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f35026c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f35025b;
        System.arraycopy(iArr, i11, iArr, i10, this.f35026c - i11);
        this.f35026c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        zzh(i10);
        int[] iArr = this.f35025b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35026c;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final K4 zza(int i10) {
        if (i10 >= this.f35026c) {
            return new G4(i10 == 0 ? f35023d : Arrays.copyOf(this.f35025b, i10), this.f35026c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
