package com.google.common.collect;

import com.google.common.collect.Sets;
import com.google.common.collect.e0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class Multisets {

    public static class ImmutableEntry<E> extends b implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;

        @ParametricNullness
        private final E element;

        /* JADX WARN: Multi-variable type inference failed */
        public ImmutableEntry(Object obj, int i10) {
            this.element = obj;
            this.count = i10;
            j.b(i10, "count");
        }

        @Override // com.google.common.collect.e0.a
        public final Object d() {
            return this.element;
        }

        @Override // com.google.common.collect.e0.a
        public final int getCount() {
            return this.count;
        }
    }

    public class a extends u0 {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.u0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(e0.a aVar) {
            return aVar.d();
        }
    }

    public static abstract class b implements e0.a {
        public boolean equals(Object obj) {
            if (obj instanceof e0.a) {
                e0.a aVar = (e0.a) obj;
                if (getCount() == aVar.getCount() && com.google.common.base.f.a(d(), aVar.d())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object objD = d();
            return (objD == null ? 0 : objD.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.e0.a
        public String toString() {
            String strValueOf = String.valueOf(d());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
            sb.append(strValueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    public static abstract class c extends Sets.a {
        public abstract e0 b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return b().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b().m(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().entrySet().size();
        }
    }

    public static abstract class d extends Sets.a {
        public abstract e0 b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof e0.a) {
                e0.a aVar = (e0.a) obj;
                if (aVar.getCount() > 0 && b().r(aVar.d()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof e0.a) {
                e0.a aVar = (e0.a) obj;
                Object objD = aVar.d();
                int count = aVar.getCount();
                if (count != 0) {
                    return b().p(objD, count, 0);
                }
            }
            return false;
        }
    }

    public static final class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final e0 f11919a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator f11920b;

        /* renamed from: c, reason: collision with root package name */
        public e0.a f11921c;

        /* renamed from: d, reason: collision with root package name */
        public int f11922d;

        /* renamed from: e, reason: collision with root package name */
        public int f11923e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11924f;

        public e(e0 e0Var, Iterator it) {
            this.f11919a = e0Var;
            this.f11920b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11922d > 0 || this.f11920b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f11922d == 0) {
                e0.a aVar = (e0.a) this.f11920b.next();
                this.f11921c = aVar;
                int count = aVar.getCount();
                this.f11922d = count;
                this.f11923e = count;
            }
            this.f11922d--;
            this.f11924f = true;
            e0.a aVar2 = this.f11921c;
            Objects.requireNonNull(aVar2);
            return aVar2.d();
        }

        @Override // java.util.Iterator
        public void remove() {
            j.d(this.f11924f);
            if (this.f11923e == 1) {
                this.f11920b.remove();
            } else {
                e0 e0Var = this.f11919a;
                e0.a aVar = this.f11921c;
                Objects.requireNonNull(aVar);
                e0Var.remove(aVar.d());
            }
            this.f11923e--;
            this.f11924f = false;
        }
    }

    public static boolean a(e0 e0Var, AbstractMapBasedMultiset abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.s(e0Var);
        return true;
    }

    public static boolean b(e0 e0Var, e0 e0Var2) {
        if (e0Var2 instanceof AbstractMapBasedMultiset) {
            return a(e0Var, (AbstractMapBasedMultiset) e0Var2);
        }
        if (e0Var2.isEmpty()) {
            return false;
        }
        for (e0.a aVar : e0Var2.entrySet()) {
            e0Var.n(aVar.d(), aVar.getCount());
        }
        return true;
    }

    public static boolean c(e0 e0Var, Collection collection) {
        com.google.common.base.g.m(e0Var);
        com.google.common.base.g.m(collection);
        if (collection instanceof e0) {
            return b(e0Var, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(e0Var, collection.iterator());
    }

    public static e0 d(Iterable iterable) {
        return (e0) iterable;
    }

    public static Iterator e(Iterator it) {
        return new a(it);
    }

    public static boolean f(e0 e0Var, Object obj) {
        if (obj == e0Var) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var2 = (e0) obj;
            if (e0Var.size() == e0Var2.size() && e0Var.entrySet().size() == e0Var2.entrySet().size()) {
                for (e0.a aVar : e0Var2.entrySet()) {
                    if (e0Var.r(aVar.d()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static e0.a g(Object obj, int i10) {
        return new ImmutableEntry(obj, i10);
    }

    public static Iterator h(e0 e0Var) {
        return new e(e0Var, e0Var.entrySet().iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(e0 e0Var, Collection collection) {
        if (collection instanceof e0) {
            collection = ((e0) collection).k();
        }
        return e0Var.k().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(e0 e0Var, Collection collection) {
        com.google.common.base.g.m(collection);
        if (collection instanceof e0) {
            collection = ((e0) collection).k();
        }
        return e0Var.k().retainAll(collection);
    }

    public static boolean k(e0 e0Var, Object obj, int i10, int i11) {
        j.b(i10, "oldCount");
        j.b(i11, "newCount");
        if (e0Var.r(obj) != i10) {
            return false;
        }
        e0Var.l(obj, i11);
        return true;
    }
}
