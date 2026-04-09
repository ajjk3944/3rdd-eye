package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 extends x0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f19450a;

    /* renamed from: b, reason: collision with root package name */
    public int f19451b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f19452c;

    public o0(q0 q0Var, int i4) {
        int size = q0Var.size();
        l0.d(i4, size);
        this.f19450a = size;
        this.f19451b = i4;
        this.f19452c = q0Var;
    }

    public final Object a(int i4) {
        return this.f19452c.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19451b < this.f19450a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19451b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f19451b;
        this.f19451b = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19451b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f19451b - 1;
        this.f19451b = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19451b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
