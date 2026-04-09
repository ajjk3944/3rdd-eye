package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g61 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f11386a;

    public g61(Iterator it) {
        it.getClass();
        this.f11386a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11386a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f11386a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11386a.remove();
    }
}
