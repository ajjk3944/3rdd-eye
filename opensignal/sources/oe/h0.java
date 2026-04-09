package oe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class h0 extends c0 implements List, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f19336d = new f0(u0.f19383x, 0);

    public static u0 k(int i10, Object[] objArr) {
        return i10 == 0 ? u0.f19383x : new u0(i10, objArr);
    }

    public static h0 l(Collection collection) {
        if (!(collection instanceof c0)) {
            Object[] array = collection.toArray();
            s.a(array.length, array);
            return k(array.length, array);
        }
        h0 h0VarA = ((c0) collection).a();
        if (!h0VarA.g()) {
            return h0VarA;
        }
        Object[] array2 = h0VarA.toArray(c0.f19308a);
        return k(array2.length, array2);
    }

    public static u0 m(Object[] objArr) {
        if (objArr.length == 0) {
            return u0.f19383x;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        s.a(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    public static u0 o(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        s.a(5, objArr);
        return k(5, objArr);
    }

    public static u0 p(Object obj) {
        Object[] objArr = {obj};
        s.a(1, objArr);
        return k(1, objArr);
    }

    public static u0 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        s.a(2, objArr);
        return k(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // oe.c0
    public int b(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && a.a.k(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (a.a.k(get(i10), list.get(i10))) {
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
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // oe.c0
    /* renamed from: j */
    public final h1 iterator() {
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f0 listIterator(int i10) {
        ba.m.l(i10, size());
        return isEmpty() ? f19336d : new f0(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public h0 subList(int i10, int i11) {
        ba.m.m(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? u0.f19383x : new g0(this, i10, i12);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oe.c0
    public final h0 a() {
        return this;
    }
}
