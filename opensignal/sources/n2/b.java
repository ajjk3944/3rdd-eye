package n2;

import br.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import mq.w;

/* loaded from: classes.dex */
public final class b implements Collection, cr.a {

    /* renamed from: g, reason: collision with root package name */
    public static final b f17378g = new b(w.f16945a);

    /* renamed from: a, reason: collision with root package name */
    public final List f17379a;

    /* renamed from: d, reason: collision with root package name */
    public final int f17380d;

    public b(List list) {
        this.f17379a = list;
        this.f17380d = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f17379a.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f17379a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.a(this.f17379a, ((b) obj).f17379a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f17379a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f17379a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f17379a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f17380d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return l.m(this);
    }

    public final String toString() {
        return h0.b.t(new StringBuilder("LocaleList(localeList="), this.f17379a, ')');
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.n(this, objArr);
    }
}
