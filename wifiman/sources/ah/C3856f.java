package ah;

import Zg.AbstractC3678j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6949f;

/* renamed from: ah.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3856f extends AbstractC3678j implements Set, InterfaceC6949f {

    /* renamed from: a, reason: collision with root package name */
    private final C3854d f26312a;

    public C3856f(C3854d backing) {
        AbstractC6492s.i(backing, "backing");
        this.f26312a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26312a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26312a.containsKey(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f26312a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26312a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f26312a.U0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f26312a.d1(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26312a.B();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26312a.B();
        return super.retainAll(elements);
    }
}
