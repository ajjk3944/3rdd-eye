package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfcy implements zzgcx {
    final /* synthetic */ zzcfe zza;
    final /* synthetic */ zzcml zzb;
    final /* synthetic */ zzfjq zzc;
    final /* synthetic */ zzebs zzd;

    public zzfcy(zzcfe zzcfeVar, zzcml zzcmlVar, zzfjq zzfjqVar, zzebs zzebsVar) {
        this.zza = zzcfeVar;
        this.zzb = zzcmlVar;
        this.zzc = zzfjqVar;
        this.zzd = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcml zzcmlVar;
        String str = (String) obj;
        zzcfe zzcfeVar = this.zza;
        zzfbt zzfbtVarZzD = zzcfeVar.zzD();
        if (zzfbtVarZzD != null && !zzfbtVarZzD.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfbtVarZzD.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkn)).booleanValue() && (zzcmlVar = this.zzb) != null && zzcml.zzj(str)) {
                zzcmlVar.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzd(str, zzvVar, null, null);
                return;
            }
        }
        zzfbw zzfbwVarZzR = zzcfeVar.zzR();
        if (zzfbwVarZzR == null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        boolean zZzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(zzcfeVar.getContext());
        boolean z10 = false;
        boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgs)).booleanValue() && zzfbtVarZzD != null && zzfbtVarZzD.zzS;
        if (zzfbtVarZzD != null && zzfbtVarZzD.zzad != null) {
            z10 = true;
        }
        this.zzd.zzd(new zzebu(jCurrentTimeMillis, zzfbwVarZzR.zzb, str, (zZzA || z11 || z10) ? 2 : 1));
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
    }
}
