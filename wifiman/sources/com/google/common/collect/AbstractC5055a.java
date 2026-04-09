package com.google.common.collect;

import java.util.NoSuchElementException;
import m4.AbstractC6769h;

/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5055a extends T {

    /* renamed from: a, reason: collision with root package name */
    private final int f38353a;

    /* renamed from: b, reason: collision with root package name */
    private int f38354b;

    protected AbstractC5055a(int i10, int i11) {
        AbstractC6769h.k(i11, i10);
        this.f38353a = i10;
        this.f38354b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f38354b < this.f38353a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38354b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38354b;
        this.f38354b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38354b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38354b - 1;
        this.f38354b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38354b - 1;
    }
}
