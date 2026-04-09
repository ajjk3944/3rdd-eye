package d5;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2274b extends C2273a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2276d f19811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274b(AbstractC2276d abstractC2276d, int i) {
        super(0, abstractC2276d);
        this.f19811d = abstractC2276d;
        int iA = abstractC2276d.a();
        if (i < 0 || i > iA) {
            throw new IndexOutOfBoundsException(A.f.g(i, iA, "index: ", ", size: "));
        }
        this.f19809b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19809b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19809b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f19809b - 1;
        this.f19809b = i;
        return this.f19811d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19809b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
