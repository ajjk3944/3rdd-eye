package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a51 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public final v41 f9210b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9211c;

    /* renamed from: d, reason: collision with root package name */
    public h61 f9212d;

    public a51(g51 g51Var) {
        super(0);
        Objects.requireNonNull(g51Var);
        this.f9210b = g51Var.f11381d.entrySet().g().listIterator(0);
        this.f9211c = null;
        this.f9212d = i51.f12142e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9212d.hasNext() || this.f9210b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.h61, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f9212d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9210b.next();
            this.f9211c = entry.getKey();
            this.f9212d = ((t41) entry.getValue()).a();
        }
        Object obj = this.f9211c;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f9212d.next());
    }
}
