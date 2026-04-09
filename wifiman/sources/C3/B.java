package C3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class B extends J {

    /* renamed from: a, reason: collision with root package name */
    private final int f2199a;

    /* renamed from: b, reason: collision with root package name */
    private int f2200b;

    protected B(int i10, int i11) {
        z.b(i11, i10, "index");
        this.f2199a = i10;
        this.f2200b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2200b < this.f2199a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2200b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2200b;
        this.f2200b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2200b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2200b - 1;
        this.f2200b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2200b - 1;
    }
}
