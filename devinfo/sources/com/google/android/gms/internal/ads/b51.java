package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b51 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public final v41 f9595b;

    /* renamed from: c, reason: collision with root package name */
    public h61 f9596c;

    public b51(g51 g51Var) {
        super(0);
        Objects.requireNonNull(g51Var);
        this.f9595b = ((x41) g51Var.f11381d.values()).listIterator(0);
        this.f9596c = i51.f12142e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9596c.hasNext() || this.f9595b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.h61, java.util.Iterator
    public final Object next() {
        if (!this.f9596c.hasNext()) {
            this.f9596c = ((t41) this.f9595b.next()).a();
        }
        return this.f9596c.next();
    }
}
