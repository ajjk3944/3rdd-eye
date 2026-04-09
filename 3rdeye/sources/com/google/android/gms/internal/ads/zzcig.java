package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcig implements zzdgt {
    private final zzcij zza;
    private zzezo zzb;
    private zzeyr zzc;
    private zzdbp zzd;
    private zzcva zze;
    private zzdgp zzf;
    private zzcok zzg;

    public /* synthetic */ zzcig(zzcij zzcijVar, zzcjn zzcjnVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final /* bridge */ /* synthetic */ zzdgt zzc(zzcok zzcokVar) {
        this.zzg = zzcokVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final /* bridge */ /* synthetic */ zzdgt zzd(zzdgp zzdgpVar) {
        this.zzf = zzdgpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final /* bridge */ /* synthetic */ zzdgt zze(zzdbp zzdbpVar) {
        this.zzd = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final /* bridge */ /* synthetic */ zzdgt zzf(zzcva zzcvaVar) {
        this.zze = zzcvaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuw
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdgu zzh() {
        zzhgg.zzc(this.zzd, zzdbp.class);
        zzhgg.zzc(this.zze, zzcva.class);
        zzhgg.zzc(this.zzf, zzdgp.class);
        zzhgg.zzc(this.zzg, zzcok.class);
        return new zzcih(this.zza, this.zzg, this.zzf, new zzcsb(), new zzfdt(), new zzcuc(), new zzdsr(), this.zzd, this.zze, zzehe.zza(), null, this.zzb, this.zzc);
    }
}
