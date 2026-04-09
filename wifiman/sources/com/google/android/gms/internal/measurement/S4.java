package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class S4 extends P3 implements J4, InterfaceC4455s5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f35108d;

    /* renamed from: e, reason: collision with root package name */
    private static final S4 f35109e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f35110b;

    /* renamed from: c, reason: collision with root package name */
    private int f35111c;

    static {
        long[] jArr = new long[0];
        f35108d = jArr;
        f35109e = new S4(jArr, 0, false);
    }

    private S4(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f35110b = jArr;
        this.f35111c = i10;
    }

    public static S4 f() {
        return f35109e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f35111c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f35111c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f35111c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        long[] jArr = this.f35110b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[i(jArr.length)];
            System.arraycopy(this.f35110b, 0, jArr2, 0, i10);
            System.arraycopy(this.f35110b, i10, jArr2, i10 + 1, this.f35111c - i10);
            this.f35110b = jArr2;
        }
        this.f35110b[i10] = jLongValue;
        this.f35111c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        F4.e(collection);
        if (!(collection instanceof S4)) {
            return super.addAll(collection);
        }
        S4 s42 = (S4) collection;
        int i10 = s42.f35111c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35111c;
        if (MPv3.MAX_MESSAGE_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f35110b;
        if (i12 > jArr.length) {
            this.f35110b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(s42.f35110b, 0, this.f35110b, this.f35111c, s42.f35111c);
        this.f35111c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j10) {
        b();
        int i10 = this.f35111c;
        long[] jArr = this.f35110b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[i(jArr.length)];
            System.arraycopy(this.f35110b, 0, jArr2, 0, this.f35111c);
            this.f35110b = jArr2;
        }
        long[] jArr3 = this.f35110b;
        int i11 = this.f35111c;
        this.f35111c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4)) {
            return super.equals(obj);
        }
        S4 s42 = (S4) obj;
        if (this.f35111c != s42.f35111c) {
            return false;
        }
        long[] jArr = s42.f35110b;
        for (int i10 = 0; i10 < this.f35111c; i10++) {
            if (this.f35110b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    final void g(int i10) {
        long[] jArr = this.f35110b;
        if (i10 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f35110b = new long[Math.max(i10, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i10) {
            length = i(length);
        }
        this.f35110b = Arrays.copyOf(this.f35110b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(r(i10));
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f35111c; i10++) {
            iB = (iB * 31) + F4.b(this.f35110b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f35110b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final long r(int i10) {
        k(i10);
        return this.f35110b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.P3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        b();
        k(i10);
        long[] jArr = this.f35110b;
        long j10 = jArr[i10];
        if (i10 < this.f35111c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f35111c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f35110b;
        System.arraycopy(jArr, i11, jArr, i10, this.f35111c - i11);
        this.f35111c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        k(i10);
        long[] jArr = this.f35110b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35111c;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final J4 zza(int i10) {
        if (i10 >= this.f35111c) {
            return new S4(i10 == 0 ? f35108d : Arrays.copyOf(this.f35110b, i10), this.f35111c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
