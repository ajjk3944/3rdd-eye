package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzciz implements zzdtn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    private final Context zze;
    private final zzblc zzf;
    private final zzcij zzg;
    private final zzciz zzh = this;

    public zzciz(zzcij zzcijVar, Context context, zzblc zzblcVar) {
        this.zzg = zzcijVar;
        this.zze = context;
        this.zzf = zzblcVar;
        zzhfy zzhfyVarZza = zzhfz.zza(this);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(zzblcVar);
        this.zzb = zzhfyVarZza2;
        zzdtj zzdtjVar = new zzdtj(zzhfyVarZza2);
        this.zzc = zzdtjVar;
        this.zzd = zzhfx.zzc(new zzdtl(zzhfyVarZza, zzdtjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdte zzb() {
        return new zzciw(this.zzg, this.zzh, null);
    }

    public final zzdti zzc() {
        return zzdtj.zzc(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdtk zzd() {
        return (zzdtk) this.zzd.zzb();
    }
}
