package d9;

import c9.AbstractC2085f;
import d9.C4285c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* compiled from: MapBuilder.kt */
/* renamed from: d9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4287e<E> extends AbstractC2085f<E> {

    /* renamed from: b, reason: collision with root package name */
    public final C4285c<E, ?> f37573b;

    public C4287e(C4285c<E, ?> c4285c) {
        this.f37573b = c4285c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        l.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // c9.AbstractC2085f
    public final int c() {
        return this.f37573b.f37560j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f37573b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f37573b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f37573b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        C4285c<E, ?> c4285c = this.f37573b;
        c4285c.getClass();
        return new C4285c.e(c4285c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C4285c<E, ?> c4285c = this.f37573b;
        c4285c.d();
        int iJ = c4285c.j(obj);
        if (iJ < 0) {
            return false;
        }
        c4285c.n(iJ);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37573b.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37573b.d();
        return super.retainAll(elements);
    }
}
