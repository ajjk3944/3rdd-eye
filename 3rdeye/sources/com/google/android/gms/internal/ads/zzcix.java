package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcix implements zzdtf {
    private final Long zza;
    private final String zzb;
    private final zzcij zzc;
    private final zzciz zzd;

    public zzcix(zzcij zzcijVar, zzciz zzcizVar, Long l5, String str) {
        this.zzc = zzcijVar;
        this.zzd = zzcizVar;
        this.zza = l5;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtp zza() {
        zzciz zzcizVar = this.zzd;
        return zzdtq.zza(this.zza.longValue(), zzcizVar.zze, zzcizVar.zzc(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtt zzb() {
        zzciz zzcizVar = this.zzd;
        return zzdtu.zza(this.zza.longValue(), zzcizVar.zze, zzcizVar.zzc(), this.zzc, this.zzb);
    }
}
