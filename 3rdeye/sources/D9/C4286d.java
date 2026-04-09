package d9;

import d9.C4285c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* compiled from: MapBuilder.kt */
/* renamed from: d9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4286d<K, V> extends AbstractC4283a<Map.Entry<K, V>, K, V> {

    /* renamed from: b, reason: collision with root package name */
    public final C4285c<K, V> f37572b;

    public C4286d(C4285c<K, V> c4285c) {
        this.f37572b = c4285c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        l.f(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        l.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // c9.AbstractC2085f
    public final int c() {
        return this.f37572b.f37560j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f37572b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        return this.f37572b.f(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f37572b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        C4285c<K, V> c4285c = this.f37572b;
        c4285c.getClass();
        return new C4285c.b(c4285c);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37572b.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        this.f37572b.d();
        return super.retainAll(elements);
    }
}
