package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcil implements zzcoa {
    private final zzcij zza;
    private zzezo zzb;
    private zzeyr zzc;
    private zzdbp zzd;
    private zzcva zze;

    public /* synthetic */ zzcil(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuw
    public final /* synthetic */ zzcuw zza(zzeyr zzeyrVar) {
        this.zzc = zzeyrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuw
    public final /* synthetic */ zzcuw zzb(zzezo zzezoVar) {
        this.zzb = zzezoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final /* bridge */ /* synthetic */ zzcoa zzc(zzdbp zzdbpVar) {
        this.zzd = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final /* bridge */ /* synthetic */ zzcoa zzd(zzcva zzcvaVar) {
        this.zze = zzcvaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuw
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzcob zzh() {
        zzhgg.zzc(this.zzd, zzdbp.class);
        zzhgg.zzc(this.zze, zzcva.class);
        return new zzcim(this.zza, new zzcsb(), new zzfdt(), new zzcuc(), new zzdsr(), this.zzd, this.zze, zzehe.zza(), null, this.zzb, this.zzc);
    }
}
