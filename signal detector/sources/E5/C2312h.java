package e5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: e5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2312h extends AbstractCollection implements Collection, r5.b {

    /* renamed from: a, reason: collision with root package name */
    public final C2310f f19974a;

    public C2312h(C2310f c2310f) {
        this.f19974a = c2310f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        q5.i.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f19974a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19974a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f19974a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2310f c2310f = this.f19974a;
        c2310f.getClass();
        return new C2308d(c2310f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C2310f c2310f = this.f19974a;
        c2310f.c();
        int i = c2310f.i(obj);
        if (i < 0) {
            return false;
        }
        c2310f.l(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        q5.i.e(collection, "elements");
        this.f19974a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        q5.i.e(collection, "elements");
        this.f19974a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19974a.i;
    }
}
