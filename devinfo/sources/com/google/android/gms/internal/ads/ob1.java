package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ob1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final ka1 f14655a;

    public ob1(ka1 ka1Var) {
        this.f14655a = ka1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f14655a != ka1.f13109q;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ob1) && ((ob1) obj).f14655a == this.f14655a;
    }

    public final int hashCode() {
        return Objects.hash(ob1.class, this.f14655a);
    }

    public final String toString() {
        String str = this.f14655a.f13113b;
        return r5.c.m(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
