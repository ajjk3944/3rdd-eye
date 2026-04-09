package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a0 {

    public class a extends p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f12022b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.h f12023c;

        public a(Iterable iterable, com.google.common.base.h hVar) {
            this.f12022b = iterable;
            this.f12023c = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.h(this.f12022b.iterator(), this.f12023c);
        }
    }

    public class b extends p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f12024b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.c f12025c;

        public b(Iterable iterable, com.google.common.base.c cVar) {
            this.f12024b = iterable;
            this.f12025c = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.o(this.f12024b.iterator(), this.f12025c);
        }
    }

    public class c extends p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f12026b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12027c;

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public boolean f12028a = true;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f12029b;

            public a(c cVar, Iterator it) {
                this.f12029b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f12029b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Object next = this.f12029b.next();
                this.f12028a = false;
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                j.d(!this.f12028a);
                this.f12029b.remove();
            }
        }

        public c(Iterable iterable, int i10) {
            this.f12026b = iterable;
            this.f12027c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Iterable iterable = this.f12026b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f12027c), list.size()).iterator();
            }
            Iterator it = iterable.iterator();
            Iterators.b(it, this.f12027c);
            return new a(this, it);
        }
    }

    public static boolean a(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.a(collection, ((Iterable) com.google.common.base.g.m(iterable)).iterator());
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : b0.h(iterable.iterator());
    }

    public static Iterable c(Iterable iterable, com.google.common.base.h hVar) {
        com.google.common.base.g.m(iterable);
        com.google.common.base.g.m(hVar);
        return new a(iterable, hVar);
    }

    public static Object d(Iterable iterable, Object obj) {
        return Iterators.i(iterable.iterator(), obj);
    }

    public static Iterable e(Iterable iterable, int i10) {
        com.google.common.base.g.m(iterable);
        com.google.common.base.g.e(i10 >= 0, "number to skip cannot be negative");
        return new c(iterable, i10);
    }

    public static Object[] f(Iterable iterable) {
        return b(iterable).toArray();
    }

    public static String g(Iterable iterable) {
        return Iterators.n(iterable.iterator());
    }

    public static Iterable h(Iterable iterable, com.google.common.base.c cVar) {
        com.google.common.base.g.m(iterable);
        com.google.common.base.g.m(cVar);
        return new b(iterable, cVar);
    }
}
