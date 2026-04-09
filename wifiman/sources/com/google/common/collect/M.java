package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
public abstract class M {

    class a extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f38347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f38348b;

        /* renamed from: com.google.common.collect.M$a$a, reason: collision with other inner class name */
        class C1210a extends AbstractC5056b {

            /* renamed from: c, reason: collision with root package name */
            final Iterator f38349c;

            /* renamed from: d, reason: collision with root package name */
            final Iterator f38350d;

            C1210a() {
                this.f38349c = a.this.f38347a.iterator();
                this.f38350d = a.this.f38348b.iterator();
            }

            @Override // com.google.common.collect.AbstractC5056b
            protected Object a() {
                if (this.f38349c.hasNext()) {
                    return this.f38349c.next();
                }
                while (this.f38350d.hasNext()) {
                    Object next = this.f38350d.next();
                    if (!a.this.f38347a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f38347a = set;
            this.f38348b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return new C1210a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f38347a.contains(obj) || this.f38348b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f38347a.isEmpty() && this.f38348b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f38347a.size();
            Iterator it = this.f38348b.iterator();
            while (it.hasNext()) {
                if (!this.f38347a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public abstract S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    static boolean a(Set set, Object obj) {
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
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static b c(Set set, Set set2) {
        AbstractC6769h.j(set, "set1");
        AbstractC6769h.j(set2, "set2");
        return new a(set, set2);
    }
}
