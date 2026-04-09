package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class OF extends AbstractC1089eE {

    /* renamed from: a, reason: collision with root package name */
    public final String f10174a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1956uI f10175b;

    public OF(String str, EnumC1956uI enumC1956uI) {
        this.f10174a = str;
        this.f10175b = enumC1956uI;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f10175b != EnumC1956uI.RAW;
    }

    public final String toString() {
        int iOrdinal = this.f10175b.ordinal();
        return "(typeUrl=" + this.f10174a + ", outputPrefixType=" + (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
