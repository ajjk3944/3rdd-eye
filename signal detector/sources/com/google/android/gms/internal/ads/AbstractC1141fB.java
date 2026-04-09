package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.fB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1141fB extends AbstractC1896tC implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f14035b;

    /* renamed from: c, reason: collision with root package name */
    public int f14036c;

    public AbstractC1141fB(int i, int i3) {
        super(0);
        AbstractC0582Jp.l0(i3, i);
        this.f14035b = i;
        this.f14036c = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14036c < this.f14035b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14036c > 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14036c;
        this.f14036c = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14036c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14036c - 1;
        this.f14036c = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14036c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
