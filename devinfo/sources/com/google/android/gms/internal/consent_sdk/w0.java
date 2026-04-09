package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f19553c;

    public w0(Object obj) {
        this.f19553c = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int a(Object[] objArr) {
        objArr[0] = this.f19553c;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19553c.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.r0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19553c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new s0(this.f19553c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d.h.t("[", this.f19553c.toString(), "]");
    }
}
