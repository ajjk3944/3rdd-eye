package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j41 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f12627a;

    /* renamed from: b, reason: collision with root package name */
    public int f12628b;

    /* renamed from: c, reason: collision with root package name */
    public int f12629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m41 f12630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m41 f12632f;

    public j41(m41 m41Var, char c9) {
        Objects.requireNonNull(m41Var);
        this.f12630d = m41Var;
        this.f12627a = m41Var.f13758e;
        this.f12628b = m41Var.isEmpty() ? -1 : 0;
        this.f12629c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12628b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object l41Var;
        m41 m41Var = this.f12630d;
        if (m41Var.f13758e != this.f12627a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f12628b;
        this.f12629c = i4;
        switch (this.f12631e) {
            case 0:
                l41Var = this.f12632f.b()[i4];
                break;
            case 1:
                l41Var = new l41(this.f12632f, i4);
                break;
            default:
                l41Var = this.f12632f.c()[i4];
                break;
        }
        int i10 = this.f12628b + 1;
        if (i10 >= m41Var.f13759f) {
            i10 = -1;
        }
        this.f12628b = i10;
        return l41Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m41 m41Var = this.f12630d;
        if (m41Var.f13758e != this.f12627a) {
            throw new ConcurrentModificationException();
        }
        mq0.d0("no calls to next() since the last call to remove()", this.f12629c >= 0);
        this.f12627a += 32;
        m41Var.remove(m41Var.b()[this.f12629c]);
        this.f12628b--;
        this.f12629c = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j41(m41 m41Var, int i4) {
        this(m41Var, (char) 0);
        this.f12631e = i4;
        switch (i4) {
            case 1:
                Objects.requireNonNull(m41Var);
                this.f12632f = m41Var;
                this(m41Var, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(m41Var);
                this.f12632f = m41Var;
                this(m41Var, (char) 0);
                break;
            default:
                Objects.requireNonNull(m41Var);
                this.f12632f = m41Var;
                break;
        }
    }
}
