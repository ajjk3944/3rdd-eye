package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzciw implements zzdte {
    private final zzcij zza;
    private final zzciz zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzciw(zzcij zzcijVar, zzciz zzcizVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
        this.zzb = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final /* bridge */ /* synthetic */ zzdte zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final /* bridge */ /* synthetic */ zzdte zzb(long j4) {
        this.zzc = Long.valueOf(j4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final zzdtf zzc() {
        zzhgg.zzc(this.zzc, Long.class);
        zzhgg.zzc(this.zzd, String.class);
        return new zzcix(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
