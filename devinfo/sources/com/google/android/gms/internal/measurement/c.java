package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f19634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f19635b;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f19634a = it;
        this.f19635b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19634a.hasNext()) {
            return true;
        }
        return this.f19635b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f19634a;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f19635b;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
