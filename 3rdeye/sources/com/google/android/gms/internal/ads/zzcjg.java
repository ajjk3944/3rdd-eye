package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcjg implements zzfbn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    final zzhgh zzh;
    private final zzcij zzi;

    public zzcjg(zzcij zzcijVar, Context context, String str) {
        this.zzi = zzcijVar;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhgh zzhghVar = zzcijVar.zzbg;
        zzezn zzeznVar = new zzezn(zzhfyVarZza, zzhghVar, zzcijVar.zzbh);
        this.zzb = zzeznVar;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzfax(zzhghVar));
        this.zzc = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(zzfcl.zza());
        this.zzd = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(new zzfbh(zzhfyVarZza, zzcijVar.zza, zzcijVar.zzR, zzeznVar, zzhghVarZzc, zzfcq.zza(), zzhghVarZzc2));
        this.zze = zzhghVarZzc3;
        this.zzf = zzhfx.zzc(new zzfbr(zzhghVarZzc3, zzhghVarZzc, zzhghVarZzc2));
        zzhfy zzhfyVarZzc = zzhfz.zzc(str);
        this.zzg = zzhfyVarZzc;
        this.zzh = zzhfx.zzc(new zzfbl(zzhfyVarZzc, zzhghVarZzc3, zzhfyVarZza, zzhghVarZzc, zzhghVarZzc2, zzcijVar.zzj, zzcijVar.zzT, zzcijVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final zzfbk zza() {
        return (zzfbk) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbn
    public final zzfbq zzb() {
        return (zzfbq) this.zzf.zzb();
    }
}
