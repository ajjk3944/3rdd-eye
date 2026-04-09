package E3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class g extends c {

    /* renamed from: a, reason: collision with root package name */
    private final int f4023a;

    /* renamed from: b, reason: collision with root package name */
    private int f4024b;

    protected g(int i10, int i11) {
        e.b(i11, i10, "index");
        this.f4023a = i10;
        this.f4024b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4024b < this.f4023a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4024b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4024b;
        this.f4024b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4024b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4024b - 1;
        this.f4024b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4024b - 1;
    }
}
