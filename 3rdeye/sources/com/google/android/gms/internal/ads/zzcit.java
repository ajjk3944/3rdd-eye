package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcit implements zzeyi {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcij zzj;

    public zzcit(zzcij zzcijVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcijVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(zzrVar);
        this.zzb = zzhfyVarZza2;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzekr(zzcijVar.zzK));
        this.zzc = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(zzekw.zza());
        this.zzd = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(zzdaw.zza());
        this.zze = zzhghVarZzc3;
        this.zzf = zzhfx.zzc(new zzeyg(zzhfyVarZza, zzcijVar.zza, zzhfyVarZza2, zzcijVar.zzR, zzhghVarZzc, zzhghVarZzc2, zzfcq.zza(), zzhghVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final zzejw zza() {
        zzeyf zzeyfVar = (zzeyf) this.zzf.zzb();
        zzekq zzekqVar = (zzekq) this.zzc.zzb();
        zzcij zzcijVar = this.zzj;
        return new zzejw(this.zzg, this.zzh, this.zzi, zzeyfVar, zzekqVar, zzchu.zzc(zzcijVar.zzbo), (zzdsc) zzcijVar.zzK.zzb());
    }
}
