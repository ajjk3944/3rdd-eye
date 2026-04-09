package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ya1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final m91 f18692a;

    public ya1(m91 m91Var) {
        this.f18692a = m91Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f18692a != m91.f13813k;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ya1) && ((ya1) obj).f18692a == this.f18692a;
    }

    public final int hashCode() {
        return Objects.hash(ya1.class, this.f18692a);
    }

    public final String toString() {
        String str = this.f18692a.f13825b;
        return r5.c.m(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
