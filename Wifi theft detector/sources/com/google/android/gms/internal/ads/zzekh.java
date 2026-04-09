package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzekh implements zzekg {

    @VisibleForTesting
    public final zzekg zza;
    private final zzgqt zzb;

    public zzekh(zzekg zzekgVar, zzgqt zzgqtVar) {
        this.zza = zzekgVar;
        this.zzb = zzgqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return this.zza.zza(zzfjcVar, zzfirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final com.google.common.util.concurrent.a zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        return zzgzo.zzk(this.zza.zzb(zzfjcVar, zzfirVar), this.zzb, zzcei.zza);
    }
}
