package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcjb implements zzdfx {
    private final zzcij zza;
    private zzezo zzb;
    private zzeyr zzc;
    private zzdbp zzd;
    private zzcva zze;
    private zzeiz zzf;

    public /* synthetic */ zzcjb(zzcij zzcijVar, zzcjn zzcjnVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final /* bridge */ /* synthetic */ zzdfx zzc(zzeiz zzeizVar) {
        this.zzf = zzeizVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final /* bridge */ /* synthetic */ zzdfx zzd(zzdbp zzdbpVar) {
        this.zzd = zzdbpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final /* bridge */ /* synthetic */ zzdfx zze(zzcva zzcvaVar) {
        this.zze = zzcvaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuw
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdfy zzh() {
        zzhgg.zzc(this.zzd, zzdbp.class);
        zzhgg.zzc(this.zze, zzcva.class);
        zzhgg.zzc(this.zzf, zzeiz.class);
        return new zzcjc(this.zza, new zzcsb(), new zzfdt(), new zzcuc(), new zzdsr(), this.zzd, this.zze, zzehe.zza(), this.zzf, null, this.zzb, this.zzc);
    }
}
