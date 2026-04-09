package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f11785b = new b(RegularImmutableList.f11936e, 0);

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient ImmutableList f11786c;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.f11786c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList C() {
            return this.f11786c;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public ImmutableList subList(int i10, int i11) {
            com.google.common.base.g.q(i10, i11, size());
            return this.f11786c.subList(H(i11), H(i10)).C();
        }

        public final int G(int i10) {
            return (size() - 1) - i10;
        }

        public final int H(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11786c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i10) {
            com.google.common.base.g.k(i10, size());
            return this.f11786c.get(G(i10));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return this.f11786c.i();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f11786c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return G(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f11786c.indexOf(obj);
            if (iIndexOf >= 0) {
                return G(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11786c.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.x(this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient int f11787c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f11788d;

        public SubList(int i10, int i11) {
            this.f11787c = i10;
            this.f11788d = i11;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: E */
        public ImmutableList subList(int i10, int i11) {
            com.google.common.base.g.q(i10, i11, this.f11788d);
            ImmutableList immutableList = ImmutableList.this;
            int i12 = this.f11787c;
            return immutableList.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] d() {
            return ImmutableList.this.d();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int g() {
            return ImmutableList.this.h() + this.f11787c + this.f11788d;
        }

        @Override // java.util.List
        public Object get(int i10) {
            com.google.common.base.g.k(i10, this.f11788d);
            return ImmutableList.this.get(i10 + this.f11787c);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int h() {
            return ImmutableList.this.h() + this.f11787c;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11788d;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static final class a extends ImmutableCollection.a {
        public a() {
            this(4);
        }

        public a f(Object obj) {
            super.b(obj);
            return this;
        }

        public ImmutableList g() {
            this.f11784c = true;
            return ImmutableList.u(this.f11782a, this.f11783b);
        }

        public a(int i10) {
            super(i10);
        }
    }

    public static class b extends com.google.common.collect.a {

        /* renamed from: c, reason: collision with root package name */
        public final ImmutableList f11789c;

        public b(ImmutableList immutableList, int i10) {
            super(immutableList.size(), i10);
            this.f11789c = immutableList;
        }

        @Override // com.google.common.collect.a
        public Object a(int i10) {
            return this.f11789c.get(i10);
        }
    }

    public static ImmutableList A() {
        return RegularImmutableList.f11936e;
    }

    public static ImmutableList B(Object obj) {
        return w(obj);
    }

    public static ImmutableList D(Comparator comparator, Iterable iterable) {
        com.google.common.base.g.m(comparator);
        Object[] objArrF = a0.f(iterable);
        g0.b(objArrF);
        Arrays.sort(objArrF, comparator);
        return s(objArrF);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList s(Object[] objArr) {
        return u(objArr, objArr.length);
    }

    public static ImmutableList u(Object[] objArr, int i10) {
        return i10 == 0 ? A() : new RegularImmutableList(objArr, i10);
    }

    public static a v() {
        return new a();
    }

    public static ImmutableList w(Object... objArr) {
        return s(g0.b(objArr));
    }

    public static ImmutableList x(Object[] objArr) {
        return objArr.length == 0 ? A() : w((Object[]) objArr.clone());
    }

    public ImmutableList C() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    /* renamed from: E */
    public ImmutableList subList(int i10, int i11) {
        com.google.common.base.g.q(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? A() : F(i10, i11);
    }

    public ImmutableList F(int i10, int i11) {
        return new SubList(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return b0.b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.c(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public v0 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.e(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public w0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public w0 listIterator(int i10) {
        com.google.common.base.g.o(i10, size());
        return isEmpty() ? f11785b : new b(this, i10);
    }
}
