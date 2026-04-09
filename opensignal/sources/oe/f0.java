package oe;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f0 extends h1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f19327a;

    /* renamed from: d, reason: collision with root package name */
    public int f19328d;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f19329g;

    public f0(h0 h0Var, int i10) {
        int size = h0Var.size();
        ba.m.l(i10, size);
        this.f19327a = size;
        this.f19328d = i10;
        this.f19329g = h0Var;
    }

    public final Object a(int i10) {
        return this.f19329g.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19328d < this.f19327a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19328d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19328d;
        this.f19328d = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19328d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19328d - 1;
        this.f19328d = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19328d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
