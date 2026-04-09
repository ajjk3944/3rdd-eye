package F3;

import java.util.NoSuchElementException;

/* renamed from: F3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2809z extends AbstractC2805v {

    /* renamed from: a, reason: collision with root package name */
    private final int f5943a;

    /* renamed from: b, reason: collision with root package name */
    private int f5944b;

    protected AbstractC2809z(int i10, int i11) {
        AbstractC2807x.b(i11, i10, "index");
        this.f5943a = i10;
        this.f5944b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5944b < this.f5943a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5944b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5944b;
        this.f5944b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5944b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5944b - 1;
        this.f5944b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5944b - 1;
    }
}
