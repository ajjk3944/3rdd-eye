package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import m4.AbstractC6769h;
import org.snmp4j.mp.MPv3;

/* renamed from: com.google.common.collect.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5068n extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f38385a = new Object[0];

    /* renamed from: com.google.common.collect.n$a */
    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f38386a;

        /* renamed from: b, reason: collision with root package name */
        int f38387b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38388c;

        a(int i10) {
            AbstractC5061g.b(i10, "initialCapacity");
            this.f38386a = new Object[i10];
            this.f38387b = 0;
        }

        private void d(int i10) {
            Object[] objArr = this.f38386a;
            if (objArr.length < i10) {
                this.f38386a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f38388c = false;
            } else if (this.f38388c) {
                this.f38386a = (Object[]) objArr.clone();
                this.f38388c = false;
            }
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(Object[] objArr, int i10) {
            F.c(objArr, i10);
            d(this.f38387b + i10);
            System.arraycopy(objArr, 0, this.f38386a, this.f38387b, i10);
            this.f38387b += i10;
        }
    }

    /* renamed from: com.google.common.collect.n$b */
    public static abstract class b {
        b() {
        }

        static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            return iHighestOneBit < 0 ? MPv3.MAX_MESSAGE_ID : iHighestOneBit;
        }
    }

    AbstractC5068n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    abstract int g(Object[] objArr, int i10);

    Object[] j() {
        return null;
    }

    int m() {
        throw new UnsupportedOperationException();
    }

    int o() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract boolean s();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f38385a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC6769h.i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrJ = j();
            if (objArrJ != null) {
                return H.a(objArrJ, o(), m(), objArr);
            }
            objArr = F.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        g(objArr, 0);
        return objArr;
    }
}
