package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcjk implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcij zza;
    private zzcva zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzc;

    public /* synthetic */ zzcjk(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zza(zzcva zzcvaVar) {
        this.zzb = zzcvaVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzazVar) {
        this.zzc = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzc() {
        zzhgg.zzc(this.zzb, zzcva.class);
        zzhgg.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzaz.class);
        return new zzcjl(this.zza, this.zzc, new zzcsb(), new zzcuc(), new zzdsr(), this.zzb, null, null);
    }
}
