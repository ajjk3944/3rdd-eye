package com.google.common.collect;

import com.google.common.collect.Multisets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d extends AbstractCollection implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f12034a;

    /* renamed from: b, reason: collision with root package name */
    public transient Set f12035b;

    public class a extends Multisets.c {
        public a() {
        }

        @Override // com.google.common.collect.Multisets.c
        public e0 b() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return d.this.i();
        }
    }

    public class b extends Multisets.d {
        public b() {
        }

        @Override // com.google.common.collect.Multisets.d
        public e0 b() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return d.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.h();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        n(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return Multisets.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public boolean contains(Object obj) {
        return r(obj) > 0;
    }

    public Set d() {
        return new a();
    }

    public Set entrySet() {
        Set set = this.f12035b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f12035b = setG;
        return setG;
    }

    @Override // java.util.Collection, com.google.common.collect.e0
    public final boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    public Set g() {
        return new b();
    }

    public abstract int h();

    @Override // java.util.Collection, com.google.common.collect.e0
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Iterator i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public abstract Iterator j();

    public Set k() {
        Set set = this.f12034a;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f12034a = setD;
        return setD;
    }

    public abstract int m(Object obj, int i10);

    public abstract int n(Object obj, int i10);

    public boolean p(Object obj, int i10, int i11) {
        return Multisets.k(this, obj, i10, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public final boolean remove(Object obj) {
        return m(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return Multisets.i(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return Multisets.j(this, collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
