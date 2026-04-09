package r0;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public int f21111a;

    /* renamed from: d, reason: collision with root package name */
    public int f21112d;

    public a(int i10, int i11) {
        this.f21111a = i10;
        this.f21112d = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21111a < this.f21112d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21111a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21111a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21111a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
