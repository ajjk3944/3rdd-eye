package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfgy implements zzddb, zzcwh, zzddf {
    private final zzfhm zza;
    private final zzfhb zzb;

    public zzfgy(Context context, zzfhm zzfhmVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfha.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzb() {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhm zzfhmVar = this.zza;
            zzfhb zzfhbVar = this.zzb;
            zzfhbVar.zzg(true);
            zzfhmVar.zza(zzfhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzj() {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhm zzfhmVar = this.zza;
            zzfhb zzfhbVar = this.zzb;
            zzfhbVar.zzc(zzeVar.zza().toString());
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzi() {
    }
}
