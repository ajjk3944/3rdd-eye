package ud;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends ac.h implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f35292b;

    /* renamed from: c, reason: collision with root package name */
    public int f35293c;

    /* renamed from: d, reason: collision with root package name */
    public final d f35294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i4) {
        super(2);
        int size = dVar.size();
        t.f(i4, size);
        this.f35292b = size;
        this.f35293c = i4;
        this.f35294d = dVar;
    }

    public final Object a(int i4) {
        return this.f35294d.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35293c < this.f35292b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35293c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f35293c;
        this.f35293c = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35293c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f35293c - 1;
        this.f35293c = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35293c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
