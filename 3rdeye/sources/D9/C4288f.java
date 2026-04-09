package d9;

import c9.AbstractC2083d;
import d9.C4285c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* compiled from: MapBuilder.kt */
/* renamed from: d9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4288f<V> extends AbstractC2083d<V> {

    /* renamed from: b, reason: collision with root package name */
    public final C4285c<?, V> f37574b;

    public C4288f(C4285c<?, V> c4285c) {
        this.f37574b = c4285c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        l.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f37574b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37574b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f37574b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C4285c<?, V> c4285c = this.f37574b;
        c4285c.getClass();
        return new C4285c.f(c4285c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C4285c<?, V> c4285c = this.f37574b;
        c4285c.d();
        int iK = c4285c.k(obj);
        if (iK < 0) {
            return false;
        }
        c4285c.n(iK);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37574b.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37574b.d();
        return super.retainAll(elements);
    }
}
