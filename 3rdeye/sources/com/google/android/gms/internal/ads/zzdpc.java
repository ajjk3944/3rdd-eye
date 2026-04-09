package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdpc {
    private final Context zza;
    private final zzavs zzb;
    private final zzbej zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbca zzf;
    private final zzcyo zzg;
    private final zzecd zzh;
    private final zzfcs zzi;
    private final zzdsc zzj;

    public zzdpc(zzcfr zzcfrVar, Context context, zzavs zzavsVar, zzbej zzbejVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbca zzbcaVar, zzcyo zzcyoVar, zzecd zzecdVar, zzfcs zzfcsVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzavsVar;
        this.zzc = zzbejVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbcaVar;
        this.zzg = zzcyoVar;
        this.zzh = zzecdVar;
        this.zzi = zzfcsVar;
        this.zzj = zzdscVar;
    }

    public final zzcfe zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbt zzfbtVar, zzfbw zzfbwVar) throws zzcfq {
        zzcgy zzcgyVarZzc = zzcgy.zzc(zzrVar);
        String str = zzrVar.zza;
        zzdor zzdorVar = new zzdor(this);
        zzecd zzecdVar = this.zzh;
        zzfcs zzfcsVar = this.zzi;
        zzdsc zzdscVar = this.zzj;
        com.google.android.gms.ads.internal.zza zzaVar = this.zze;
        zzbca zzbcaVar = this.zzf;
        return zzcfr.zza(this.zza, zzcgyVarZzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdorVar, zzaVar, zzbcaVar, zzfbtVar, zzfbwVar, zzecdVar, zzfcsVar, zzdscVar);
    }
}
