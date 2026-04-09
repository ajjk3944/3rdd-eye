package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import z8.e;

/* loaded from: classes4.dex */
public final class c extends e implements Collection, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final MapBuilder f21971a;

    public c(MapBuilder backing) {
        p.e(backing, "backing");
        this.f21971a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        p.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // z8.e
    public int c() {
        return this.f21971a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f21971a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f21971a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f21971a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f21971a.S();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f21971a.Q(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        p.e(elements, "elements");
        this.f21971a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        p.e(elements, "elements");
        this.f21971a.o();
        return super.retainAll(elements);
    }
}
