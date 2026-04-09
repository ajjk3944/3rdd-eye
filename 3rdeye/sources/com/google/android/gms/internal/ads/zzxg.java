package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzxg implements zzwz {
    private final zzwz zza;
    private final long zzb;

    public zzxg(zzwz zzwzVar, long j4) {
        this.zza = zzwzVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zza(zzkv zzkvVar, zzhs zzhsVar, int i) {
        int iZza = this.zza.zza(zzkvVar, zzhsVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzhsVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb(long j4) {
        return this.zza.zzb(j4 - this.zzb);
    }

    public final zzwz zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final boolean zze() {
        return this.zza.zze();
    }
}
