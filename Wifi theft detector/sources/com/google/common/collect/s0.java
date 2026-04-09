package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.e0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class s0 {

    public static class a extends Multisets.c implements SortedSet {

        /* renamed from: a, reason: collision with root package name */
        public final r0 f12070a;

        public a(r0 r0Var) {
            this.f12070a = r0Var;
        }

        @Override // com.google.common.collect.Multisets.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b() {
            return this.f12070a;
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return s0.d(b().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return b().q(obj, BoundType.OPEN).k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Multisets.e(b().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Object last() {
            return s0.d(b().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return b().a(obj, BoundType.CLOSED, obj2, BoundType.OPEN).k();
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return b().t(obj, BoundType.CLOSED).k();
        }
    }

    public static class b extends a implements NavigableSet {
        public b(r0 r0Var) {
            super(r0Var);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return s0.c(b().t(obj, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new b(b().o());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return s0.c(b().q(obj, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return new b(b().q(obj, BoundType.f(z10)));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return s0.c(b().t(obj, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return s0.c(b().q(obj, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return s0.c(b().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return s0.c(b().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new b(b().a(obj, BoundType.f(z10), obj2, BoundType.f(z11)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return new b(b().t(obj, BoundType.f(z10)));
        }
    }

    public static Object c(e0.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public static Object d(e0.a aVar) {
        if (aVar != null) {
            return aVar.d();
        }
        throw new NoSuchElementException();
    }
}
