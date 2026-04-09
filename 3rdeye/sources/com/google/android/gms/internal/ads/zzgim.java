package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgim extends zzgfo {
    private final zzgik zza;
    private final String zzb;
    private final zzgij zzc;
    private final zzgfo zzd;

    public /* synthetic */ zzgim(zzgik zzgikVar, String str, zzgij zzgijVar, zzgfo zzgfoVar, zzgil zzgilVar) {
        this.zza = zzgikVar;
        this.zzb = str;
        this.zzc = zzgijVar;
        this.zzd = zzgfoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgim)) {
            return false;
        }
        zzgim zzgimVar = (zzgim) obj;
        return zzgimVar.zzc.equals(this.zzc) && zzgimVar.zzd.equals(this.zzd) && zzgimVar.zzb.equals(this.zzb) && zzgimVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgim.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgik zzgikVar = this.zza;
        zzgfo zzgfoVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzgfoVar);
        String strValueOf3 = String.valueOf(zzgikVar);
        StringBuilder sb = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        com.google.android.gms.measurement.internal.a.l(sb, this.zzb, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: ");
        return C1154e9.j(sb, strValueOf2, ", variant: ", strValueOf3, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgik.zzb;
    }

    public final zzgfo zzb() {
        return this.zzd;
    }

    public final zzgik zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
