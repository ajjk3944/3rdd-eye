package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r31 extends h61 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f15521b;

    /* renamed from: c, reason: collision with root package name */
    public int f15522c;

    public r31(int i4, int i10) {
        super(0);
        mq0.g0(i10, i4);
        this.f15521b = i4;
        this.f15522c = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15522c < this.f15521b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15522c > 0;
    }

    @Override // com.google.android.gms.internal.ads.h61, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f15522c;
        this.f15522c = i4 + 1;
        return b(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15522c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f15522c - 1;
        this.f15522c = i4;
        return b(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15522c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
