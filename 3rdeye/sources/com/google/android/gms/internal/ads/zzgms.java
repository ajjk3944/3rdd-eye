package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgms extends zzgfa {
    private final zzgom zza;

    public zzgms(zzgom zzgomVar) {
        this.zza = zzgomVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgms)) {
            return false;
        }
        zzgom zzgomVar = ((zzgms) obj).zza;
        zzgom zzgomVar2 = this.zza;
        return zzgomVar2.zzc().zzg().equals(zzgomVar.zzc().zzg()) && zzgomVar2.zzc().zzi().equals(zzgomVar.zzc().zzi()) && zzgomVar2.zzc().zzh().equals(zzgomVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgom zzgomVar = this.zza;
        return Objects.hash(zzgomVar.zzc(), zzgomVar.zzd());
    }

    public final String toString() {
        zzgom zzgomVar = this.zza;
        String strZzi = zzgomVar.zzc().zzi();
        int iOrdinal = zzgomVar.zzc().zzg().ordinal();
        return Oo.h("(typeUrl=", strZzi, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgut.RAW;
    }

    public final zzgom zzb() {
        return this.zza;
    }
}
