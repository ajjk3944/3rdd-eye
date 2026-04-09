package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851sL extends GK implements RandomAccess, InterfaceC1420kL, DL {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f16707d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1851sL f16708e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f16709b;

    /* renamed from: c, reason: collision with root package name */
    public int f16710c;

    static {
        long[] jArr = new long[0];
        f16707d = jArr;
        f16708e = new C1851sL(jArr, 0, false);
    }

    public C1851sL(long[] jArr, int i, boolean z6) {
        super(z6);
        this.f16709b = jArr;
        this.f16710c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i3 = this.f16710c)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int i6 = i + 1;
        long[] jArr = this.f16709b;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i, jArr, i6, i3 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f16709b, 0, jArr2, 0, i);
            System.arraycopy(this.f16709b, i, jArr2, i6, this.f16710c - i);
            this.f16709b = jArr2;
        }
        this.f16709b[i] = jLongValue;
        this.f16710c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1528mL.f15610a;
        collection.getClass();
        if (!(collection instanceof C1851sL)) {
            return super.addAll(collection);
        }
        C1851sL c1851sL = (C1851sL) collection;
        int i = c1851sL.f16710c;
        if (i == 0) {
            return false;
        }
        int i3 = this.f16710c;
        if (Integer.MAX_VALUE - i3 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i3 + i;
        long[] jArr = this.f16709b;
        if (i6 > jArr.length) {
            this.f16709b = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(c1851sL.f16709b, 0, this.f16709b, this.f16710c, c1851sL.f16710c);
        this.f16710c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i) {
        e(i);
        return this.f16709b[i];
    }

    public final void c(long j6) {
        a();
        int i = this.f16710c;
        int length = this.f16709b.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f16709b, 0, jArr, 0, this.f16710c);
            this.f16709b = jArr;
        }
        long[] jArr2 = this.f16709b;
        int i3 = this.f16710c;
        this.f16710c = i3 + 1;
        jArr2[i3] = j6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474lL
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1851sL B(int i) {
        if (i >= this.f16710c) {
            return new C1851sL(i == 0 ? f16707d : Arrays.copyOf(this.f16709b, i), this.f16710c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f16710c) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1851sL)) {
            return super.equals(obj);
        }
        C1851sL c1851sL = (C1851sL) obj;
        if (this.f16710c != c1851sL.f16710c) {
            return false;
        }
        long[] jArr = c1851sL.f16709b;
        for (int i = 0; i < this.f16710c; i++) {
            if (this.f16709b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i) {
        int i3 = this.f16710c;
        return A.f.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i3).length()), "Index:", i, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        e(i);
        return Long.valueOf(this.f16709b[i]);
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.f16710c; i3++) {
            long j6 = this.f16709b[i3];
            Charset charset = AbstractC1528mL.f15610a;
            i = (i * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f16710c;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f16709b[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.GK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        e(i);
        long[] jArr = this.f16709b;
        long j6 = jArr[i];
        if (i < this.f16710c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f16710c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        a();
        if (i3 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f16709b;
        System.arraycopy(jArr, i3, jArr, i, this.f16710c - i3);
        this.f16710c -= i3 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        e(i);
        long[] jArr = this.f16709b;
        long j6 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16710c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}
