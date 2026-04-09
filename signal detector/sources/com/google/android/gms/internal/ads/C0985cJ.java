package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985cJ extends KG {

    /* renamed from: a, reason: collision with root package name */
    public final C0931bJ f13548a;

    public C0985cJ(C0931bJ c0931bJ) {
        this.f13548a = c0931bJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f13548a != C0931bJ.f13342e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0985cJ) && ((C0985cJ) obj).f13548a == this.f13548a;
    }

    public final int hashCode() {
        return Objects.hash(C0985cJ.class, this.f13548a);
    }

    public final String toString() {
        String str = this.f13548a.f13343a;
        return AbstractC1135f5.n(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
