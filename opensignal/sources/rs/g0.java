package rs;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public ListIterator f21755a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21755a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21755a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f21755a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21755a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f21755a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21755a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
