package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class td1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f16790a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f16791b;

    public /* synthetic */ td1(Iterator it, Iterator it2) {
        this.f16790a = it;
        this.f16791b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16790a.hasNext() || this.f16791b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f16790a;
        return it.hasNext() ? it.next() : this.f16791b.next();
    }
}
