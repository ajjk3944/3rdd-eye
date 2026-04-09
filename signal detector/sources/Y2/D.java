package Y2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class D extends L implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f4255a;

    /* renamed from: b, reason: collision with root package name */
    public int f4256b;

    /* renamed from: c, reason: collision with root package name */
    public final F f4257c;

    public D(F f2, int i) {
        int size = f2.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(A.e(i, size, "index"));
        }
        this.f4255a = size;
        this.f4256b = i;
        this.f4257c = f2;
    }

    public final Object a(int i) {
        return this.f4257c.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4256b < this.f4255a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4256b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4256b;
        this.f4256b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4256b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4256b - 1;
        this.f4256b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4256b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
