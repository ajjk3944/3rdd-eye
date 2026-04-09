package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qj1 extends xe1 {

    /* renamed from: a, reason: collision with root package name */
    public final pj1 f15352a;

    public qj1(pj1 pj1Var) {
        this.f15352a = pj1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f15352a != pj1.f15022e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qj1) && ((qj1) obj).f15352a == this.f15352a;
    }

    public final int hashCode() {
        return Objects.hash(qj1.class, this.f15352a);
    }

    public final String toString() {
        String str = this.f15352a.f15023a;
        return r5.c.m(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
