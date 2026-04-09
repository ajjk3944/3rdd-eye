package y0;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public int f37287a;

    /* renamed from: b, reason: collision with root package name */
    public int f37288b;

    public a(int i4, int i10) {
        this.f37287a = i4;
        this.f37288b = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37287a < this.f37288b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37287a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37287a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37287a - 1;
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
