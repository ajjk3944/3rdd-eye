package D3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class S extends AbstractC2577s {

    /* renamed from: a, reason: collision with root package name */
    private final int f2846a;

    /* renamed from: b, reason: collision with root package name */
    private int f2847b;

    protected S(int i10, int i11) {
        P.b(i11, i10, "index");
        this.f2846a = i10;
        this.f2847b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2847b < this.f2846a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2847b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2847b;
        this.f2847b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2847b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2847b - 1;
        this.f2847b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2847b - 1;
    }
}
