package oc;

import ir.f0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends g implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f19275d;

    /* renamed from: g, reason: collision with root package name */
    public int f19276g;

    /* renamed from: r, reason: collision with root package name */
    public final e f19277r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i10) {
        super(0);
        int size = eVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(f0.d0("index", i10, size));
        }
        this.f19275d = size;
        this.f19276g = i10;
        this.f19277r = eVar;
    }

    public final Object a(int i10) {
        return this.f19277r.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19276g < this.f19275d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19276g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19276g;
        this.f19276g = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19276g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19276g - 1;
        this.f19276g = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19276g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
