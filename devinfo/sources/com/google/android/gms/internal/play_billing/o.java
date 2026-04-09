package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends ac.h implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f20195b;

    /* renamed from: c, reason: collision with root package name */
    public int f20196c;

    /* renamed from: d, reason: collision with root package name */
    public final q f20197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, int i4) {
        super(1);
        int size = qVar.size();
        ii.a.I(i4, size);
        this.f20195b = size;
        this.f20196c = i4;
        this.f20197d = qVar;
    }

    public final Object a(int i4) {
        return this.f20197d.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20196c < this.f20195b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20196c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f20196c;
        this.f20196c = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20196c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f20196c - 1;
        this.f20196c = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20196c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
