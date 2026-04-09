package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class QF extends AbstractC1089eE {

    /* renamed from: a, reason: collision with root package name */
    public final C1685pG f10594a;

    public QF(C1685pG c1685pG) {
        this.f10594a = c1685pG;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f10594a.f16155b.C() != EnumC1956uI.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QF)) {
            return false;
        }
        C1685pG c1685pG = ((QF) obj).f10594a;
        C1685pG c1685pG2 = this.f10594a;
        C0984cI c0984cI = c1685pG2.f16155b;
        C0984cI c0984cI2 = c1685pG2.f16155b;
        EnumC1956uI enumC1956uIC = c0984cI.C();
        C0984cI c0984cI3 = c1685pG.f16155b;
        C0984cI c0984cI4 = c1685pG.f16155b;
        return enumC1956uIC.equals(c0984cI3.C()) && c0984cI2.A().equals(c0984cI4.A()) && c0984cI2.B().equals(c0984cI4.B());
    }

    public final int hashCode() {
        C1685pG c1685pG = this.f10594a;
        return Objects.hash(c1685pG.f16155b, c1685pG.f16154a);
    }

    public final String toString() {
        C1685pG c1685pG = this.f10594a;
        String strA = c1685pG.f16155b.A();
        int iOrdinal = c1685pG.f16155b.C().ordinal();
        return "(typeUrl=" + strA + ", outputPrefixType=" + (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
