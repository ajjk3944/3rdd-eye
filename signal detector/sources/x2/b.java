package X2;

import a4.p;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements ListIterator, Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f4159a;

    /* renamed from: b, reason: collision with root package name */
    public int f4160b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4161c;

    public b(e eVar, int i) {
        int size = eVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(p.z(i, size, "index"));
        }
        this.f4159a = size;
        this.f4160b = i;
        this.f4161c = eVar;
    }

    public final Object a(int i) {
        return this.f4161c.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4160b < this.f4159a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4160b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4160b;
        this.f4160b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4160b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4160b - 1;
        this.f4160b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4160b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
