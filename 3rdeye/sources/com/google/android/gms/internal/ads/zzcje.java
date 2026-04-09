package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcje implements zzezz {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    private final zzcij zzh;

    public zzcje(zzcij zzcijVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcijVar;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(zzrVar);
        this.zzb = zzhfyVarZza2;
        zzhfy zzhfyVarZza3 = zzhfz.zza(str);
        this.zzc = zzhfyVarZza3;
        zzhgh zzhghVar = zzcijVar.zzK;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzekr(zzhghVar));
        this.zzd = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(new zzfax(zzcijVar.zzbg));
        this.zze = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(new zzezx(zzhfyVarZza, zzcijVar.zza, zzcijVar.zzR, zzhghVarZzc, zzhghVarZzc2, zzfcq.zza()));
        this.zzf = zzhghVarZzc3;
        this.zzg = zzhfx.zzc(new zzekz(zzhfyVarZza, zzhfyVarZza2, zzhfyVarZza3, zzhghVarZzc3, zzhghVarZzc, zzhghVarZzc2, zzcijVar.zzj, zzcijVar.zzT, zzhghVar));
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final zzeky zza() {
        return (zzeky) this.zzg.zzb();
    }
}
