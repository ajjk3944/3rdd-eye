package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vo1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f17679a;

    /* renamed from: b, reason: collision with root package name */
    public ym1 f17680b;

    public vo1(bn1 bn1Var) {
        if (!(bn1Var instanceof wo1)) {
            this.f17679a = null;
            this.f17680b = (ym1) bn1Var;
            return;
        }
        wo1 wo1Var = (wo1) bn1Var;
        ArrayDeque arrayDeque = new ArrayDeque(wo1Var.g);
        this.f17679a = arrayDeque;
        arrayDeque.push(wo1Var);
        bn1 bn1Var2 = wo1Var.f18069d;
        while (bn1Var2 instanceof wo1) {
            wo1 wo1Var2 = (wo1) bn1Var2;
            this.f17679a.push(wo1Var2);
            bn1Var2 = wo1Var2.f18069d;
        }
        this.f17680b = (ym1) bn1Var2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ym1 next() {
        ym1 ym1Var;
        ym1 ym1Var2 = this.f17680b;
        if (ym1Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f17679a;
            ym1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            bn1 bn1Var = ((wo1) arrayDeque.pop()).f18070e;
            while (bn1Var instanceof wo1) {
                wo1 wo1Var = (wo1) bn1Var;
                arrayDeque.push(wo1Var);
                bn1Var = wo1Var.f18069d;
            }
            ym1Var = (ym1) bn1Var;
        } while (ym1Var.i() == 0);
        this.f17680b = ym1Var;
        return ym1Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17680b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
