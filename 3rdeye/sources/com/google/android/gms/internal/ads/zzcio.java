package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcio implements zzewu {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    private final zzcij zzg;

    public zzcio(zzcij zzcijVar, Context context, String str) {
        this.zzg = zzcijVar;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(str);
        this.zzb = zzhfyVarZza2;
        zzhgh zzhghVar = zzcijVar.zzbg;
        zzezm zzezmVar = new zzezm(zzhfyVarZza, zzhghVar, zzcijVar.zzbh);
        this.zzc = zzezmVar;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzexs(zzhghVar));
        this.zzd = zzhghVarZzc;
        zzhgh zzhghVar2 = zzcijVar.zza;
        zzhgh zzhghVar3 = zzcijVar.zzR;
        zzfcq zzfcqVarZza = zzfcq.zza();
        zzhgh zzhghVar4 = zzcijVar.zzj;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(new zzexu(zzhfyVarZza, zzhghVar2, zzhghVar3, zzezmVar, zzhghVarZzc, zzfcqVarZza, zzhghVar4));
        this.zze = zzhghVarZzc2;
        this.zzf = zzhfx.zzc(new zzeya(zzhghVar3, zzhfyVarZza, zzhfyVarZza2, zzhghVarZzc2, zzhghVarZzc, zzhghVar4, zzcijVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final zzexz zza() {
        return (zzexz) this.zzf.zzb();
    }
}
