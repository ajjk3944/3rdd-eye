package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4103f<E> extends w72<E> {

    /* renamed from: b, reason: collision with root package name */
    private final int f27132b;

    /* renamed from: c, reason: collision with root package name */
    private int f27133c;

    public AbstractC4103f(int i, int i10) {
        pj1.b(i10, i);
        this.f27132b = i;
        this.f27133c = i10;
    }

    public abstract E a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27133c < this.f27132b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27133c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f27133c;
        this.f27133c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27133c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f27133c - 1;
        this.f27133c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27133c - 1;
    }
}
