package ah;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ah.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3855e extends AbstractC3851a {

    /* renamed from: a, reason: collision with root package name */
    private final C3854d f26311a;

    public C3855e(C3854d backing) {
        AbstractC6492s.i(backing, "backing");
        this.f26311a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26311a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        return this.f26311a.E(elements);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f26311a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26311a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f26311a.b0();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26311a.B();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26311a.B();
        return super.retainAll(elements);
    }

    @Override // ah.AbstractC3851a
    public boolean s(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return this.f26311a.J(element);
    }

    @Override // ah.AbstractC3851a
    public boolean v(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return this.f26311a.a1(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        throw new UnsupportedOperationException();
    }
}
