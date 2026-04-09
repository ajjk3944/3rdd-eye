package mq;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends br.b implements ListIterator {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f16924r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(6, dVar);
        this.f16924r = dVar;
        int iA = dVar.a();
        if (i10 < 0 || i10 > iA) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, iA, ", size: "));
        }
        this.f2899d = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2899d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2899d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2899d - 1;
        this.f2899d = i10;
        return this.f16924r.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2899d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
