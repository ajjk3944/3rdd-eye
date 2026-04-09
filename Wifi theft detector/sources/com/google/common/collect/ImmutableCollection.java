package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

@GwtCompatible(emulated = true)
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f11781a = new Object[0];

    public static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f11782a;

        /* renamed from: b, reason: collision with root package name */
        public int f11783b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11784c;

        public a(int i10) {
            j.b(i10, "initialCapacity");
            this.f11782a = new Object[i10];
            this.f11783b = 0;
        }

        public a b(Object obj) {
            com.google.common.base.g.m(obj);
            e(this.f11783b + 1);
            Object[] objArr = this.f11782a;
            int i10 = this.f11783b;
            this.f11783b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b c(Object... objArr) {
            d(objArr, objArr.length);
            return this;
        }

        public final void d(Object[] objArr, int i10) {
            g0.c(objArr, i10);
            e(this.f11783b + i10);
            System.arraycopy(objArr, 0, this.f11782a, this.f11783b, i10);
            this.f11783b += i10;
        }

        public final void e(int i10) {
            Object[] objArr = this.f11782a;
            if (objArr.length < i10) {
                this.f11782a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f11784c = false;
            } else if (this.f11784c) {
                this.f11782a = (Object[]) objArr.clone();
                this.f11784c = false;
            }
        }
    }

    public static abstract class b {
        public static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i10) {
        v0 it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public Object[] d() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public abstract v0 iterator();

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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f11781a);
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        com.google.common.base.g.m(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrD = d();
            if (objArrD != null) {
                return k0.a(objArrD, h(), g(), objArr);
            }
            objArr = g0.e(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
