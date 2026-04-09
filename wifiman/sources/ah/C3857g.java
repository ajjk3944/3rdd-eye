package ah;

import Zg.AbstractC3675g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6945b;

/* renamed from: ah.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3857g extends AbstractC3675g implements Collection, InterfaceC6945b {

    /* renamed from: a, reason: collision with root package name */
    private final C3854d f26313a;

    public C3857g(C3854d backing) {
        AbstractC6492s.i(backing, "backing");
        this.f26313a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Zg.AbstractC3675g
    public int b() {
        return this.f26313a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f26313a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f26313a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f26313a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f26313a.g1();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f26313a.e1(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26313a.B();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26313a.B();
        return super.retainAll(elements);
    }
}
