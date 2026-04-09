package com.yandex.mobile.ads.impl;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class lx1 {

    public static class a<E> extends kq<E> implements Set<E> {
        public a(Set<E> set, qj1<? super E> qj1Var) {
            super(set, qj1Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return lx1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return lx1.a(this);
        }
    }

    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, qj1<? super E> qj1Var) {
            super(sortedSet, qj1Var);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f29753b).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f29753b.iterator();
            qj1<? super E> qj1Var = this.f29754c;
            it.getClass();
            qj1Var.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (qj1Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e4) {
            return new b(((SortedSet) this.f29753b).headSet(e4), this.f29754c);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f29753b;
            while (true) {
                E e4 = (Object) sortedSetHeadSet.last();
                if (this.f29754c.apply(e4)) {
                    return e4;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e4);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e4, E e10) {
            return new b(((SortedSet) this.f29753b).subSet(e4, e10), this.f29754c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e4) {
            return new b(((SortedSet) this.f29753b).tailSet(e4), this.f29754c);
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof o31) {
                collection = ((o31) collection).a();
            }
            boolean zRemove = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
                return zRemove;
            }
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        public /* synthetic */ d(int i) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private d() {
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Set<E> a(Set<E> set, qj1<? super E> qj1Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof a) {
                a aVar = (a) sortedSet;
                return new b((SortedSet) aVar.f29753b, rj1.a(aVar.f29754c, qj1Var));
            }
            sortedSet.getClass();
            qj1Var.getClass();
            return new b(sortedSet, qj1Var);
        }
        if (set instanceof a) {
            a aVar2 = (a) set;
            return new a((Set) aVar2.f29753b, rj1.a(aVar2.f29754c, qj1Var));
        }
        set.getClass();
        qj1Var.getClass();
        return new a(set, qj1Var);
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static d a(zj0 zj0Var, zj0 zj0Var2) {
        if (zj0Var == null) {
            throw new NullPointerException("set1");
        }
        if (zj0Var2 != null) {
            return new kx1(zj0Var, zj0Var2);
        }
        throw new NullPointerException("set2");
    }

    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
