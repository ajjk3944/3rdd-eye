package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a extends a9.a {

    /* renamed from: a, reason: collision with root package name */
    public final MapBuilder f21969a;

    public a(MapBuilder backing) {
        p.e(backing, "backing");
        this.f21969a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        p.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f21969a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        p.e(elements, "elements");
        return this.f21969a.q(elements);
    }

    @Override // z8.h
    public int d() {
        return this.f21969a.size();
    }

    @Override // a9.a
    public boolean f(Map.Entry element) {
        p.e(element, "element");
        return this.f21969a.r(element);
    }

    @Override // a9.a
    public boolean g(Map.Entry element) {
        p.e(element, "element");
        return this.f21969a.M(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        p.e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f21969a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f21969a.v();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        p.e(elements, "elements");
        this.f21969a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        p.e(elements, "elements");
        this.f21969a.o();
        return super.retainAll(elements);
    }
}
