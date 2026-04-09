package pc;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends oc.g implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f20451d;

    /* renamed from: g, reason: collision with root package name */
    public int f20452g;

    /* renamed from: r, reason: collision with root package name */
    public final m f20453r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i10) {
        super(1);
        int size = mVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(io.sentry.config.a.n0("index", i10, size));
        }
        this.f20451d = size;
        this.f20452g = i10;
        this.f20453r = mVar;
    }

    public final Object a(int i10) {
        return this.f20453r.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20452g < this.f20451d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20452g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f20452g;
        this.f20452g = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20452g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f20452g - 1;
        this.f20452g = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20452g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
