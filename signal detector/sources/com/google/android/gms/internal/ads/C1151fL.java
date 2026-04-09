package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.fL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151fL extends GK implements RandomAccess, InterfaceC1314iL, DL {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14061d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1151fL f14062e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14063b;

    /* renamed from: c, reason: collision with root package name */
    public int f14064c;

    static {
        int[] iArr = new int[0];
        f14061d = iArr;
        f14062e = new C1151fL(iArr, 0, false);
    }

    public C1151fL(int[] iArr, int i, boolean z6) {
        super(z6);
        this.f14063b = iArr;
        this.f14064c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i3 = this.f14064c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int i6 = i + 1;
        int[] iArr = this.f14063b;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i, iArr, i6, i3 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14063b, 0, iArr2, 0, i);
            System.arraycopy(this.f14063b, i, iArr2, i6, this.f14064c - i);
            this.f14063b = iArr2;
        }
        this.f14063b[i] = iIntValue;
        this.f14064c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1528mL.f15610a;
        collection.getClass();
        if (!(collection instanceof C1151fL)) {
            return super.addAll(collection);
        }
        C1151fL c1151fL = (C1151fL) collection;
        int i = c1151fL.f14064c;
        if (i == 0) {
            return false;
        }
        int i3 = this.f14064c;
        if (Integer.MAX_VALUE - i3 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i3 + i;
        int[] iArr = this.f14063b;
        if (i6 > iArr.length) {
            this.f14063b = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(c1151fL.f14063b, 0, this.f14063b, this.f14064c, c1151fL.f14064c);
        this.f14064c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474lL
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1151fL B(int i) {
        if (i >= this.f14064c) {
            return new C1151fL(i == 0 ? f14061d : Arrays.copyOf(this.f14063b, i), this.f14064c, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        e(i);
        return this.f14063b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        a();
        int i3 = this.f14064c;
        int length = this.f14063b.length;
        if (i3 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14063b, 0, iArr, 0, this.f14064c);
            this.f14063b = iArr;
        }
        int[] iArr2 = this.f14063b;
        int i6 = this.f14064c;
        this.f14064c = i6 + 1;
        iArr2[i6] = i;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f14064c) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1151fL)) {
            return super.equals(obj);
        }
        C1151fL c1151fL = (C1151fL) obj;
        if (this.f14064c != c1151fL.f14064c) {
            return false;
        }
        int[] iArr = c1151fL.f14063b;
        for (int i = 0; i < this.f14064c; i++) {
            if (this.f14063b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i) {
        int i3 = this.f14064c;
        return A.f.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i3).length()), "Index:", i, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Integer.valueOf(this.f14063b[i]);
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.f14064c; i3++) {
            i = (i * 31) + this.f14063b[i3];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f14064c;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f14063b[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        e(i);
        int[] iArr = this.f14063b;
        int i3 = iArr[i];
        if (i < this.f14064c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f14064c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        a();
        if (i3 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14063b;
        System.arraycopy(iArr, i3, iArr, i, this.f14064c - i3);
        this.f14064c -= i3 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        e(i);
        int[] iArr = this.f14063b;
        int i3 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14064c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
