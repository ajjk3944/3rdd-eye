package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927bF extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final AE f13336a;

    public C0927bF(AE ae) {
        this.f13336a = ae;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f13336a != AE.f6962j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0927bF) && ((C0927bF) obj).f13336a == this.f13336a;
    }

    public final int hashCode() {
        return Objects.hash(C0927bF.class, this.f13336a);
    }

    public final String toString() {
        String str = this.f13336a.f6968b;
        return AbstractC1135f5.n(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
