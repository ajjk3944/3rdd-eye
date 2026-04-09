package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dd1 extends s91 {

    /* renamed from: a, reason: collision with root package name */
    public final ce1 f10436a;

    public dd1(ce1 ce1Var) {
        this.f10436a = ce1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return ((qh1) this.f10436a.f10095c).C() != ii1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd1)) {
            return false;
        }
        ce1 ce1Var = ((dd1) obj).f10436a;
        ce1 ce1Var2 = this.f10436a;
        qh1 qh1Var = (qh1) ce1Var2.f10095c;
        qh1 qh1Var2 = (qh1) ce1Var2.f10095c;
        ii1 ii1VarC = qh1Var.C();
        qh1 qh1Var3 = (qh1) ce1Var.f10095c;
        qh1 qh1Var4 = (qh1) ce1Var.f10095c;
        return ii1VarC.equals(qh1Var3.C()) && qh1Var2.A().equals(qh1Var4.A()) && qh1Var2.B().equals(qh1Var4.B());
    }

    public final int hashCode() {
        ce1 ce1Var = this.f10436a;
        return Objects.hash((qh1) ce1Var.f10095c, (vl1) ce1Var.f10094b);
    }

    public final String toString() {
        ce1 ce1Var = this.f10436a;
        String strA = ((qh1) ce1Var.f10095c).A();
        int iOrdinal = ((qh1) ce1Var.f10095c).C().ordinal();
        return a0.g.n("(typeUrl=", strA, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
