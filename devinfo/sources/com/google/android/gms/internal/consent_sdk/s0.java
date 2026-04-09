package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19508b;

    public s0(Object obj) {
        this.f19507a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19508b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19508b) {
            throw new NoSuchElementException();
        }
        this.f19508b = true;
        return this.f19507a;
    }
}
