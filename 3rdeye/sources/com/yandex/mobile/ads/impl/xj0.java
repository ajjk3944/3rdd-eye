package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vj0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class xj0<E> extends vj0<E> implements List<E>, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final w72<Object> f35327c = new b(0, fo1.f27413g);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35328d = 0;

    public static final class a<E> extends vj0.a<E> {
        public a() {
            this(0);
        }

        public final xj0<E> a() {
            this.f34607c = true;
            return xj0.b(this.f34606b, this.f34605a);
        }

        public final a b(List list) {
            a(list);
            return this;
        }

        public a(int i) {
        }
    }

    public static class b<E> extends AbstractC4103f<E> {

        /* renamed from: d, reason: collision with root package name */
        private final xj0<E> f35329d;

        public b(int i, xj0 xj0Var) {
            super(xj0Var.size(), i);
            this.f35329d = xj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4103f
        public final E a(int i) {
            return this.f35329d.get(i);
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f35330b;

        public c(Object[] objArr) {
            this.f35330b = objArr;
        }

        public Object readResolve() {
            return xj0.b(this.f35330b);
        }
    }

    public class d extends xj0<E> {

        /* renamed from: e, reason: collision with root package name */
        final transient int f35331e;

        /* renamed from: f, reason: collision with root package name */
        final transient int f35332f;

        public d(int i, int i10) {
            this.f35331e = i;
            this.f35332f = i10;
        }

        @Override // com.yandex.mobile.ads.impl.xj0, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xj0<E> subList(int i, int i10) {
            pj1.a(i, i10, this.f35332f);
            xj0 xj0Var = xj0.this;
            int i11 = this.f35331e;
            return xj0Var.subList(i + i11, i10 + i11);
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final Object[] c() {
            return xj0.this.c();
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final int d() {
            return xj0.this.e() + this.f35331e + this.f35332f;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final int e() {
            return xj0.this.e() + this.f35331e;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i) {
            pj1.a(i, this.f35332f);
            return xj0.this.get(i + this.f35331e);
        }

        @Override // com.yandex.mobile.ads.impl.xj0, com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.xj0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f35332f;
        }

        @Override // com.yandex.mobile.ads.impl.xj0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    private static <E> xj0<E> a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(fe.a("at index ", i));
            }
        }
        return b(objArr.length, objArr);
    }

    public static <E> a<E> g() {
        return new a<>();
    }

    public static <E> xj0<E> h() {
        return (xj0<E>) fo1.f27413g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    @Deprecated
    public final xj0<E> b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && pd1.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (pd1.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = ~(~(get(i10).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final v72<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public Object writeReplace() {
        return new c(toArray());
    }

    public static xj0 b(int i, Object[] objArr) {
        return i == 0 ? fo1.f27413g : new fo1(i, objArr);
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public static <E> xj0<E> b(E[] eArr) {
        if (eArr.length == 0) {
            return (xj0<E>) fo1.f27413g;
        }
        return a((Object[]) eArr.clone());
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    public static <E> xj0<E> a(Collection<? extends E> collection) {
        if (collection instanceof vj0) {
            xj0<E> xj0VarB = ((vj0) collection).b();
            if (!xj0VarB.f()) {
                return xj0VarB;
            }
            Object[] array = xj0VarB.toArray();
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w72<E> listIterator(int i) {
        pj1.b(i, size());
        if (isEmpty()) {
            return (w72<E>) f35327c;
        }
        return new b(i, this);
    }

    public static xj0 a(Long l5, Long l10, Long l11, Long l12, Long l13) {
        return a(l5, l10, l11, l12, l13);
    }

    public static <E> xj0<E> a(E e4) {
        return a(e4);
    }

    public static <E> xj0<E> a(E e4, E e10) {
        return a(e4, e10);
    }

    @Override // java.util.List
    /* renamed from: a */
    public xj0<E> subList(int i, int i10) {
        pj1.a(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return (xj0<E>) fo1.f27413g;
        }
        return new d(i, i11);
    }
}
