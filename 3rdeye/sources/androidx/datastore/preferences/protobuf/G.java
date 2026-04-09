package androidx.datastore.preferences.protobuf;

import N7.C1094a9;
import androidx.datastore.preferences.protobuf.C1746y;
import g0.C4356c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes.dex */
public final class G extends AbstractC1725c<Long> implements RandomAccess, Z {

    /* renamed from: c, reason: collision with root package name */
    public long[] f15545c;

    /* renamed from: d, reason: collision with root package name */
    public int f15546d;

    static {
        new G(new long[0], 0).f15584b = false;
    }

    public G() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i < 0 || i > (i10 = this.f15546d)) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15546d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        long[] jArr = this.f15545c;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i10 - i);
        } else {
            long[] jArr2 = new long[C1094a9.d(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f15545c, i, jArr2, i + 1, this.f15546d - i);
            this.f15545c = jArr2;
        }
        this.f15545c[i] = jLongValue;
        this.f15546d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = C1746y.f15707a;
        collection.getClass();
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i = g10.f15546d;
        if (i == 0) {
            return false;
        }
        int i10 = this.f15546d;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        long[] jArr = this.f15545c;
        if (i11 > jArr.length) {
            this.f15545c = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(g10.f15545c, 0, this.f15545c, this.f15546d, g10.f15546d);
        this.f15546d = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j4) {
        b();
        int i = this.f15546d;
        long[] jArr = this.f15545c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1094a9.d(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f15545c = jArr2;
        }
        long[] jArr3 = this.f15545c;
        int i10 = this.f15546d;
        this.f15546d = i10 + 1;
        jArr3[i10] = j4;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f15546d) {
            StringBuilder sbJ = C4356c.j(i, "Index:", ", Size:");
            sbJ.append(this.f15546d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f15546d != g10.f15546d) {
            return false;
        }
        long[] jArr = g10.f15545c;
        for (int i = 0; i < this.f15546d; i++) {
            if (this.f15545c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Long.valueOf(this.f15545c[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f15546d; i++) {
            iB = (iB * 31) + C1746y.b(this.f15545c[i]);
        }
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        if (i >= this.f15546d) {
            return new G(Arrays.copyOf(this.f15545c, i), this.f15546d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f15546d; i++) {
            if (obj.equals(Long.valueOf(this.f15545c[i]))) {
                long[] jArr = this.f15545c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f15546d - i) - 1);
                this.f15546d--;
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
        long[] jArr = this.f15545c;
        System.arraycopy(jArr, i10, jArr, i, this.f15546d - i10);
        this.f15546d -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        c(i);
        long[] jArr = this.f15545c;
        long j4 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15546d;
    }

    public G(long[] jArr, int i) {
        this.f15545c = jArr;
        this.f15546d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        long[] jArr = this.f15545c;
        long j4 = jArr[i];
        if (i < this.f15546d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f15546d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
