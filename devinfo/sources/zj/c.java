package zj;

import e4.y0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends y0 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f38306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i4) {
        super(3, eVar);
        this.f38306d = eVar;
        b bVar = e.Companion;
        int size = eVar.size();
        bVar.getClass();
        b.b(i4, size);
        this.f22419b = i4;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22419b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22419b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f22419b - 1;
        this.f22419b = i4;
        return this.f38306d.get(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22419b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
