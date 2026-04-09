package ac;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends h implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f306b;

    /* renamed from: c, reason: collision with root package name */
    public int f307c;

    /* renamed from: d, reason: collision with root package name */
    public final f f308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, int i4) {
        super(0);
        int size = fVar.size();
        if (i4 < 0 || i4 > size) {
            throw new IndexOutOfBoundsException(jm.a.F(i4, size, "index"));
        }
        this.f306b = size;
        this.f307c = i4;
        this.f308d = fVar;
    }

    public final Object a(int i4) {
        return this.f308d.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f307c < this.f306b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f307c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f307c;
        this.f307c = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f307c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f307c - 1;
        this.f307c = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f307c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
