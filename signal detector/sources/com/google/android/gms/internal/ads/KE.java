package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class KE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final C2006vE f9474a;

    public KE(C2006vE c2006vE) {
        this.f9474a = c2006vE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f9474a != C2006vE.f17242h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KE) && ((KE) obj).f9474a == this.f9474a;
    }

    public final int hashCode() {
        return Objects.hash(KE.class, this.f9474a);
    }

    public final String toString() {
        String str = this.f9474a.f17247b;
        return AbstractC1135f5.n(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
