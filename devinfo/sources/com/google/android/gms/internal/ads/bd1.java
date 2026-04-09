package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bd1 extends s91 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9651a;

    /* renamed from: b, reason: collision with root package name */
    public final ii1 f9652b;

    public bd1(String str, ii1 ii1Var) {
        this.f9651a = str;
        this.f9652b = ii1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f9652b != ii1.RAW;
    }

    public final String toString() {
        int iOrdinal = this.f9652b.ordinal();
        return a0.g.n("(typeUrl=", this.f9651a, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
