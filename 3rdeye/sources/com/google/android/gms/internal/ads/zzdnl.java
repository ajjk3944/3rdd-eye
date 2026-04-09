package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdnl implements zzgcx {
    final /* synthetic */ zzfbt zza;
    final /* synthetic */ zzfbw zzb;
    final /* synthetic */ zzcml zzc;
    final /* synthetic */ zzdnr zzd;

    public zzdnl(zzdnr zzdnrVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar) {
        this.zza = zzfbtVar;
        this.zzb = zzfbwVar;
        this.zzc = zzcmlVar;
        this.zzd = zzdnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzfbt zzfbtVar = this.zza;
        zzcfeVar.zzW(zzfbtVar, this.zzb);
        zzcgw zzcgwVarZzN = zzcfeVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkr)).booleanValue() && zzcgwVarZzN != null) {
            zzcml zzcmlVar = this.zzc;
            zzdnr zzdnrVar = this.zzd;
            zzcgwVarZzN.zzM(zzcmlVar, zzdnrVar.zzi, zzdnrVar.zzj);
            zzcgwVarZzN.zzO(zzcmlVar, zzdnrVar.zzi, zzdnrVar.zzd);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzni)).booleanValue() || zzcgwVarZzN == null) {
            return;
        }
        zzcgwVarZzN.zzP(zzfbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
    }
}
