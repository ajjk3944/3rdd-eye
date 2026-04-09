package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k51 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f13039b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13040c;

    public k51(Object obj) {
        super(0);
        this.f13039b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13040c;
    }

    @Override // com.google.android.gms.internal.ads.h61, java.util.Iterator
    public final Object next() {
        if (this.f13040c) {
            throw new NoSuchElementException();
        }
        this.f13040c = true;
        return this.f13039b;
    }
}
