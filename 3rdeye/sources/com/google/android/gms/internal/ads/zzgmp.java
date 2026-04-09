package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgmp extends zzgfa {
    private final String zza;
    private final zzgut zzb;

    public /* synthetic */ zzgmp(String str, zzgut zzgutVar, zzgmq zzgmqVar) {
        this.zza = str;
        this.zzb = zzgutVar;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return Oo.h("(typeUrl=", str, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzgut.RAW;
    }
}
