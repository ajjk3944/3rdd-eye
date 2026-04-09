package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12020a;

    /* renamed from: b, reason: collision with root package name */
    public int f12021b;

    public a(int i10) {
        this(i10, 0);
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12021b < this.f12020a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12021b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12021b;
        this.f12021b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12021b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12021b - 1;
        this.f12021b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12021b - 1;
    }

    public a(int i10, int i11) {
        com.google.common.base.g.o(i11, i10);
        this.f12020a = i10;
        this.f12021b = i11;
    }
}
