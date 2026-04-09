package com.google.common.collect;

import com.google.common.collect.AbstractC5068n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m4.AbstractC6769h;

/* renamed from: com.google.common.collect.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5069o extends AbstractC5068n implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final T f38389b = new b(I.f38321e, 0);

    /* renamed from: com.google.common.collect.o$a */
    public static final class a extends AbstractC5068n.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public AbstractC5069o f() {
            this.f38388c = true;
            return AbstractC5069o.y(this.f38386a, this.f38387b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* renamed from: com.google.common.collect.o$b */
    static class b extends AbstractC5055a {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5069o f38390c;

        b(AbstractC5069o abstractC5069o, int i10) {
            super(abstractC5069o.size(), i10);
            this.f38390c = abstractC5069o;
        }

        @Override // com.google.common.collect.AbstractC5055a
        protected Object a(int i10) {
            return this.f38390c.get(i10);
        }
    }

    /* renamed from: com.google.common.collect.o$c */
    private static class c extends AbstractC5069o {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC5069o f38391c;

        c(AbstractC5069o abstractC5069o) {
            this.f38391c = abstractC5069o;
        }

        private int X0(int i10) {
            return (size() - 1) - i10;
        }

        private int Y0(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.AbstractC5069o
        public AbstractC5069o N0() {
            return this.f38391c;
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public AbstractC5069o subList(int i10, int i11) {
            AbstractC6769h.m(i10, i11, size());
            return this.f38391c.subList(Y0(i11), Y0(i10)).N0();
        }

        @Override // com.google.common.collect.AbstractC5069o, com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f38391c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC6769h.g(i10, size());
            return this.f38391c.get(X0(i10));
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f38391c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return X0(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f38391c.indexOf(obj);
            if (iIndexOf >= 0) {
                return X0(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.AbstractC5068n
        boolean s() {
            return this.f38391c.s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38391c.size();
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* renamed from: com.google.common.collect.o$d */
    class d extends AbstractC5069o {

        /* renamed from: c, reason: collision with root package name */
        final transient int f38392c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f38393d;

        d(int i10, int i11) {
            this.f38392c = i10;
            this.f38393d = i11;
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        /* renamed from: V0 */
        public AbstractC5069o subList(int i10, int i11) {
            AbstractC6769h.m(i10, i11, this.f38393d);
            AbstractC5069o abstractC5069o = AbstractC5069o.this;
            int i12 = this.f38392c;
            return abstractC5069o.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC6769h.g(i10, this.f38393d);
            return AbstractC5069o.this.get(i10 + this.f38392c);
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.AbstractC5068n
        Object[] j() {
            return AbstractC5069o.this.j();
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.AbstractC5068n
        int m() {
            return AbstractC5069o.this.o() + this.f38392c + this.f38393d;
        }

        @Override // com.google.common.collect.AbstractC5068n
        int o() {
            return AbstractC5069o.this.o() + this.f38392c;
        }

        @Override // com.google.common.collect.AbstractC5068n
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38393d;
        }

        @Override // com.google.common.collect.AbstractC5069o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    AbstractC5069o() {
    }

    private static AbstractC5069o C(Object... objArr) {
        return v(F.b(objArr));
    }

    public static AbstractC5069o K0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return C(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC5069o M0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        AbstractC6769h.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return C(objArr2);
    }

    public static AbstractC5069o T() {
        return I.f38321e;
    }

    public static AbstractC5069o U0(Comparator comparator, Iterable iterable) {
        AbstractC6769h.i(comparator);
        Object[] objArrB = v.b(iterable);
        F.b(objArrB);
        Arrays.sort(objArrB, comparator);
        return v(objArrB);
    }

    public static AbstractC5069o b0(Object obj, Object obj2) {
        return C(obj, obj2);
    }

    public static AbstractC5069o q0(Object obj, Object obj2, Object obj3) {
        return C(obj, obj2, obj3);
    }

    static AbstractC5069o v(Object[] objArr) {
        return y(objArr, objArr.length);
    }

    static AbstractC5069o y(Object[] objArr, int i10) {
        return i10 == 0 ? T() : new I(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public T listIterator() {
        return listIterator(0);
    }

    public AbstractC5069o N0() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public T listIterator(int i10) {
        AbstractC6769h.k(i10, size());
        return isEmpty() ? f38389b : new b(this, i10);
    }

    @Override // java.util.List
    /* renamed from: V0 */
    public AbstractC5069o subList(int i10, int i11) {
        AbstractC6769h.m(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? T() : W0(i10, i11);
    }

    AbstractC5069o W0(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    @Override // com.google.common.collect.AbstractC5068n
    int g(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
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
        return x.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
